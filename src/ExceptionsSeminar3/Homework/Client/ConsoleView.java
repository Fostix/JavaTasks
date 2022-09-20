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
        //return "уский текс привее 26.04.2022 m 891739545876";
        return "Mupa Pupa Lumpa 1.01.1111 m 891739545876";//scanner.nextLine();
    }


}
