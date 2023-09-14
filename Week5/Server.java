package Week5;


import java.net.Socket;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[]args) throws Exception {
        System.out.println("Server started");
        ServerSocket svr = new ServerSocket(2000);
        System.out.println("Server is waiting for connection");
        Socket s1 = svr.accept();
        System.out.println("client is connected");


        BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        String str;
       while((str=br.readLine())!=null) {
           System.out.println("Client dataa:"+str);
       }

    }

    }



