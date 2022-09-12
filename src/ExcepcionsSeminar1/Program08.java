package ExcepcionsSeminar1;

import static SeveralMethods.SeveralMethods.fillArray;
import static SeveralMethods.SeveralMethods.showArray;

public class Program08 {
    public static void main(String[] args) {
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        fillArray(firstArr, 10);
        fillArray(secondArr, 10);
        int[] arr = plus(firstArr, secondArr);
        showArray(arr);
    }

    public static int[] plus(int[] firstArr, int[] secondArr) {
        int lengthFirstArr = firstArr.length;
        int[] differenceArr = new int[lengthFirstArr];

        if (lengthFirstArr != secondArr.length) {
            System.out.println("array lengths are not equal");
        }

        for (int i = 0; i < lengthFirstArr; i++) {
            differenceArr[i] = firstArr[i] + secondArr[i];
        }
        return differenceArr;
    }
}
