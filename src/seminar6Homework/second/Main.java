package seminar6Homework.second;

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



        Deque<Point2D> goodWay = lee.getRoad(findExit);


        mg = new MapGenerator(); // for clean map


        WaveAlgorithm s =  new WaveAlgorithm((mg.getMap()));
        s.markWay(goodWay);


        System.out.println(
                new MapPrinter().rawData(
                        mg.getMap())

        );


        System.out.println(
                new MapPrinter().mapColor(
                        mg.getMap())

        );



        //mapColor
    }
}


