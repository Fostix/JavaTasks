package ExceptionsSeminar3.SecondTask;

public class CountException extends RuntimeException{
    public CountException() {
        super("Count can't increment!");
    }
}
