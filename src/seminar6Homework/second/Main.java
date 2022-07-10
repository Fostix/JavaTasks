package seminar6Homework.second;

import java.util.ArrayList;

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
        // не могу из mg сделать тип WaveAlgorithm
        ArrayList<Point2D> d = lee.getRoad(findExit);








        //mapColor
    }
}


