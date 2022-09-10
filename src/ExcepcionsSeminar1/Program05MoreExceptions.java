package ExcepcionsSeminar1;

public class Program05MoreExceptions {
    public static void main(String[] args) {
        cannotBeCastToClass();
        stringNull();
        stringNull();
        dividedByZero();
        arrayBoundsForLength();
    }
    /** / by zero*/
    public static void dividedByZero() {
        int n = 10/0;
    }
    /** Index 100 out of bounds for length 10*/
    public static void arrayBoundsForLength() {
        int[] array = new int[10];
        array[100] = 1;
    }
    /** Cannot invoke "String.length()" because "text" is null*/
    public static void stringNull() {
        String text = null;
        System.out.println(text.length());
    }
    /** For input string: "10e2"*/
    public static void stringParseInt() {
        String text = "10e2";
        Integer.parseInt(text);
    }
    /** class java.lang.String cannot be cast to class java.lang.Integer*/
    public static void cannotBeCastToClass() {
        Object variable = "5";
        Integer number = (Integer) variable;
    }
}
