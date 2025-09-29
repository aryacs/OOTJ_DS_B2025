package CSE.DS.Comp.stream;
import java.io.*;
public class ReadFileOperations {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("input.txt");
            fos = new FileOutputStream("output.txt");
            int temp;
            while ((temp = fis.read())!= -1)
                System.out.println(temp);
                fos.write((byte)temp);
        }catch(IOException e){
    }
        finally {
            if (fis != null)
            fis.close();
            if (fos != null)
                fos.close();
        }
        }
}
