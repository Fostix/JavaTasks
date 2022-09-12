package ExceptionsSeminar2.Homework;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        getFloat();
    }
    public static void getFloat() {
        String text = null;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                text = scanner.nextLine();
                System.out.println(text.length());
            } catch (Exception e) {
                System.out.println(" " + e.getClass().getSimpleName());
            }
        } while (text.isEmpty());
    }
}
