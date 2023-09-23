package Exercise3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Peer {
    //protoc --java_out=. msgFormat.proto

    public static int my_id;

    //public static ClientGUI gui;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Assumptions:");
        System.out.println("-my_id must be unique for all peers");
        System.out.println("-peer can be connected to only if online");
        System.out.println("Usage: [my port] [my id] [peer1 ip] [peer1 port] [peer2 ip] [peer2 port] ...");
        System.out.println("e.g. TEST:");
        System.out.println("-peer0 input: 8080 0");
        System.out.println("-peer1 input: 8081 1 127.0.0.1 8080");
        System.out.println("-peer2 input: 8082 2 127.0.0.1 8081");
        System.out.println("-peer3 input: 8083 3 127.0.0.1 8080 127.0.0.1 8082");
        System.out.println("-peer4 input: 8084 4 127.0.0.1 808x 127.0.0.1 808x 127.0.0.1 808x 127.0.0.1 808x");
        System.out.print("Input:");
        String arg = input.nextLine();
        String[] tokens = arg.trim().split(" ");
        int my_port = Integer.parseInt(tokens[0]);
        my_id = Integer.parseInt(tokens[1]);

        Client client = new Client();

        for(int i=2; i<tokens.length;i+=2){
            String peer_ip= tokens[i];
            int peer_port= Integer.parseInt(tokens[i+1]);
            Socket peer_server = null;
            try{
                System.out.println("Connecting to peer: " + peer_ip + ":" + peer_port + " ...");
                //Socket connection = new Socket(InetAddress.getByName(null),port);
                peer_server = new Socket(peer_ip, peer_port);
                OutputStream out =  peer_server.getOutputStream();
                InputStream in =  peer_server.getInputStream();

                //start HANDSHAKE: exchange ids
                HandshakeMessage handshake = HandshakeMessage.newBuilder().setId(my_id).setError(false).build();
                handshake.writeDelimitedTo(out);

                HandshakeMessage handshakeReply = HandshakeMessage.parseDelimitedFrom(in);
                int peer_id = handshakeReply.getId();

                Client.addPeer(peer_id,out);
                new Server(peer_id,peer_server);

            }catch(Exception e){System.out.println("Peer with :ip="+peer_ip + " port=" + peer_port+" is offline");}
        }

        try {
            ServerSocket server = new ServerSocket(my_port);

            System.out.println("waiting connections to " + InetAddress.getByName((String) null) + ":" + my_port + " ...");
            while (true) {
                Socket peer_client = server.accept();
                System.out.println("peer" + " connected: " + peer_client);
                OutputStream out =  peer_client.getOutputStream();
                InputStream in =  peer_client.getInputStream();

                //reply HANDSHAKE: exchange ids
                HandshakeMessage handshakeReply = HandshakeMessage.parseDelimitedFrom(in);
                int peer_id = handshakeReply.getId();

                HandshakeMessage handshake = HandshakeMessage.newBuilder().setId(my_id).setError(false).build();
                handshake.writeDelimitedTo(out);

                Client.addPeer(peer_id,out);
                new Server(peer_id,peer_client);
                //nClients++;
            }
        }catch(Exception e){e.printStackTrace();}
    }
}

class Client{

    static HashMap<Integer,OutputStream> peers = new HashMap<>();
    public static ClientGUI gui;
    public Client() {
        //START GUI
        gui = new ClientGUI(Peer.my_id);
        System.out.println("Client ready");
    }

    public static void sendMessage(int from , int to, String message, int sender, String msgid) {
        try {
            Message msg = Message.newBuilder().setFr(from).setTo(to).setMsg(message).setSender(Peer.my_id).setMsgid(msgid).build();
            if(Client.peers.containsKey(to)) {
                msg.writeDelimitedTo(Client.peers.get(to));
            }else{//BROADCAST
                for(Integer key: Client.peers.keySet()) {
                    if(sender != key) { //TO AVOID INFINITE LOOPS
                        System.out.println(" ..BROADCASTING to Peer"+key);
                        msg.writeDelimitedTo(Client.peers.get(key));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void addPeer(int id,OutputStream out){
        Client.peers.put(id,out);
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
                String fullMsg = this.gui.messageText.getText().trim();
                this.gui.appendMessage("->"+fullMsg);
                String[] tokens = fullMsg.split(" ");
                int to = Integer.parseInt(tokens[0]);
                if(to!=Peer.my_id) {
                    String message = fullMsg.substring(tokens[0].length() + 1);

                    //sender is the last peer id, will be needed to avoid loops
                    //msgid will be needed to prevent duplication
                    Random random = new Random();
                    //string concatenation of id timestamp random
                    String msgid = "420" + Peer.my_id + System.nanoTime() + random.nextInt(6969);

                    System.out.println("Peer" + Peer.my_id + "(you): msg=" + message + " to=" + to+ " sender="+Peer.my_id+" msgId=" +msgid);
                    Client.sendMessage(Peer.my_id, to, message, Peer.my_id, msgid);
                }
            }
        }
    }
}

class Server extends Thread {
    Random random = new Random();
    static HashMap<Integer,OutputStream> clients = new HashMap<>();
    static HashSet<String> oldMessages = new HashSet<>(); //to check msgId for duplicates

    //static HashMap<Integer, ArrayList<Message>> clientsBufferedMessages = new HashMap<>();
    Socket client = null;
    int peer_id;//this thread will receive messages only from this peer;

    //BufferedReader in = null;
    InputStream in = null;
    //PrintWriter out = null;
    OutputStream out = null;
    static int nClientsConnected=0;

    Server(int peer_id, Socket client) throws IOException {
        this.peer_id = peer_id;
        this.client = client;
        this.in = client.getInputStream();
        this.out = client.getOutputStream();
        Server.clients.put(peer_id,this.out);
        nClientsConnected+=1;
        this.start();
    }
    public void run() {
        String msg = "";
        try{
            while (true) {
                //msg = in.readLine();

                Message protomsg = Message.parseDelimitedFrom(this.in);
                int to= protomsg.getTo(); //destination
                int from= protomsg.getFr(); //original sender
                msg= protomsg.getMsg();
                int sender = protomsg.getSender(); //last hop
                String msgId = protomsg.getMsgid();

                System.out.println("Peer" + from + ": msg=" + msg + " to=" + to+ " sender="+sender+" msgId=" +msgId);

                //To

                if(!Server.oldMessages.contains(msgId)) {
                    Server.oldMessages.add(msgId);

                    if (to == Peer.my_id) {
                        Client.gui.appendMessage("<-" + from + " " + msg);
                    } else {//FORWARD
                        if (from != Peer.my_id) {
                            System.out.println(" ..FORWARDING for Peer" + from);
                        }
                        Client.sendMessage(from, to, msg, sender, msgId);
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{client.close();}catch(IOException e){e.printStackTrace();}
            System.out.println("Connection with client"+this.peer_id+" terminated.");
            Server.clients.remove(this.peer_id);
            nClientsConnected-=1;
        }
    }
}

