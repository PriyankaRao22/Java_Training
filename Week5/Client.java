package Week5;

import java.net.Socket;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[]args) throws Exception{
        Scanner s =new Scanner(System.in);
        Socket svr=new Socket("localhost",2000);
       String str="Priyanka Rao\n";

        OutputStreamWriter ow=new OutputStreamWriter(svr.getOutputStream());
        PrintWriter out=new PrintWriter(ow);

            ow.write(str);
            ow.flush();

    }

}
