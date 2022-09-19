package ExceptionsSeminar3.ThirdTask;

public class NullElementInArrayException extends RuntimeException{
    public NullElementInArrayException() {
    }

    @Override
    public String getMessage() {
        return "Null element in array";
    }
}
