package CSE.DS.Comp.SocketProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerPC {
    public static void main(String[] args) {
        System.out.println("Server Started...");
        System.out.println("Waiting for Client...");
        try {
            ServerSocket ss = new ServerSocket(8055);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = br.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server says: " + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
