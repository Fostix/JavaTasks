package ExcepcionsSeminar1.Homework;

import SeveralMethods.SeveralMethods;

import java.util.Random;

import static SeveralMethods.SeveralMethods.fillArray;
import static SeveralMethods.SeveralMethods.showArray;

public class Program4 {
    public static void main(String[] args) {
        //#region not error
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        fillArray(arr, 1, 10);
        fillArray(arr2, 1, 10);
        int[] array = quotient(arr, arr2);
        showArray(array);
        //#endregion
        System.out.println();
        //#region have error length
        int[] arr3 = new int[10];
        int[] arr4 = new int[9];
        fillArray(arr3, 10);
        fillArray(arr4, 10);
        int[] array1 = quotient(arr3, arr4);
        showArray(array1);
        //#endregion
    }

    public static int[] quotient(int[] firstArr, int[] secondArr) {
        int lengthFirstArr = firstArr.length;
        int[] differenceArr = new int[lengthFirstArr];

        if (lengthFirstArr != secondArr.length)
            throw new RuntimeException("array lengths are not equal");

        for (int i = 0; i < lengthFirstArr; i++) {
            differenceArr[i] = firstArr[i] / secondArr[i];
        }
        return differenceArr;
    }
}
