import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("source.txt");       // source text file
            fw = new FileWriter("destination.txt");  // destination text file

            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }

            System.out.println("File copied successfully using character streams.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
