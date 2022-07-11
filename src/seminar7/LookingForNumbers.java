package seminar7;

import java.util.ArrayList;


public class LookingForNumbers {
    private String expression;
    private ArrayList<Character> firstNumber;
    private char operation;
    private ArrayList<Character> secondNumber;
    private ArrayList<Character> thirdNumber;

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

    public void distributor() {
        expression.toCharArray();

        char[] symbols = expression.toCharArray();
        // TODO: 11/07/2022 how write in pole
        //System.out.printf("%s\n", symbols);
        for (int i = 0; i < symbols.length; i++) {
            boolean flag = true;
            if(noSpace(symbols[i])) {
                System.out.println("noSpace");
            } else {
                flag = false;
            }

            if(checkOperation(symbols[i])) {
                this.operation = symbols[i];
            }
        }






//        for (char symbol : symbols) {
//            boolean flag = true;
//            if (noSpace(symbol)) {
//                System.out.println("noSpace");
//                // need flag for remember which symbols write if them several digits!!
//            } else {
//                flag = false;
//            }
//
//            if (checkOperation(symbol)) {
//                this.operation = symbol; // mini constructor
//            }
//        }

    }

    @Override
    public String toString() {
        return String.format("%s, operation %c", this.expression, this.operation);
    }
}
