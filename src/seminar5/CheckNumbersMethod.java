package seminar5;

public class CheckNumbersMethod {
    public static boolean checkingBrackets(String ex) {

        var exp = ex.toCharArray();

        char[] bracketsArray = {'(', ')', '[', ']', '{', '}', '<', '>'};

        int res = 0;
        for (int i = 0; i < exp.length; i++) {
            for (int j = 0; j < bracketsArray.length; j+=2) {
                if (exp[i] == bracketsArray[j]) {
                    res -= 1;
                }
                if (bracketsArray[j + 1] == exp[i]) {
                    res += 1;
                }
            }
        }

        System.out.print(ex + " -> ");

        if (res == 0) {
            return true;
        }
        return false;
    }
}
