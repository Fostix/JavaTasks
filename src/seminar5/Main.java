package seminar5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int count = 1_000_000_0;
        long[] firstMethodTimers = new long[count];


        for (int i = 0; i < count; i++) {
            long firstMethodTime = System.nanoTime();
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("a+(d*3)"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("[a+(1*3)"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("[6+(3*3)]"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("{a}[+]{(d*3)}"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("<{a}+{(d*3)}>"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("{a+]}{(d*3)}"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("{}}"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("("));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets("()"));
//            System.out.println(CheckBracketsDequeMethod.checkBrackets(")"));

            CheckBracketsDequeMethod.checkBrackets("a+(d*3)");
            CheckBracketsDequeMethod.checkBrackets("[a+(1*3)");
            CheckBracketsDequeMethod.checkBrackets("[6+(3*3)]");
            CheckBracketsDequeMethod.checkBrackets("{a}[+]{(d*3)}");
            CheckBracketsDequeMethod.checkBrackets("<{a}+{(d*3)}>");
            CheckBracketsDequeMethod.checkBrackets("{a+]}{(d*3)}");
            CheckBracketsDequeMethod.checkBrackets("{}}");
            CheckBracketsDequeMethod.checkBrackets("(");
            CheckBracketsDequeMethod.checkBrackets("()");
            CheckBracketsDequeMethod.checkBrackets(")");
            firstMethodTimers[i] = -firstMethodTime + System.nanoTime();

        }


        System.out.println(Arrays.stream(firstMethodTimers).min() + " min");
        System.out.println(Arrays.stream(firstMethodTimers).max() + " max");
        System.out.println(Arrays.stream(firstMethodTimers).average() + " average");


        Arrays.sort(firstMethodTimers);
        double firstMethodMedian;
        if((firstMethodTimers.length & 1) == 0)
            firstMethodMedian = ((double)firstMethodTimers[firstMethodTimers.length / 2] + (double) firstMethodTimers[firstMethodTimers.length / 2 - 1]) / 2;
        else firstMethodMedian = (double) firstMethodTimers[firstMethodTimers.length / 2];
        System.out.println(firstMethodMedian + " median");

        System.out.println("----------------------------------------------------------------");

        long[] secondMethodTimers = new long[count];

        for (int i = 0; i < count; i++) {
            long secondMethodTime = System.nanoTime();
//        System.out.println(CheckNumbersMethod.checkingBrackets("a+(d*3)"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("[a+(1*3)"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("[6+(3*3)]"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("{a}[+]{(d*3)}"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("<{a}+{(d*3)}>"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("{a+]}{(d*3)}"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("{}}"));
//        System.out.println(CheckNumbersMethod.checkingBrackets("("));
//        System.out.println(CheckNumbersMethod.checkingBrackets("()"));
//        System.out.println(CheckNumbersMethod.checkingBrackets(")"));

            CheckBracketsNumbersMethod.checkingBrackets("a+(d*3)");
            CheckBracketsNumbersMethod.checkingBrackets("[a+(1*3)");
            CheckBracketsNumbersMethod.checkingBrackets("[6+(3*3)]");
            CheckBracketsNumbersMethod.checkingBrackets("{a}[+]{(d*3)}");
            CheckBracketsNumbersMethod.checkingBrackets("<{a}+{(d*3)}>");
            CheckBracketsNumbersMethod.checkingBrackets("{a+]}{(d*3)}");
            CheckBracketsNumbersMethod.checkingBrackets("{}}");
            CheckBracketsNumbersMethod.checkingBrackets("(");
            CheckBracketsNumbersMethod.checkingBrackets("()");
            CheckBracketsNumbersMethod.checkingBrackets(")");


            secondMethodTimers[i] = -secondMethodTime + System.nanoTime();

        }

        System.out.println(Arrays.stream(secondMethodTimers).min() + " min");
        System.out.println(Arrays.stream(secondMethodTimers).min() + " max");
        System.out.println(Arrays.stream(secondMethodTimers).average() + " average");

        Arrays.sort(secondMethodTimers);
        double secondMethodMedian;
        if((secondMethodTimers.length & 1) == 0)
            secondMethodMedian = ((double)secondMethodTimers[secondMethodTimers.length / 2] + (double) secondMethodTimers[secondMethodTimers.length / 2 - 1]) / 2;
        else secondMethodMedian = (double) secondMethodTimers[secondMethodTimers.length / 2];
        System.out.println(secondMethodMedian + " median");



//        int[] num = new int[]{2, 6, 9, 3};
//        Arrays.sort(num);
//        for (int item : num) {
//            System.out.println(item);
//        }

    }
}
//        Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь
