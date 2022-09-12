package ExceptionsSeminar2;

public class Program2SumArrayValue {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][]{{}, {}, {}})); // ArrayIndexOutOfBoundsException
        System.out.println(sum2d(null)); // ArrayIndexOutOfBoundsException
        System.out.println(sum2d(new String[][]{{null}, {null}, {null}, {null}, {null}})); // NumberFormatException
        //#region todo 11.09.2022 I can think of something else
        System.out.println(sum2d(new String[][]{
                {"1", "1111", "43", "3", "14"},
                {"6", "4", "34", "43", "3", "14"},
                {"7", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "4er3", "0", "14"},
                {"8", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"23", "2", "4", "34", "43", "3", "14"}
        })); // illegal start of expression

        System.out.println(sum2d(new String[][]{
                {"23", "34", "43", null, "14"},
                {"6", "4", "34", "43", "3", "14"},
                {"7", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"8", "4", "34", "43", "3", "14"},
                {"33", "4", "0", "43", "3", "14"},
                {"23", "2", "4", "34", "43", "3", "14"}
        }));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    sum += checkSum(arr[i][j]);
                }
            }
        }
        return sum;
    }

    public static int checkSum(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

