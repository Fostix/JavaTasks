package seminar7;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // work only with + or -.
        String expression = "2? + ?5 = 69";
        //LookingForNumbers f = new LookingForNumbers(expression);
        System.out.println(new LookingForNumbers(expression));

        System.out.println("-----------------------------------------------");
        expression = " - 72 = 125";
        //LookingForNumbers f = new LookingForNumbers(expression);
        System.out.println(new LookingForNumbers(expression));

        System.out.println("-----------------------------------------------");
        expression = "197 - ?? = 125";
        //LookingForNumbers f = new LookingForNumbers(expression);
        System.out.println(new LookingForNumbers(expression));


    }
}
//+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до
// верного равенства. Предложить хотя бы одно решение или сообщить,
// что его нет.