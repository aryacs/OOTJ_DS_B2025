package CSE.DS.Comp.SocketProgramming;
import java.io.*;
import java.net.Socket;
public class FactorialClient {
    public static void main(String[] args) {
        System.out.println("Client Started...");
        try{
            Socket soc = new Socket("localhost",9999);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            //send this num to server
            PrintWriter pr = new PrintWriter(soc.getOutputStream(), true);
            pr.println(num);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
