package seminar6;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static int firstCommand(int a, int c) { return a *= c; }
    public static int secondCommand(int a, int d) { return a += d; }


    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 2;
        int d = 1;
        // Deque<TreeMap> commands = new ArrayDeque<>();
        LinkedHashMap<Integer, String> mrMap = new LinkedHashMap<>();

        int counter = b * (b+1) / 2 * 2;


        mrMap.put(0, "start");
        for (int i = 1; i < counter; i++) {
            if((i & 1) == 0) { // even
                a = firstCommand(a, c);
                if(a > b) {
                    mrMap.put(i, "fail");
                    a /= 2;
                    continue;
                }
                String result = String.valueOf(a);
                mrMap.put(i, result +" k1");
            } else {
                a = secondCommand(a, d);
                if(a > b) {
                    mrMap.put(i, "fail");
                    a -= 2;
                    continue;
                }
                String result = String.valueOf(a);
                mrMap.put(i, result + " k2");
            }

        }


        System.out.println(a);
        System.out.println(mrMap);






    }
}
//        +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
//        - команда 1 (к1): увеличить в с раза, а умножается на c
//        - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
//        написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
//        Пример 1: а = 1, b = 7, c = 2, d = 1
//        ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
//        Пример 2: а = 11, b = 7, c = 2, d = 1
//        ответ: нет решения.
//        *Подумать над тем, как сделать минимальное количество команд
