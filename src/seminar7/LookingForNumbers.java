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
                numbers[k] = symbols[i];
                k++;
            } else if(checkOperation(symbols[i]) || symbols[i] == '=') { // (!checkOperation(symbols[i]) && symbols[i + 1] == '=') || checkOperation(symbols[i + 1])
                j += 10;
                k = j;
            }
            if(checkOperation(symbols[i])) {
                this.operation = symbols[i];
            }
        }

//        for (var n : numbers) {
//            System.out.print(n);
//        }
        int length = numbers.length - 1;
        // temp in brain в уме!!
        int temp;

        for (int i = length; i >= 20; i--) { // до 20 чтобы не вышел за размеры массива
            // как то надо это настроить что бы складывало.
            if (Character.isDigit(numbers[i])) {
                System.out.println("is digit equal");
            }
            if (Character.isDigit(numbers[i - 10])) {
                System.out.println("isDigit second");
            }
            if (Character.isDigit(numbers[i - 20])) {
                System.out.println("is digit first");
            }
//            System.out.println(numbers[i] + "equal"); // equal
//            System.out.println(numbers[i - 10] + "second"); // second
//            System.out.println(numbers[i - 20] + "first"); // first
        }
        System.out.println(operation);



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
