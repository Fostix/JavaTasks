package ExceptionsSeminar2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

    }

    public static int method() {
        Scanner scanner = new Scanner(System.in);
        String num;
        String beNumber = "";
        int count = 0;
        do {
            beNumber = scanner.nextLine();
            count++;
        } while (isDigitString(beNumber));
        if (count > 1) {
            System.out.println("not");
        }
        return 2;
    }

    public static boolean isDigitString(String foCheck) {
        if (foCheck.isEmpty()) {
            return false;
        }
        for (char c : foCheck.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

