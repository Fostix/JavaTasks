package seminar5;

import java.lang.reflect.Array;

public class Check {
    public static boolean chekingBrackets(String ex) {

        var exp = ex.toCharArray();

        char[] bracketsArray = {'(', ')', '[', ']', '{', '}', '<', '>'};
        int length = bracketsArray.length;

        int res = 0;
        for (int i = 0; i < exp.length; i++) {
            for (int j = 0; j < bracketsArray.length; j+=2) {
                if (exp[i] == bracketsArray[j]) {
                    exp[i] = ' ';
                    res -= 10;
                }
                if (bracketsArray[j + 1] == exp[i]) {
                    exp[i] = ' ';
                    res += 10;
                }
            }
        }

        if (res == 0) {
            return true;
        }
        return false;
    }
}
