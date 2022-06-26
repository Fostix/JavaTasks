package seminar5Homework;

import java.util.Stack;

import static java.lang.Double.parseDouble;


public class Solve {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected static void solveMath(String solve) {
        String[] postfix = solve.split(" ");
        Stack<String> lifo = new Stack<>();



        for (String s : postfix) {
            if (isDigit(s)) {
                lifo.push(String.valueOf(Double.parseDouble(s)));
                System.out.println(lifo);
            }
            switch (s) {
                case "+":
                    lifo.push(String.valueOf(Double.parseDouble(lifo.pop()) + Double.parseDouble(lifo.pop())));
                    break;
                case "-":
                    //System.out.println(Math.round(Double.parseDouble(Double.toString(-Double.parseDouble(lifo.pop()) + Double.parseDouble(lifo.pop())))) + " dgfdfg");
                    lifo.push(String.valueOf(-Double.parseDouble(lifo.pop()) + Double.parseDouble(lifo.pop())));
                    break;
                case "*":
                    lifo.push(String.valueOf(Double.parseDouble(lifo.pop()) * Double.parseDouble(lifo.pop())));
                case "/":
                    double temp = parseDouble(lifo.pop());
                    lifo.push(String.valueOf(Double.parseDouble(lifo.pop()) / temp));
                    break;
                case "^":
                    temp = parseDouble(lifo.pop());
                    lifo.push(String.valueOf(Math.pow(Double.parseDouble(lifo.pop()), temp)));
                    break;
                case "Sin":
                    lifo.push(String.valueOf(Math.sin(Double.parseDouble(lifo.pop()))));
                    break;
                case "Cos":
                    lifo.push(String.valueOf(Math.cos(Double.parseDouble(lifo.pop()))));
                    break;
                case "Tan":
                    lifo.push(String.valueOf(Math.tan(Double.parseDouble(lifo.pop()))));
                    break;
                default:
                    break;
            }
        }
        System.out.println(lifo);
        //System.out.printf("%d\n", lifo.pop());
    }
}
        //System.out.println(result);
        //System.out.print(lifo);



