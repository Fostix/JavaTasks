package seminar7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String expression = "";


        int count = 1;
        long[] timers = new long[count];
        for (int i = 0; i < count; i++) {
            long time = System.nanoTime();
            expression = "2? + ?5 = 69";
            //new LookingForNumbers(expression);
            System.out.println(new LookingForNumbers(expression));
            timers[i] = (System.nanoTime() - time);
        }
        System.out.println(Arrays.stream(timers).min() + " - min time ");
        System.out.println(Arrays.stream(timers).max() + " - max time ");
        System.out.println(Arrays.stream(timers).average() + " - average result ");





        System.out.println("-----------------------------------------------");
        expression = "?? - 72 = 125";
        //LookingForNumbers f = new LookingForNumbers(expression);
        System.out.println(new LookingForNumbers(expression));

        System.out.println("-----------------------------------------------");
        expression = "197 - ?? = 125";
        //LookingForNumbers f = new LookingForNumbers(expression);
        System.out.println(new LookingForNumbers(expression));



//        System.out.println("-----------------------------------------------");
//        String expression = "197 - ?? = 125";
//        //LookingForNumbers f = new LookingForNumbers(expression);
//        System.out.println(new LookingForNumbers(expression));

        // if / or * I can't do this!! create !!

    }
}
//+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до
// верного равенства. Предложить хотя бы одно решение или сообщить,
// что его нет.