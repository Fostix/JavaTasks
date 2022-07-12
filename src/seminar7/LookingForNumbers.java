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

        for (var n : numbers) {
            System.out.print(n);
        }
        System.out.println();
        int length = numbers.length / 3;
        // temp in brain в уме!!
        int temp;

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i + 10])) {
                String result = solveExpression(numbers[i], invertOperation(operation), numbers[i + 10]);
                // быть внимательнее в методе такого типа нужно перед вызовом метода сделать реверс обязательно!!
                /// !!!!!
                // result then need check if negative number or more than ten!!
                System.out.println(result + " result");



                numbers[i + 20] = checkDigit(result);
                continue;

            } else if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i + 20])) {
                String result = solveExpression(numbers[i], invertOperation(operation), numbers[i + 20]);
                numbers[i + 10] = checkDigit(result);
                // numbers[i + 10] = result.charAt(0);

                continue;
            }  else if ((Character.isDigit(numbers[i]) && !Character.isDigit(numbers[i + 10])) && !Character.isDigit(numbers[i + 20]))  {
                numbers[i + 20] = numbers[i];
            } else if((Character.isDigit(numbers[i]) && !Character.isDigit(numbers[i + 10])) && Character.isDigit(numbers[i + 20])) {
                String result = solveExpression(numbers[i], operation, numbers[i + 20]);

                numbers[i + 10] = checkDigit(result);

            }







//            if (Character.isDigit(numbers[i])) {
//                System.out.println("is digit equal");
//            }
//            if (Character.isDigit(numbers[i + 10])) {
//                System.out.println("isDigit second");
//            }
//            if (Character.isDigit(numbers[i + 20])) {
//                System.out.println("is digit first");
//            }
//            System.out.println(numbers[i] + "equal"); // equal
//            System.out.println(numbers[i + 10] + "second"); // second
//            System.out.println(numbers[i + 20] + "first"); // first
        }
        for (char vvv: numbers) {
            System.out.print(vvv);
        }
        System.out.println();




    }

    @Override
    public String toString() {
//        String forCheck = "";
//        while (!firstNumber.isEmpty()) {
//            forCheck = String.valueOf(firstNumber.spliterator());
//            // firstNumber.
//            firstNumber.removeFirst();
//            System.out.println("here");
//        }
        return String.format("%s, operation %c", this.expression, this.operation);
    }
}
