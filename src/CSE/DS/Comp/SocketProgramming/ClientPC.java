package CSE.DS.Comp.SocketProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class ClientPC {
    public static void main(String[] args) {
        System.out.println("Client Started...");
        try {
            Socket soc = new Socket("localhost", 8055);
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Enter a String");
            String str = br.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            //out.flush();
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
