package seminar5Homework;

import java.io.PrintStream;

import static seminar5.CheckBracketsDequeMethod.checkBrackets;

public class Main {

    public static void main(String[] args) {

        long timer = System.nanoTime();

        String infix = "(2^3 * (10 / (5 - 3)))^(Sin(Pi))";
        String postfix = null;
        String result = null;
        if (checkBrackets(infix)) {
            postfix = InfixToPostfix.infixToPostfix(infix);
            result = Solve.solveMath(postfix);
        }

        System.out.printf("infix: %s\npostfix: %s \nresult %s\nprocess time: %d \n", infix, postfix, result, -timer + System.nanoTime()); // StringBuilder faster than String!!

        System.out.println("----------------------------------------------------------------");


        infix = "(10.8-3.4)*2.3445";

        if (checkBrackets(infix)) {
            postfix = InfixToPostfix.infixToPostfix(infix);
            result = Solve.solveMath(postfix);
        }


        System.out.printf("infix: %s\npostfix: %s \nresult %s\n", infix, postfix, result); // StringBuilder faster than String!!


        System.out.println("----------------------------------------------------------------");

        infix = "(34.2343+2343.34)^sin(2)";

        if (checkBrackets(infix)) {
            postfix = InfixToPostfix.infixToPostfix(infix);
            result = Solve.solveMath(postfix);
        }


        System.out.printf("infix: %s\npostfix: %s \nresult %s\n", infix, postfix, result); // StringBuilder faster than String!!


        System.out.println("----------------------------------------------------------------");

        infix = "2 + 2";

        if (checkBrackets(infix)) {
            postfix = InfixToPostfix.infixToPostfix(infix);
            result = Solve.solveMath(postfix);
        }


        System.out.printf("infix: %s\npostfix: %s \nresult %s\n", infix, postfix, result); // StringBuilder faster than String!!

        Integer check = Math.toIntExact(Math.round(Double.parseDouble(result)));
        System.out.println(check instanceof Integer);

    }
}
// Реализовать алгоритм перевода из инфиксной записи
// в постфиксную для арифметического выражения.
