package ExcepcionsSeminar1;

public class Program04ErrorCode {
    public static void main(String[] args) {
        //#region arrays
        int[][] array = {
                {1,0,1,0,1,1},
                {1,0,0,0,1,1},
                {1,0,1,0,0,0},
                {1,0,0,0,1,1},
                {1,1,1,0,0,0},
                {1,1,1,0,0,1}
        };
        int[][] array1 = {
                {1,0,0,0,1,1},
                {1,0,1,0,0,0},
                {1,0,0,0,1,1},
                {1,1,1,0,0,0},
                {1,1,1,0,0,1}
        };
        int[][] array2 = {
                {1,0,1,0,1,1},
                {1,0,0,0,1,1},
                {1,0,1,2,0,0},
                {1,0,0,0,1,1},
                {1,1,1,0,0,0},
                {1,1,1,0,0,1}
        };
        //#endregion

        sumArrayTest(array);
        sumArrayTest(array2);
        sumArrayTest(array1);
    }
    public static void sumArrayTest(int[][] array) {
        if (sumArray(array) == -1) {
            System.out.println("Array is not square");
            return;
        }
        if (sumArray(array) == -2) {
            System.out.println("Contain an invalid value");
            return;
        }
        System.out.printf("Sum of array elements: %d\n", sumArray(array));
    }
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array.length != array[i].length)
                    return -1;
                if (array[i][j] != 0 && array[i][j] != 1)
                    return -2;
                sum +=array[i][j];
            }
        }
        return sum;
    }
}
