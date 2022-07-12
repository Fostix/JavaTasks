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

    public static String solveMath(String solve) {
        String[] postfix = solve.split(" ");
        Stack<String> lifo = new Stack<>();



        for (String s : postfix) {
            switch (s) {
                case "+" -> lifo.push(String.valueOf(parseDouble(lifo.pop()) + parseDouble(lifo.pop())));
                case "-" -> //System.out.println(Math.round(Double.parseDouble(Double.toString(-Double.parseDouble(lifo.pop()) + Double.parseDouble(lifo.pop())))) + " dgfdfg");
                        lifo.push(String.valueOf(-parseDouble(lifo.pop()) + parseDouble(lifo.pop())));
                case "*" -> lifo.push(String.valueOf(parseDouble(lifo.pop()) * parseDouble(lifo.pop())));
                case "/" -> {
                    double temp = parseDouble(lifo.pop());
                    lifo.push(String.valueOf(parseDouble(lifo.pop()) / temp));
                }
                case "^" -> {
                    double temp;
                    temp = parseDouble(lifo.pop());
                    lifo.push(String.valueOf(Math.pow(parseDouble(lifo.pop()), temp)));
                }
                case "Sin" -> lifo.push(String.valueOf(Math.sin(parseDouble(lifo.pop()))));
                case "Cos" -> lifo.push(String.valueOf(Math.cos(parseDouble(lifo.pop()))));
                case "Tan" -> lifo.push(String.valueOf(Math.tan(parseDouble(lifo.pop()))));
                default -> lifo.push(s);
            }
        }
        solve = lifo.pop();
        return solve;
    }
}



