package seminar5;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBracketsDequeMethod {


    /**
     * Проверка скобок
     * @param type 0 everything brackets, 1 only open brackets, 2 only close brackets.
     * */
    private static boolean isBrackets(Character mrChar, int type) {

        Character[] allBrackets = new Character[]{'(', ')', '{', '}', '[', ']', '<', '>'};

        int iterator = 1;
        int start = 1;

        switch (type) {
            case 0 -> start = 0;
            case 1 -> { iterator = 2; start = 0; }
            case 2 -> iterator = 2;
        }

            for (int i = start; i < allBrackets.length; i+=iterator) {
                if (allBrackets[i] == mrChar) {
                    return true;
                }
            }
        return false;
    }

    /** Проверка правильной расстановки скобок */
    public static boolean checkBrackets(String check) {

        char[] exp = check.toCharArray();



        Deque<Character> forCheck = new ArrayDeque<>();
        System.out.print(exp);
        System.out.print(" -> ");

        for (char charSymbol : exp) {


            if (isBrackets(charSymbol, 1)) {
                forCheck.add(charSymbol);
            } else if (forCheck.isEmpty() && isBrackets(charSymbol, 2)) {
                return false;
            } else if (isBrackets(charSymbol, 2)) {
                forCheck.removeLast();
            }
        }

        return forCheck.isEmpty();
    }
}
