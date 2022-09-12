package ExceptionsSeminar2.Homework;

import java.io.FileNotFoundException;

public class Program3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." + ex);
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
