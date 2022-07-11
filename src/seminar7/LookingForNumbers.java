package seminar7;


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

    public void distributor() {

        char[] symbols = expression.toCharArray();
        char[] numbers = new char[30];

        int j = 0;
        int k = 0;
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(k);


            if((noSpace(symbols[i]) && !checkOperation(symbols[i])) && symbols[i] != '=') {
                System.out.println(symbols);
                numbers[k] = symbols[i];
                k++;

            } else if(checkOperation(symbols[i]) || symbols[i] == '=') { // (!checkOperation(symbols[i]) && symbols[i + 1] == '=') || checkOperation(symbols[i + 1])
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
        }

        for (var n: numbers) {
            System.out.print(n);
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
