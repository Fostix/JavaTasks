package seminar2;
import java.util.ArrayList;

public class Main {

//    public static void myOwnMethod(int count) {
//        ArrayList<Integer> firstTower = (ArrayList<Integer>) CreateTowerClass.CreateTower(count);
//        ArrayList<Integer> secondTower = new ArrayList<>();
//        ArrayList<Integer> thirdTower = new ArrayList<>();
//        int firstLastEl = firstTower.get(firstTower.size() - 1);
//        int secLastEl = secondTower.get(secondTower.size() - 1);
//        int thirdLastEl = firstTower.get(firstTower.size() - 1);
//        System.out.println(firstLastEl);
//
//        for (int i = 0; i < 15; i++) {
//            if (secondTower.isEmpty() || firstTower.get(firstTower.size() - 1) < secondTower.get(secondTower.size() - 1)) {
//                secondTower.add(firstTower.get(firstTower.size() - 1));
//                firstTower.remove(firstTower.size() - 1);
//            } else {
//                firstTower.add(secondTower.get(secondTower.size() - 1));
//                secondTower.remove(secondTower.size() - 1);
//            }
//            if (thirdTower.isEmpty() || firstTower.get(firstTower.size() - 1) < thirdTower.get(thirdTower.size() - 1)) {
//                thirdTower.add(firstTower.get(firstTower.size() - 1));
//                firstTower.remove(firstTower.size() - 1);
//            } else {
//                firstTower.add(thirdTower.get(thirdTower.size() - 1));
//                thirdTower.remove(thirdTower.size() - 1);
//            }
//            if (thirdTower.isEmpty() || secondTower.get(secondTower.size() - 1) < thirdTower.get(thirdTower.size() - 1)) {
//                thirdTower.add(secondTower.get(secondTower.size() - 1));
//                secondTower.remove(secondTower.size() - 1);
//            } else {
//                secondTower.add(thirdTower.get(thirdTower.size() - 1));
//                thirdTower.remove(thirdTower.size() - 1);
//            }
//
//        }
//
//    }

//        firstTower.remove(firstTower.size() - 1);
//
//        secondTower.add(firstTower.get(firstTower.size() - 1));
//        firstTower.remove(firstTower.size() - 1);


        public static void TowersOfHanoi ( int quantity, int from, int to, int buf_peg){
            if (quantity != 0) {
                TowersOfHanoi(quantity - 1, from, buf_peg, to);
                System.out.print(quantity + " disk " + from + " -> " + to + " ");
                TowersOfHanoi(quantity - 1, buf_peg, to, from);
            }
        }



    public static void main(String[] args) {

        // myOwnMethod(2); // don't work!!

        // recursion method
//        int start_peg = 1, destination_peg = 3, buffer_peg = 2, plate_quantity = 11;
//        long startTime = System.currentTimeMillis();
//        TowersOfHanoi(plate_quantity, start_peg, destination_peg, buffer_peg);
//        long endTime = System.currentTimeMillis();
//        long testRecursionMethod = endTime - startTime;





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
        //System.out.println(testRecursionMethod);
        System.out.println(endTimeTest - startTimeTest);


    }
}
//    Написать программу, показывающую
//    последовательность действий для игры
//    “Ханойская башня”

