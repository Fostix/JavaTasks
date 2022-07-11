package seminar7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Main {
    // Проверять поразрядно

    private static String checkOperationAndReplace(String s) {
        switch (s) {
            case "+":
                return "-";
                //return "df"; // TO DO if minus to change equals in plus!!!
                //break;
            case "-":
                return "+";

        }
        return s;
    }

    private static Deque<String> parseString(String expression) {
        String[] elem = expression.split(" ");

        Deque<String> dq = new ArrayDeque<>();

        for (int i = elem.length - 1; i > -1; i--) {
            dq.add(elem[i]);
        }

        return dq;
    }


    private static void solve(Deque<String> dq) {
        //System.out.println(dq.pop()); // equals
        assert dq.peek() != null;
        var equal = Integer.parseInt(dq.peek());
        //System.out.println(dq.size());
        for (int i = 0; i < dq.size() * 2; i++) {
            var it = Integer.parseInt(Objects.requireNonNull(dq.pollLast()).replace("?", "0"));
            System.out.println(it);
            var operation = (checkOperationAndReplace(Objects.requireNonNull(dq.pollLast())));
            System.out.println(operation);

            if(Objects.equals(operation, "-")) {
                equal -= it;
            }



        }
        System.out.println();
        System.out.println(equal);
        System.out.println(dq);
//        for (var item : dq) {
//
//            System.out.println(item.replace("?", "0"));
//
//        }




// TO DO change ? to number 0 than result change in equals numbers each??
        // first equals
    // replace ? to numbers which equaled
    }



    public static void main(String[] args) {
        String expression = "2? + ?5 = 69";

        Deque<String> dq = parseString(expression);
        solve(dq);
    }
}
