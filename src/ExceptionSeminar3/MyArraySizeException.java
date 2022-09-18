package ExceptionSeminar3;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("array size not 4x4");
    }
}
