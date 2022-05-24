package seminar1Task1;

public class GetPowClass {
    public static String get_pow (int a, int b) {
        double res = Math.pow(a, b);
        if (a <= 0) return "Undefined";
        else if( b < 0) return Double.toString((double) res);
        else return Integer.toString((int) res);
    }
}
