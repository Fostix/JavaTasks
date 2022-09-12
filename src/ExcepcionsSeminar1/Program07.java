package ExcepcionsSeminar1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Program07 {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a=10, b=0;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        //callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new ArrayList<String>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = new FileInputStream("1.txt");
        fis.read();

        if(fis.available() > 0) throw new RuntimeException();
        int num = callMethod4("124O");
        if (b == 0) {
            System.out.println("cannot devided by zero");
            b++;
        }
        return a/b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        int num = 0;
        try {
            num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Hello World, it's me!");
        }
        System.out.println(num);
        //return 0;
        return num;
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++){
            strings[i] = s;
        }
    }

}
