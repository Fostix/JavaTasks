package ExceptionsSeminar3.Homework.Client;

import ExceptionsSeminar3.Homework.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    @Override
    public void enter() {
        System.out.print("Enter your information FIO, date bern, gender, phone number: ");
    }

    @Override
    public String readConsole() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public void fewDataEntered() {
        System.out.println("Less data entered than required try again");
    }

    @Override
    public void moreDataEntered() {
        System.out.println("More data entered than required try again");
    }
}
