import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("silksong.jpg");      // source file
            fos = new FileOutputStream("songsilk.jpg"); // destination file

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully using byte streams.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

