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
        for (int i = 0; i < symbols.length; i++) {

            if((noSpace(symbols[i]) && !checkOperation(symbols[i])) && symbols[i] != '=') {
                numbers[29 - k] = symbols[i];
                k++;
            } else if(checkOperation(symbols[i]) || symbols[i] == '=') { // (!checkOperation(symbols[i]) && symbols[i + 1] == '=') || checkOperation(symbols[i + 1])
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
        int length = numbers.length - 1;
        // temp in brain в уме!!
        int temp;

        for (int i = length; i >= 20; i--) { // до 20 чтобы не вышел за размеры массива
            // как то надо это настроить что бы складывало.
            // if equal to second or first need invert operation use
            // else don't need
            // search where digit then use operation else every symbol question to can't solve
            // use Solve method infixToPostfix
            if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i - 10])) {
                // перевести в строку и сконкотенировать, и отправить решать другому классу(методу)
                String str = String.valueOf(numbers[i]);
                str = str += " " + invertOperation(operation) + " " + numbers[i -10];
                System.out.println(str + " str");
                String postfix = InfixToPostfix.infixToPostfix(str);
                String result = String.valueOf(Math.toIntExact(Math.round(Double.parseDouble(Solve.solveMath(postfix)))));
                // result then need check if negative number or more than ten!!
                System.out.println(result + " result");
                numbers[i - 20] = result.charAt(0);


            } else if (Character.isDigit(numbers[i]) && Character.isDigit(numbers[i - 20])) {
                String str = String.valueOf(numbers[i]);
                str = str += " " + invertOperation(operation) + " " + numbers[i - 20];
                String postfix = InfixToPostfix.infixToPostfix(str);
                String result = String.valueOf(Math.toIntExact(Math.round(Double.parseDouble(Solve.solveMath(postfix)))));
                // result then need check if negative number or more than ten!!
                numbers[i - 10] = result.charAt(0);
            }
            if (Character.isDigit(numbers[i])) {
                //System.out.println("is digit equal");
            }
            if (Character.isDigit(numbers[i - 10])) {
                //System.out.println("isDigit second");
            }
            if (Character.isDigit(numbers[i - 20])) {
                //System.out.println("is digit first");
            }
//            System.out.println(numbers[i] + "equal"); // equal
//            System.out.println(numbers[i - 10] + "second"); // second
//            System.out.println(numbers[i - 20] + "first"); // first
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
