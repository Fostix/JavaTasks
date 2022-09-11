package ExcepcionsSeminar1;

import static ExcepcionsSeminar1.Homework.Program3.fillArray;

public class Program06checkNullInArray {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        fillArray(array, 10);
        array[1] = null;
        array[3] = null;
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder checkInformation = new StringBuilder();
        checkInformation.append("there is zero in the array the elements are under the index: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                checkInformation.append(String.format("%d ", i));
            }
        }
        if (checkInformation.length() > 61)
            System.out.println(checkInformation);
    }
}
