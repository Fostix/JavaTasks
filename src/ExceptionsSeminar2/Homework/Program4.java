package ExceptionsSeminar2.Homework;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        checkForEmptyString();
        checkForEmptyStringM();
    }
    public static void checkForEmptyString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        if (text.isEmpty())
            throw new RuntimeException("you can't enter blank lines");
    }

    public static void checkForEmptyStringM() {
        String text = null;
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                flag = false;
            }
        }
        if (flag) {
            throw new RuntimeException("you can't enter blank lines");
        }
    }
}
