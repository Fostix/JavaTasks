package ExceptionsSeminar3.Homework.Core.Exceptions;

public class WrongFIOFormatException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Wrong format the first letter must be capitalized, " +
                "indicate strictly following the sequence surname " +
                "first name patronymic";
    }
}
