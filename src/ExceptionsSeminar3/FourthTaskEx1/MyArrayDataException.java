package ExceptionsSeminar3.FourthTaskEx1;

public class MyArrayDataException extends RuntimeException{
    private String index;
    public MyArrayDataException(int i, int j) {
        this.index = i + " " + j;
    }

    @Override
    public String getMessage() {
        return "In array not number: " + index;
    }
}
