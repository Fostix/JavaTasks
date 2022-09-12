package SeveralMethods;

import java.util.Random;

public class SeveralMethods {
    public static void fillArray(int[] array, int min, int max) {
        Random mrRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = mrRandom.nextInt(min, max);
        }
    }

    public static void fillArray(int[] array, int max) {
        Random mrRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = mrRandom.nextInt(max);
        }
    }

    public static void fillArray(Integer[] array, int max) {
        Random mrRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = mrRandom.nextInt(max);
        }
    }

    public static void fillArray(int[][] array, int max) {
        Random mrRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = mrRandom.nextInt(max);
            }
        }
    }

    public static void showArray(int[] array) {
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }

    public static void showArray(Integer[] array) {
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }
}
