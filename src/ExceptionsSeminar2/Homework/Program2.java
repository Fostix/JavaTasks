package ExceptionsSeminar2.Homework;

public class Program2 {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        intArray[8] = 1;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e);
        }

    }
}
