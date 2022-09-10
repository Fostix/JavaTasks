package Tests;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_1 {
    public static void main(String[] args) {
        int count = 5000000;
        long[] timers = new long[count];
        for (int i = 0; i < count; i++) {
            long time = System.nanoTime();


            char[] n = new char[]{'(', ')', '{', '}', '[', ']', '<', '>'};
            ArrayList<Character> arcj = new ArrayList<>();
            arcj.add('(');
            arcj.add(')');
            arcj.add('{');
            arcj.add('}');
            arcj.add('[');
            arcj.add(']');
            arcj.add('<');
            arcj.add('>');


            timers[i] = (System.nanoTime() - time);
            // System.out.println(timers[i] = System.nanoTime() - time);
        }
        System.out.println(Arrays.stream(timers).min() + " - min time ");
        System.out.println(Arrays.stream(timers).max() + " - max time ");
        System.out.println(Arrays.stream(timers).average() + " - average result ");
    }
}
