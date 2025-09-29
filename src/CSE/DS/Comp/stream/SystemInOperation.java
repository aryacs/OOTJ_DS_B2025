package CSE.DS.Comp.stream;
import java.io.*;
public class SystemInOperation {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a Data");
        int data = System.in.read();
        System.out.println("Entered Data: "+ (char)data);
        System.out.println("Entered Data: "+ data);

    }
}
