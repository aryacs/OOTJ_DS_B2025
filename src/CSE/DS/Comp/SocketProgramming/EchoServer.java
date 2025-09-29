package CSE.DS.Comp.SocketProgramming;
import java.net.ServerSocket;
import java.net.Socket;
public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server Started...");
            System.out.println("Waiting for Client...");
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
        }catch(Exception e) {
            e.printStackTrace();
        }
        }
}
