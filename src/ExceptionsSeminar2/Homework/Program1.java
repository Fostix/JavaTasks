package ExceptionsSeminar2.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
        System.out.println(getFloatOther());
    }

    public static float getFloat() {
        float num = 0;
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter float number: ");
                num = Float.parseFloat(in.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } while (flag);
        return num;
    }

    public static float getFloatOther() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("You entered not float number");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
