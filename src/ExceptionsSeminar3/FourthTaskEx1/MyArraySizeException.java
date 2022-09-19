package ExceptionsSeminar3.FourthTaskEx1;

public class MyArraySizeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Array size not 4x4";
    }
}
