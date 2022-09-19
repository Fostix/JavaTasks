package ExceptionsSeminar3.SecondTask;

public class Program {
    public static void main(String[] args) throws Exception{
        Counter counter = new Counter();
        try (counter) {
            counter.add();
            counter.add();
            System.out.println(counter);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        counter.add();
    }
}
