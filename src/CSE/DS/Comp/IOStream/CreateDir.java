package CSE.DS.Comp.IOStream;
import java.io.File;
import java.net.SocketOption;

public class CreateDir {
        public static void main(String args[]) {
            String dirname = "F:\\Dir";
            File d = new File(dirname);
            // Create directory now.
            d.mkdirs();
            System.out.println("Dir");
        }
    }
