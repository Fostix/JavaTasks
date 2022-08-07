package seminar2;
import java.util.ArrayList;

public class Main {
        public static void TowersOfHanoi ( int quantity, int from, int to, int buf_peg){
            if (quantity != 0) {
                TowersOfHanoi(quantity - 1, from, buf_peg, to);
                System.out.print(quantity + " disk " + from + " -> " + to + " ");
                TowersOfHanoi(quantity - 1, buf_peg, to, from);
            }
        }
    public static void main(String[] args) {
        long startTimeTest = System.currentTimeMillis();
        int num_of_disks = 11;

        TowersOfHanoiCycle ob = new TowersOfHanoiCycle();
        Stack src, dest, aux;

        // Create three stacks of size 'num_of_disks'
        // to hold the disks
        src = ob.createStack(num_of_disks);
        dest = ob.createStack(num_of_disks);
        aux = ob.createStack(num_of_disks);

        ob.tohIterative(num_of_disks, src, aux, dest);
        long endTimeTest = System.currentTimeMillis();
        System.out.println(endTimeTest - startTimeTest);
    }
}
//    Написать программу, показывающую
//    последовательность действий для игры
//    “Ханойская башня”

