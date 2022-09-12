package ExceptionsSeminar2;

import java.io.*;

public class Program3 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("asdfgdsaf");
        } catch (ArrayIndexOutOfBoundsException | StackOverflowError | IOException e) {
            e.printStackTrace();
            //e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } catch (StackOverflowError e) {
//            System.out.println("Stack overflow error");
//        } catch (IOException e) {
//            System.out.println(e);
        } finally {
            System.out.println("I still completed");
        }
        System.out.println("I live!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        try {
            test();
        } catch (StackOverflowError e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
