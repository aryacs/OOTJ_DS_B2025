package CSE.DS.Comp.SocketProgramming;
import java.io.*;
import java.net.*;
public class EchoServerCommunication {
    public static void main(String[] args) {
        try {
            System.out.println("Server Started...");
            System.out.println("Waiting for Client...");
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = br.readLine();
            //send same string back to client
            PrintWriter pr = new PrintWriter(soc.getOutputStream(),true);
            pr.println("Server Says: " + str);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
