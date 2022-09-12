package ExcepcionsSeminar1.Homework;

public class Program2 {
    public static void main(String[] args) {
        //sum2d(new String[][]{{}, {}, {}}); // ArrayIndexOutOfBoundsException
        //sum2d(new String[][]{{null}, {null}, {null}, {null}, {null}}); // NumberFormatException
        //#region todo 11.09.2022 I can think of something else
        System.out.println(sum2d(new String[][]{
                {"1", "1111", "43", "3", "14"},
                {"6", "4", "34", "43", "3", "14"},
                {"7", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"8", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"23", "2", "4", "34", "43", "3", "14"}
        })); // illegal start of expression

        System.out.println(sum2d(new String[][]{
                {"23", "34", "43", "3", "14"},
                {"6", "4", "34", "43", "3", "14"},
                {"7", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"8", "4", "34", "43", "3", "14"},
                {"33", "4", "34", "43", "3", "14"},
                {"23", "2", "4", "34", "43", "3", "14"}
        }));
        //#endregion
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
