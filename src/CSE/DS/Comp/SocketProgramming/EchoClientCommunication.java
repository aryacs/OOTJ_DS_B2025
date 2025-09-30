package CSE.DS.Comp.SocketProgramming;
import java.io.*;
import java.net.*;
public class EchoClientCommunication {
    public static void main(String[] args) {
        System.out.println("Client Started...");
        try {
            //localhost->127.0.0.1
            //port range from 0 to 65535| Reserved ports 0-1023
            Socket soc = new Socket("localhost",9999);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String");
            String str = br.readLine();
            PrintWriter pr = new PrintWriter(soc.getOutputStream(), true);
            //out.flush(); if not use true
            pr.println(str);
            //Read data from Socket Stream Reader
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
