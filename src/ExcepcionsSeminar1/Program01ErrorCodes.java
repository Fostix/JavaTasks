package ExcepcionsSeminar1;

public class Program01ErrorCodes {
    public static void main(String[] args) {
        int[] array  = {1,2,33,4,7,9,0,6,4,3,6,8,89,54,3,6,9,98,5,3,7,9};
        System.out.println(getArrayLength(array));
    }

    private static int getArrayLength(int[] array) {
        int min = 10;
        if (array.length < min)
            return -1;
        return array.length;
    }
}
