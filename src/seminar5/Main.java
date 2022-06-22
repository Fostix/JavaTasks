package seminar5;

public class Main {
    public static void main(String[] args) {






        System.out.println(CheckBracketsDequeMethod.checkBrackets(")"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("("));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("()"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("a+(d*3)"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("[a+(1*3)"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("[6+(3*3)]"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("{a}[+]{(d*3)}"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("<{a}+{(d*3)}>"));
        System.out.println(CheckBracketsDequeMethod.checkBrackets("{a+]}{(d*3)}"));

        System.out.println("----------------------------------------------------------------");

        System.out.println(CheckNumbersMethod.checkingBrackets("a+(d*3)"));
        System.out.println(CheckNumbersMethod.checkingBrackets("[a+(1*3)"));
        System.out.println(CheckNumbersMethod.checkingBrackets("[6+(3*3)]"));
        System.out.println(CheckNumbersMethod.checkingBrackets("{a}[+]{(d*3)}"));
        System.out.println(CheckNumbersMethod.checkingBrackets("<{a}+{(d*3)}>"));
        System.out.println(CheckNumbersMethod.checkingBrackets("{a+]}{(d*3)}"));
        System.out.println(CheckNumbersMethod.checkingBrackets("{a+]}{(d*3)}"));
        System.out.println(CheckNumbersMethod.checkingBrackets("{}}"));
        System.out.println(CheckNumbersMethod.checkingBrackets("{a+}{(d*3)}"));
        System.out.println(CheckNumbersMethod.checkingBrackets("("));
    }
}
//        Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь