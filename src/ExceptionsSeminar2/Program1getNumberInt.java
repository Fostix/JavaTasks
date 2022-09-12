package ExceptionsSeminar2;

import java.util.Scanner;

public class Program1getNumberInt {
    public static void main(String[] args) {
        //System.out.println(getInt());
        System.out.println(recursiveGetInt());
    }

    private static int recursiveGetInt() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.print("Enter number: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You entered not numbered try again");
            recursiveGetInt();
        }
        return 0;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("You entered not number");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

