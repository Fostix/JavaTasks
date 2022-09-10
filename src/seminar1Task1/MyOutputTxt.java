package seminar1Task1;

import java.io.FileWriter;
import java.io.IOException;

public class MyOutputTxt {
    public static void WriterMethod(String writeMe) {
        try(FileWriter fw = new FileWriter("src/seminar1Task1/txtFiles/output.txt", false)) {
            fw.write(writeMe);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
