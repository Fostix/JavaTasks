package seminar5Homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InfixToPostfixx {

    public static boolean isDigit(Character forCheck) throws NumberFormatException {
        try {
            Integer.parseInt(String.valueOf(forCheck));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



    static int operationTest(char forCheck) {
        return switch (forCheck) {
            case '+', '-' -> 0;
            case '*', '/' -> 1;
            case '^' -> 2;
            default -> -1;
        };

    }



    public static void infixToPostfix(String text) {
        Stack<Character> lifo = new Stack<>();
        Queue<Character> fifo = new LinkedList<>();

//        lifo.add('2');
//        lifo.add('g');
//        lifo.add('5');
//        lifo.add('y');
//        System.out.println(lifo.peek()); посмотреть
//        System.out.println(lifo.pop());   взять

        //System.out.println(lifo.);

        for (int i = 0; i < text.length(); i++) {

            Character symbol = text.charAt(i);


            if(operationTest(symbol) == -1) {
                fifo.add(symbol);
            }

            else if (operationTest(symbol) >= 0) {
                if(lifo.isEmpty() || lifo.peek() == '(') {
                    lifo.push(symbol); // add test!
                } else if (operationTest(symbol) > operationTest(lifo.peek())) {
                    lifo.push(fifo.poll());
                } else {
                    while (operationTest(symbol) <= operationTest(lifo.peek()) || lifo.peek() == '(') {
                        fifo.add(lifo.pop());
                    }
                }
            }


        }
        System.out.println(fifo);
        System.out.println(lifo);
    }
}
