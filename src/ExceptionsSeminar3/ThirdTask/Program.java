package ExceptionsSeminar3.ThirdTask;

import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, null, 4};

        try {
            FileReader read = new FileReader("file.txt");

            int a = 2/0;

            for (Integer number : array) {
                number++;
            }
        } catch (ArithmeticException e) {
            throw new MyArithmeticException();
        } catch (NullPointerException e) {
            throw new NullElementInArrayException();
        } catch (IOException e) {
            throw new FileNotFoundMyException();
        }
    }
}
