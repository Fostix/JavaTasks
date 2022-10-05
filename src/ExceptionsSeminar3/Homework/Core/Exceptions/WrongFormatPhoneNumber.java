package ExceptionsSeminar3.Homework.Core.Exceptions;

public class WrongFormatPhoneNumber extends RuntimeException{
    public WrongFormatPhoneNumber(String message) {
        super(message);
    }
}
