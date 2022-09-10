package ExcepcionsSeminar1;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,6,3,1,6,9,5,1,34,87,9,43,23,76,9,54,2,45};
        int[] array1 = {1,2,4,6,6,3};
        int[] array2 = new int[10000000];
        ScannerForUser(array2);
        ScannerForUser(array);
        ScannerForUser(null);
        ScannerForUser(array1);
    }
    public static void ScannerForUser(int[] array) {
        int result = findElem(array, new Scanner(System.in).nextInt());
        switch (result) {
            case -1:
                System.out.println("Array size is too small");
                return;
            case -2:
                System.out.println("Element not found");
                return;
            case -3:
                System.out.println("Array is not set");
                return;
            case -4:
                System.out.println("Array size is too big");
                return;
        }
        System.out.printf("The given element is contained in the array by index: %d\n", result);
    }
    public static int findElem(int[] array, int searchElem) {
        if (array == null)
            return -3;
        if (array.length < 10)
            return -1;
        if (array.length > 1000000)
            return -4;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElem)
                return i;
        }
        return  -2;
    }
}