package seminar7;


import seminar5Homework.InfixToPostfix;
import seminar5Homework.Solve;

public class LookingForNumbers {
    private String expression;
    private char operation;

    public LookingForNumbers(String expression) {
        this.expression = expression;
        distributor();
    }

    private String solveExpression(char firstNumber, char operation, char secondNumber) {

        String str = String.valueOf(firstNumber);
        str = str += " " + operation + " " + secondNumber;
        String postfix = InfixToPostfix.infixToPostfix(str);
        String result = String.valueOf(
                Math.toIntExact(
                        Math.round(
                                Double.parseDouble(
                                        Solve.solveMath(
                                                postfix)))));
        return result;
    }


    private char checkDigit(String forCheck) {
        char result;
        if (Character.isDigit(forCheck.charAt(0))) {
            result = forCheck.charAt(0);
        } else {
            result = forCheck.charAt(1);
        }

        return result;
    }



    private boolean checkOperation(char forCheck) {
        switch (forCheck) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
            default:
                return false;
        }
    }

    private boolean noSpace(char forCheckOnSpace) {
        switch (forCheckOnSpace) {
            case ' ':
                return false;
            default:
                return true;
        }
    }

    private char invertOperation(char forCheck) {
        switch (forCheck) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '/':
                return '*';
            default:
                return '/';
        }
    }


    public void distributor() {
        char[] symbols = expression.toCharArray();
        char[] numbers = new char[30];
        int j = 0;
        int k = 0;
        for (int i = symbols.length - 1; i >= 0; i--) {

            if((noSpace(symbols[i]) && !checkOperation(symbols[i])) && symbols[i] != '=') {
                numbers[k] = symbols[i];
                k++;
            } else if(checkOperation(symbols[i]) || symbols[i] == '=') {
                j += 10;
                k = j;
            }
            if(checkOperation(symbols[i])) {
                this.operation = symbols[i];
            }
        }
        int length = numbers.length / 3;

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i + 10])) {
                String result = solveExpression(numbers[i], invertOperation(operation), numbers[i + 10]);
                // быть внимательнее в методе такого типа нужно перед вызовом метода сделать реверс обязательно!!
                /// !!!!!
                // result then need check if negative number or more than ten!!

                numbers[i + 20] = checkDigit(result);
                continue;

            } else if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i + 20])) {
                String result = solveExpression(numbers[i], invertOperation(operation), numbers[i + 20]);
                numbers[i + 10] = checkDigit(result);

                continue;
            }  else if ((Character.isDigit(numbers[i]) && !Character.isDigit(numbers[i + 10])) && !Character.isDigit(numbers[i + 20]))  {
                numbers[i + 20] = numbers[i];
            } else if((Character.isDigit(numbers[i]) && !Character.isDigit(numbers[i + 10])) && Character.isDigit(numbers[i + 20])) {
                String result = solveExpression(numbers[i], operation, numbers[i + 20]);

                numbers[i + 10] = checkDigit(result);

            }
        }




        String firstNumber = "";
        String secondNumber = "";
        String equal = "";


        for (int i = 0; i < length; i++) {
            if (Character.isDigit(numbers[i])) {
                equal = numbers[i] + equal;
            } if (Character.isDigit(numbers[i + 10])) {
                secondNumber = numbers[i + 10] + secondNumber;
            } if (Character.isDigit(numbers[i + 20])) {
                firstNumber = numbers[i + 20] + firstNumber;
            }

        }
        expression += "\n" + Integer.parseInt(firstNumber) + " " + operation + " " + Integer.parseInt(secondNumber) + " = " + Integer.parseInt(equal);

    }

    @Override
    public String toString() {
        return String.format("%s", this.expression);
    }
}
