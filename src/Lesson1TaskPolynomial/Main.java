package Lesson1TaskPolynomial;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        int k = 2;

        int coef = new Random().nextInt(0, 100);
        System.out.println(coef);



    }
}

//
//    Задана натуральная степень k. Сформировать случайным
//        образом список коэффициентов (значения от 0 до 100)
//        многочлена многочлен степени k.
//        *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

//        2. Даны два файла, в каждом из которых находится запись
//        многочлена. Сформировать файл содержащий сумму
//        многочленов