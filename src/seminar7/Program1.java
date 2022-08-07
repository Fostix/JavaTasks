package seminar7;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Objects;

public class Program1 {
    private static String checkOperationAndReplace(String s) {
        switch (s) {
            case "+":
                return "-";
            //return "df"; // TO DO if minus to change equals in plus!!!
            //break;
            case "-":
                return "+";

        }
        return s;
    }
    public static void main(String[] args) {
        String exp = "?1 + 4? = 4?";
        String a = exp.replace("?", "0"); // To Do I can replace operands too.
        System.out.println(a);
        String[] elem = a.split(" ");

        var item1 = Double.parseDouble(elem[0]);
        var operand = String.valueOf(elem[1]);
        var item2 = Double.parseDouble(elem[2]);
        var equal = Double.parseDouble(elem[4]);
        //System.out.println(equal + " dfg;lkfdjgf");
        Double res = null;
        switch (operand) {
            case "+":
                res = item1 + item2;
                res = equal - res;
                //Character.toString(res);
        }
        System.out.println(res);
//        System.out.println(item1);
//        //System.out.println(operand);
//        System.out.println(item2);
//
//        for (var item : elem) {
//            System.out.println(item);
//
//        }

    }
}
