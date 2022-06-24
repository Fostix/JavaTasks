package seminar5Homework;


import java.util.Stack;

public class InfixToPostfix {
    static int operationTest(char forCheck) {
        return switch (forCheck) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static StringBuilder infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();

        Stack<Character> lifo = new Stack<>();

        for (int i = 0; i < expression.length(); ++i) {
            char symbol = expression.charAt(i);

            if (Character.isLetterOrDigit(symbol)) result.append(symbol);

            else if (symbol == '(') lifo.push(symbol);

            else if (symbol == ')') {
                while (!lifo.isEmpty() && lifo.peek() != '(') {
                    result.append(lifo.pop());
                }

                lifo.pop();
            }

            else {
                while (!lifo.isEmpty() && operationTest(symbol) <= operationTest(lifo.peek())) {
                    result.append(lifo.pop());
                }
                lifo.push(symbol);
            }


        }

        while(!lifo.isEmpty()) {
            if(lifo.peek() == '(') {
                return new StringBuilder("can't");
            }
            result.append(lifo.pop());
        }
        return result;
    }
}
