package seminar5Homework;
import java.util.Stack;

import static seminar5.CheckBracketsDequeMethod.isBrackets;

public class InfixToPostfix {

    private static int operationPriority(char symbol) {
        return switch (symbol) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            case 'S', 'C', 'T' -> 4;
            default -> 0;
        };
    }
    protected static String infixToPostfix(String infixText) {

        infixText = infixText.replace(" ", "");
        infixText = infixText.replace("Sin", "S");
        infixText = infixText.replace("sin", "S");
        infixText = infixText.replace("Cos", "C");
        infixText = infixText.replace("cos", "C");
        infixText = infixText.replace("Tan", "T");
        infixText = infixText.replace("tan", "T");
        infixText = infixText.replace("Pi", String.valueOf(Math.PI));

        StringBuilder result = new StringBuilder("");

        Stack<Character> lifo = new Stack<>();

        int lengthForCycle = infixText.length();



        for (int i = 0; i < lengthForCycle; i++) {
            Character item = infixText.charAt(i);

            if(Character.isDigit(item) || item == '.') {
                result.append(item);
            }

            else if (isBrackets(item, 1)) {
                if (i != 0)  result.append(" ");
                lifo.push(item);
            }

            else if (isBrackets(item, 2)) {
                while (!lifo.isEmpty() && !isBrackets(lifo.peek(), 1)) {
                    result.append(" ");
                    result.append(lifo.pop());
                }
                lifo.pop();
            }


            else {
                while (!lifo.isEmpty() &&
                        operationPriority(item) <= operationPriority(lifo.peek())) {
                    result.append(" ");
                    result.append(lifo.pop());
                }result.append(" ");
                lifo.push(item);
            }


        }

        while (!lifo.isEmpty()) {
            if(isBrackets(lifo.peek(), 1)) return "Invalid expression!";
            result.append(" ");
            result.append(lifo.pop());
        }
        result = new StringBuilder(result.toString().replace("S", "Sin "));
        result = new StringBuilder(result.toString().replace("C", "Cos "));
        result = new StringBuilder(result.toString().replace("T", "Tan "));
        result = new StringBuilder(result.toString().replaceAll("\\s+", " "));

        return result.toString();


    }




}
