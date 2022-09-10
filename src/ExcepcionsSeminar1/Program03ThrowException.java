package ExcepcionsSeminar1;

public class Program03ThrowException {
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

        System.out.println(sumArray(array));
        System.out.println(sumArray(array2));
        System.out.println(sumArray(array1));
    }
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array.length != array[i].length)
                    throw new RuntimeException("Array is not square");
                if (array[i][j] != 0 && array[i][j] != 1)
                    throw new RuntimeException("Contains an invalid value");
                sum +=array[i][j];
            }
        }
        return sum;
    }
}