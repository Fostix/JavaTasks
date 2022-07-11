package seminar7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


public class LookingForNumbers {
    private String expression;
    //private Deque<Character> firstNumber = new ArrayDeque<>();
    private char operation;
    //private ArrayList<Character> secondNumber = new ArrayList<>();
    //private ArrayList<Character> thirdNumber = new ArrayList<>();

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

        char[] symbols = expression.toCharArray();

//        ArrayList<ArrayList<Character>> numbers = new ArrayList<>();
//
//        ArrayList<Character> firstNumbers = new ArrayList<>();
//        ArrayList<Character> secondNumbers = new ArrayList<>();
//        ArrayList<Character> thirdNumbers = new ArrayList<>();

        // char[][] numbers = new char[2][4];
        char[] numbers = new char[30];

        int j = 0;
        int k = 0;
        for (int i = 0; i < symbols.length; i++) {
            // if space 0 and i++;
            System.out.println(k);


            if((noSpace(symbols[i]) && !checkOperation(symbols[i])) && symbols[i] != '=') {
                //numbers[j][i] = symbols[i];
                System.out.println(symbols);
                numbers[k] = symbols[i];
                k++;

            } else if(checkOperation(symbols[i]) || symbols[i] == '=') { // (!checkOperation(symbols[i]) && symbols[i + 1] == '=') || checkOperation(symbols[i + 1])
//                if (symbols[i - 1] == '=') {
//                    j -= 10;
//                }
                j += 10;
                k = j;
                System.out.println(k);
            }
            if(checkOperation(symbols[i])) {
                this.operation = symbols[i];
            }
            System.out.println(i + "   - i");
            System.out.println(j + "   - j");
            System.out.println(k + "   - k");

            //System.out.println(numbers);
        }

        for (var n: numbers) {
            System.out.print(n);
        }
        System.out.println();





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
