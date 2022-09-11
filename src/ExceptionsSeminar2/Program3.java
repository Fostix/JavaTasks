package ExceptionsSeminar2;

import java.io.*;

public class Program3 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2];
            test();
            int a= 1 / 0;
            inputStream = new FileInputStream("asdfgdsaf");
        } catch (Throwable e ) {
            e.printStackTrace();
//        } catch (error) {
//            System.out.println("asdfasdfsa");
        } finally {
            System.out.println("I'm done");
        }
        System.out.println("I live!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
