package ExceptionSeminar3.FourthTaskEx1;

import java.util.Arrays;
import java.util.List;

public class MyArrayDataException extends RuntimeException{
    private String index;
    public MyArrayDataException(int i, int j) {
        this.index = i + " " + j;
    }

    @Override
    public String getMessage() {
        return "In array not number: " + index;
    }
}
