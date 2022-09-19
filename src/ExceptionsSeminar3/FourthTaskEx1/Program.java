package ExceptionsSeminar3.FourthTaskEx1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        try {
            System.out.println(method(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", null},
                    {"1", "1", "1", "2"}
            }));

            System.out.println(method(new String[][]{
                    {"1", "1111", "43", "3"},
                    {"6", "4", "34", "s"},
                    {"7", "4", "34", "4d3"},
                    {"33", "4", "34", "43"}
            }));

            method(new String[][]{{null}, {null}, {null}, {null}, {null}});

            method(new String[][]{{}, {}, {}});

            method(new String[][]{
                    {"23", "34", "43", "3", "14"},
                    {"6", "4", "34", "43", "3", "14"},
                    {"7", "4", "34", "43", "3", "14"},
                    {"33", "4", "34", "43", "3", "14"},
                    {"8", "4", "34", "43", "3", "14"},
                    {"33", "4", "34", "43", "3", "14"},
                    {"23", "2", "4", "34", "43", "3", "14"}
            });
        }catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int method(String[][] array) {
        int rowLength = array.length;
        int columnLength = array[0].length;
        int sum = 0;

        List<Integer> arrayErrors = new ArrayList<>();

        if (rowLength != 4 && columnLength != 4)
            throw new MyArraySizeException();

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
