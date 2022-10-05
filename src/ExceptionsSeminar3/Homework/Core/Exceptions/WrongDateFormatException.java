package ExceptionsSeminar3.Homework.Core.Exceptions;

public class WrongDateFormatException extends RuntimeException{
    public WrongDateFormatException(String message) {
        super(message);
    }
}
