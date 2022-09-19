package ExceptionsSeminar3.SecondTask;

public class Counter implements AutoCloseable{
    private int count;
    private boolean flag;

    public Counter() {
        this.count = 0;
        this.flag = true;
    }

    public void add() throws Exception {
        if (flag)
            count++;
        else
            throw new CountException();
    }

    @Override
    public String toString() {
        return String.format("%d", this.count);
    }

    @Override
    public void close() {
        this.flag = false;
    }
}
