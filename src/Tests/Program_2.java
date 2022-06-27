package Tests;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Program_2 {

    private boolean oddOrNot(int num) {
        return num % 2 == 0;
    }

    private boolean oddOrNotSecond(int num) {
        return (num & 1) != 0;
    }

    public static void main(String[] args) {
        int count = 9000;
        System.out.println(Integer.MAX_VALUE);
        long[] timers = new long[count];
        Deque<Integer> test = new ArrayDeque<>();

        int num = -45535;
        for (int i = 0; i < count; i++) {
            long timer = System.nanoTime();

            if (num % 2 == 1) {
                test.add(num);
            }
            num++;


            timers[i] = -timer + System.nanoTime();
            // timers[i] = System.nanoTime() -timer;
        }

        System.out.println(Arrays.stream(timers).min() + " - min time ");
        System.out.println(Arrays.stream(timers).max() + " - max time ");
        System.out.println(Arrays.stream(timers).average() + " - average result ");
        System.out.println(test.size());
        //System.out.println(test);


        if (-1 % 2 == 1) {
            System.out.println("first");
        }
        if ((-1 & 1) != 0) {
            System.out.println("second");
        }


        //  %
//        OptionalLong[0] - min time
        //OptionalLong[105386000] - max time
        //OptionalDouble[42.973555555555556] - average result
        //45000000
        // - +
//        OptionalLong[0] - min time
//        OptionalLong[130060200] - max time
//        OptionalDouble[42.891687777777776] - average result
//        45000000

    }
}
