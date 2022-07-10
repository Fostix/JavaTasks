package seminar6Homework.second;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> a = new ArrayDeque<>();

        a.add(2);
        a.getFirst();
        a.removeFirst();
        a.getFirst();
        System.out.println(a.getFirst());
        System.out.println(a.getFirst());
    }
}
