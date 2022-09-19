package ExceptionsSeminar3.ThirdTask;

public class MyArithmeticException extends ArithmeticException{
    public MyArithmeticException() {
    }

    @Override
    public String getMessage() {
        return "Divide by zero";
    }
}
