package ExceptionsSeminar3.FirstTask;

public class FirstTaskEx2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void doSomething() {
        throw new RuntimeException();
    }
}
