package ExceptionsSeminar2;

public class Program2 {
    public static void main(String[] args) {

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

