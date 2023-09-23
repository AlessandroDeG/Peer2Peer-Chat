package Exercise2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Server extends Thread {
    Random random = new Random();
    static HashMap<Integer,OutputStream> clients = new HashMap<>();
    static HashMap<Integer, ArrayList<Message>> clientsBufferedMessages = new HashMap<>();
    int id;
    Socket client = null;
    //BufferedReader in = null;
    InputStream in = null;
    //PrintWriter out = null;
    OutputStream out = null;
    static int nClientsConnected=0;
    Server(Socket client) throws IOException{
        //this.id = id;
        this.client = client;
        //this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        //this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
        this.out = client.getOutputStream();
        this.in = client.getInputStream();

        //Server.clients.put(id,this.out);

        nClientsConnected+=1;
        this.start();
    }
    public void run() {
        String msg = "";
        boolean error=true;
        try {
            while(error==true) {
                HandshakeMessage handshake = HandshakeMessage.parseDelimitedFrom(in);
                this.id = handshake.getId();

                if (!Server.clients.containsKey(id)) {
                    //ECHO
                    handshake.writeDelimitedTo(out);
                    error=false;

                    handshake = HandshakeMessage.parseDelimitedFrom(in);

                    System.out.println("Client confirmed id "+handshake.getId());
                    Server.clients.put(this.id,this.out);

                }
                else{
                    System.out.println("id=" + this.id + " already in use");
                    HandshakeMessage handshakeError = HandshakeMessage.newBuilder().setId(id).setError(true).build();
                    handshakeError.writeDelimitedTo(out);
                }
            }

            //wait client gui start
            HandshakeMessage.parseDelimitedFrom(in);
            System.out.println("Client"+id+" is ready");

            if(!Server.clientsBufferedMessages.containsKey(id)){
                Server.clientsBufferedMessages.put(id,new ArrayList<>());
            }else {

                System.out.println("Buffered messages : " + Server.clientsBufferedMessages.get(id).size());
                for (Message message : Server.clientsBufferedMessages.get(id)) {

                    System.out.println("Sending buffered messages: Client" + message.getFr() + " sent : " + message.getMsg() + ": to :" + message.getTo());
                    message.writeDelimitedTo(Server.clients.get(message.getTo()));
                }
                Server.clientsBufferedMessages.get(id).clear();
            }

            while (true) {
                //msg = in.readLine();

                Message protomsg = Message.parseDelimitedFrom(in);
                int to= protomsg.getTo();
                int from= protomsg.getFr();
                msg= protomsg.getMsg();

                System.out.println("Client" + from + " sent : " + msg + ": to :" + to);
                //System.out.println("Client" + from + " sent : " + msg + " to Client"+ to);

                //out.println(msg);
                //ECHO
                //protomsg.writeDelimitedTo(out);

                //To
                if(Server.clients.containsKey(to)) {
                    protomsg.writeDelimitedTo(Server.clients.get(to));
                }else{//BUFFER MESSAGES
                    if(!Server.clientsBufferedMessages.containsKey(to)){
                        Server.clientsBufferedMessages.put(to,new ArrayList<>());
                    }
                    Server.clientsBufferedMessages.get(to).add(protomsg);
                    System.out.println("buffered:" + Server.clientsBufferedMessages.get(to).size());
                }

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{client.close();}catch(IOException e){e.printStackTrace();}
            System.out.println("Connection with client"+this.id+" terminated.");
            Server.clients.remove(this.id);
            nClientsConnected-=1;
        }
    }

    public static void main(String[] args) throws IOException{
        int port = 8080;
        //int nClients=0;

        ServerOperator serverOperator = new ServerOperator();
        ServerSocket server = new ServerSocket(port);

        System.out.println("Type num_users to see the number of clients currently connected");

        System.out.println("waiting connections to " + InetAddress.getByName((String) null) + ":" + port + " ...");
        while(true) {
            Socket client = server.accept();
            System.out.println("client"+" connected: " + client);
            new Server(client);
            //nClients++;
        }
    }
}

class ServerOperator extends Thread{
    Scanner input = new Scanner(System.in);
    public ServerOperator(){
        this.start();
    }

    public void run(){
        while(true){
            String command=input.nextLine();
            if(command.equals("num_users")){
                System.out.println("Number of users connected = "+Server.nClientsConnected);
            }
        }
    }
}