package seminar5Homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfixxx {

    public static Boolean isSign(Character elementForCheck) {



        Character[] signs = new Character[]{'+', '-', '*', '/'};
        for (int i = 0; i < signs.length; i++) {
            if(elementForCheck == signs[i]) {
                return true;
            }
        }
        return false;
    }


    public static void infixToPostfix(String expression) {
        Deque<Character> temp = new ArrayDeque<>();
        var test = expression.toCharArray();


        for (Character item : test) {
            if(isSign(item)) {
                temp.addLast(item);
            } else {
                temp.addFirst(item);
            }
        }

        StringBuilder result =new StringBuilder();
        System.out.println(temp);
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            result.append(temp.pollFirst());
        }

        System.out.println(result);
    }
}
