package CSE.DS.Comp.SocketProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        System.out.println("Server Started...");
        System.out.println("Waiting for Client");
        try{
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int num = Integer.parseInt(br.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Factorial of a Number is: "+ calculateFactorial(num));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static int calculateFactorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
