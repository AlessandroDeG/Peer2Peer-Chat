package Exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

class Client {
    public static OutputStream out;
    public static InputStream in;

    public static ClientGUI gui;
    static int id =-1;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String serverAddress = "127.0.0.1";
        int port = 8080;

        System.out.println("Connecting to server: " + InetAddress.getByName(null) + ":" + port + " ...");
        //Socket connection = new Socket(InetAddress.getByName(null),port);
        Socket server = new Socket(serverAddress, port);

        try {
            System.out.println("connected to: " + server);
            out = server.getOutputStream();
            in = server.getInputStream();

            //HANDSHAKE

            boolean error = true;

            while (error == true) {
                System.out.print("Input your id: ");
                id = input.nextInt();
                HandshakeMessage handshake = HandshakeMessage.newBuilder().setId(id).setError(false).build();
                handshake.writeDelimitedTo(out);

                HandshakeMessage handshakeReply = HandshakeMessage.parseDelimitedFrom(in);
                id = handshakeReply.getId();
                error = handshakeReply.getError();

                if (error == false) {
                    System.out.println("Your id is:" + id);
                    //confirm id was received
                    handshakeReply.writeDelimitedTo(out);
                } else {
                    System.out.println("Error, id=" + id + " might be already in use:");
                }
            }

            //START GUI
            gui = new ClientGUI(id);

            while (true) {
                Message recievedMsg = Message.parseDelimitedFrom(in);
                int from = recievedMsg.getFr();
                String received = recievedMsg.getMsg();
                gui.appendMessage(from+" "+received);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("closing...");
            server.close();
        }
    }

    public static void sendMessage(int to, String message) {
        try {
            Message msg = Message.newBuilder().setFr(id).setTo(to).setMsg(message).build();
            msg.writeDelimitedTo(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class ClientGUI{
    JTextArea messagesArea;
    JTextField messageText;
    JFrame frame;
    public ClientGUI(int id){
        this.frame = new JFrame("ChatClient"+id);

        JPanel mainPanel = new JPanel();

        int panelSizeX=400;
        int panelSizeY=300;
        mainPanel.setPreferredSize(new Dimension(panelSizeX,panelSizeY));

        messageText = new JTextField("0 Hello",15);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new ClickListener(this));
        this.messagesArea = new JTextArea(15, 30);
        messagesArea.setEditable(false);
        mainPanel.add(messageText);
        mainPanel.add(sendButton);
        JScrollPane scroll = new JScrollPane(messagesArea);
        mainPanel.add(scroll);

        frame.add(mainPanel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        appendMessage("HISTORY:");
        frame.pack();

    }

    public void appendMessage(String message){

        this.messagesArea.append(message+"\n");
        frame.invalidate();
        frame.validate();
        frame.repaint();
        frame.pack();

    }

    public class ClickListener implements ActionListener {
        ClientGUI gui;
        public ClickListener(ClientGUI gui){
            this.gui = gui;
        }
        public final void actionPerformed(ActionEvent e){
            String fullMsg = this.gui.messageText.getText();
            this.gui.appendMessage(fullMsg);
            String[] tokens = fullMsg.split(" ");
            String to = tokens[0];

            String message = fullMsg.substring(tokens[0].length() + 1);
            Client.sendMessage(Integer.parseInt(to), message);

        }
    }

}