package ExceptionsSeminar3.Homework.Core.MVP;

import ExceptionsSeminar3.Homework.Core.FileWriter.FileManipulation;
import ExceptionsSeminar3.Homework.Core.Parse.Parse;
import ExceptionsSeminar3.Homework.Core.Validators.Validator;

public class Model {
    Parse parse = new Parse();
    FileManipulation file = new FileManipulation();

    public int checkValid(String enteredData) {
        Validator validator = new Validator(enteredData);
        return validator.checkValidCount();
    }

    public String parse(String data) {
        return parse.parse(data);
    }

    public String getFileName(String data) {
        return parse.getSurname(data);
    }

    public void setFileName(String fileName) {
        file.setFileName(fileName);
    }
    public boolean checkFile() {
        return file.checkFile();
    }

    public void createFile() {
        file.createFile();
    }
    public void writeInFile(String data) {
        file.appendNewUser(data);
    }
}
