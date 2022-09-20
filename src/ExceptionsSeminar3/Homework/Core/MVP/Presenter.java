package ExceptionsSeminar3.Homework.Core.MVP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view) {
        this.model = new Model();
        this.view = view;
    }

    public void add() {

        while (true) {
            view.enter();
            String enteredUserData = view.readConsole();
            int result = model.checkValid(enteredUserData);
            if (result == -1)
                view.fewDataEntered();
            if (result == -2)
                view.moreDataEntered();
            String data = model.parse(enteredUserData);
            String fileName = model.getFileName(data);
            model.setFileName(fileName);
            if (model.checkFile()) {
                model.writeInFile(data);
            } else {
                model.createFile();
                model.writeInFile(data);
            }
        }
    }
}
