package seminar6Homework.second;

import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        MapGenerator mg = new MapGenerator();
        System.out.println(
                new MapPrinter().mapColor(
                        mg.getMap())

        );

        System.out.println(
                new MapPrinter().rawData(
                        mg.getMap())

        );

        WaveAlgorithm lee = new WaveAlgorithm(mg.getMap());
        Point2D findExit = lee.Colorize(new Point2D(1, 1));

        System.out.println(new MapPrinter().rawData(mg.getMap()));


        //WaveAlgorithm mg = new MapGenerator(); // clear map
        // mg need make WaveAlgorithm
        // не понимаю почему на координатах  x: 2  y: 6 останавливается
        ArrayList<Point2D> goodWay = lee.getRoad(findExit);
//        mg = new MapGenerator();
//        mg.toString();
//        System.out.println(mg);
//        WaveAlgorithm s =  new WaveAlgorithm((mg.getMap()));
//        System.out.println(s);
//        s.markWay(goodWay);
//        System.out.println(goodWay.size() + " 43234");
//        System.out.println(
//                new MapPrinter().rawData(
//                        mg.getMap())
//
//        );






        //mapColor
    }
}


