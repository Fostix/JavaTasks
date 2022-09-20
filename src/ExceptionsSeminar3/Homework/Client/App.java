package ExceptionsSeminar3.Homework.Client;

import ExceptionsSeminar3.Homework.Core.MVP.Presenter;
import ExceptionsSeminar3.Homework.Core.MVP.View;

public class App {
    private Presenter presenter;

    public App(View view) {
        this.presenter = new Presenter(view);
    }

    public void start() {
        presenter.add();
        while (true) {

        }
    }
}
