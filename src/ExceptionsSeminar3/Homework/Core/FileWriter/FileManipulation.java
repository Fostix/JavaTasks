package ExceptionsSeminar3.Homework.Core.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static ExceptionsSeminar3.Homework.Core.FileWriter.WayStorage.WAY_FILE;

public class FileManipulation {
    private File file;

    public void setFileName(String fileName) {
        this.file = new File(WAY_FILE + fileName);
    }

    public boolean checkFile() {
        return file.isFile();
    }

    public void createFile() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendNewUser(String data) {
        try (FileWriter writer = new FileWriter(file , true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
