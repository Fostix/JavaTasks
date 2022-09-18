package ExceptionSeminar3.FirstTask;

public class FirstTask {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void doSomething() throws RuntimeException {
        throw new RuntimeException();
    }
}
