package ExceptionsSeminar3.FourthTask;

public class MyArraySizeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Array size not 4x4";
    }
}
