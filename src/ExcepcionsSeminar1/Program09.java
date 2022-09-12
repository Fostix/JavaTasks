package ExcepcionsSeminar1;


public class Program09 {
    public static void main(String[] args) {
        int[][] array = new int[7][10];
        //fillArray(array, 10);
        method(array);

    }

    public static void method(int[][] array) {
        int arrayLengthX = array.length;
        int arrayLengthY = array[0].length;
        System.out.println(arrayLengthX);
        System.out.println(arrayLengthY);
        //if (arrayLengthX == arrayLengthY)

//        for (int i = 0; i < ; i++) {
//
//        }
    }
}

//    Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//        Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//        детализировать какие строки со столбцами не требуется.
//        Как бы вы реализовали подобный метод?
