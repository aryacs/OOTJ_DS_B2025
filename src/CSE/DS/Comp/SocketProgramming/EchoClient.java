package CSE.DS.Comp.SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client Started...");
        try {
            //localhost->127.0.0.1
            //port range from 0 to 65535| Reserved ports 0-1023
            Socket soc = new Socket("localhost",9999);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
