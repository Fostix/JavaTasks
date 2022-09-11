package ExcepcionsSeminar1.Homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // exceptions
//        notFind();
//        bounds();
//        castException();
    }
    public static void notFind() {
        try {
            FileReader r = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void bounds() {
        List<Integer> l = new ArrayList<>();
        l.remove(1);
    }
    public static void castException() {
        Scanner scanner = new Scanner((Readable) System.out);
    }
}