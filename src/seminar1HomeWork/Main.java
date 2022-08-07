package seminar1HomeWork;

import java.util.Scanner;

public class Main {
    public static Integer mrScaner(int number) {
        Scanner mrScanner = new Scanner(System.in);
        boolean flag = mrScanner.hasNextInt();
        if (flag) number = mrScanner.nextInt();
        mrScanner.close();

        return number;
    }

    public static void main(String[] args) {
        int number = -1;
        while (number < 1) {
            number = -1;
            System.out.printf("Enter positive number please: ");
            number = mrScaner(number);
            if (number < 1) System.out.println("Incorrect number, enter positive number!!!");
        }


        System.out.println(number * (number + 1) / 2);
    }
}
