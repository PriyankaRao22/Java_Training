package Week5;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class NewClient {
    public static void main(String[]args) throws Exception{
        Scanner s =new Scanner(System.in);
        Socket svr=new Socket("localhost",12345);
        OutputStreamWriter ow=new OutputStreamWriter(svr.getOutputStream());
        PrintWriter out=new PrintWriter(ow);

       //String str="Hello \n";   or
       // ow.write(str);
       String str=s.next();
        ow.write(str+"\n");
        ow.flush();

    }

}

