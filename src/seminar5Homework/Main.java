package seminar5Homework;
import static seminar5.CheckBracketsDequeMethod.checkBrackets;

public class Main {
    public static void main(String[] args) {


        System.out.println(Math.pow(2, 3));


        long timer = System.nanoTime();

        String infix = "(2^3 * (10 / (5 - 3)))^(Sin(Pi))";


        if (checkBrackets(infix)) {
            String postfix = InfixToPostfix.infixToPostfix(infix);
            System.out.println(postfix);
            Solve.solveMath(postfix);
        }

        System.out.println(-timer + System.nanoTime()); // StringBuilder faster than String!!




    }
}
// Реализовать алгоритм перевода из инфиксной записи
// в постфиксную для арифметического выражения.
