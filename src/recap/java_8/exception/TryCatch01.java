package recap.java_8.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatch01 {
    public static void main(String[] args) {
        //Before Java7
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //After Java7
        try (FileWriter fw2 = new FileWriter("file2.txt");
             FileWriter fw3 = new FileWriter("file2.txt")) {

            fw2.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
