package ExcepcionsSeminar1.Homework;

import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[9];
        fillArray(arr);
        fillArray(arr2);
        int[] array = minus(arr, arr2);
        showArray(array);
    }

    public static int[] minus(int[] firstArr, int[] secondArr) {
        int lengthFirstArr = firstArr.length;
        int[] differenceArr = new int[lengthFirstArr];

        if (lengthFirstArr != secondArr.length)
            throw new RuntimeException("array lengths are not equal");

        for (int i = 0; i < lengthFirstArr; i++) {
            differenceArr[i] = firstArr[i] - secondArr[i];
        }
        return differenceArr;
    }

    public static void fillArray(int[] array) {
        Random mrRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = mrRandom.nextInt(10);
        }
    }

    public static void showArray(int[] array) {
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }
}
                                                                                                                                