package seminar6Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        Point2D findExit =  lee.Colorize(new Point2D(1, 1));

        System.out.println(
                new MapPrinter().rawData(
                        mg.getMap())

        );


        WaveAlgorithm go = new WaveAlgorithm(mg.getMap());
        lee.getRoad(findExit);





        //mapColor
    }
}

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d  y: %d", x, y);
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -2,  0,  0, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0,  0, -1,  0,  0,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0, -1, -1, -1, -1,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0, -1,  0,  0, -1,  0,  0,  0,  0, -1 },
                { -1, -1, -1,  0, -1,  0, -1,  0,  0, -1, -3,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0, -1,  0,  0, -1, -1, -1,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0,  0,  0,  0, -1,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1,  0,  0,  0,  0, -1,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1, -1, -1, -1, -1, -1,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1 },
                { -1,  0,  0,  0, -1, -1, -1, -1, -1, -1, -1,  0,  0,  0, -1 },
                { -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }

    public void setCat(Point2D pos) {
        map[pos.x][pos.y] = -2;
    }

    public void setExit(Point2D pos) {
        map[pos.x][pos.y] = -3;
    }
}

class MapPrinter {

    public MapPrinter() {
    }

    public String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%5d", map[row][col]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }

        return sb.toString();
    }

    public String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {
                    case 0:
                        sb.append("░");
                        break;
                    case -1:
                        sb.append("▓");
                        break;
                    case -2:
                        sb.append("К");
                        break;
                    case -3:
                        sb.append("E");
                        break;
                    default:
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }
}

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public Point2D Colorize(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == -3) {
                //System.out.println(p.x, p.y + "I am here");
                System.out.println(queue);
                queue.clear();
                break;
            }
            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == -3) {
                System.out.println(queue);
                queue.clear();
                break;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if(map[p.x + 1][p.y] == -3) {
                System.out.println(p.x + 1);

                System.out.println(p.y);
                //lee.Colorize(new Point2D(1, 1));

                //getRoad(new Point2D(p.x + 1, p.y));
                System.out.println(queue);
                queue.clear();
                return new Point2D(p.x + 1, p.y);
                //getRoad(p.x, p.y);
                //break;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == -3) {
                System.out.println(queue);
                queue.clear();
                break;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
        return new Point2D(startPoint.x, startPoint.y);

    }

    public void getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();

        System.out.println(exit + "  dfgdfgf");

        map[exit.x][exit.y] = -4;
        Point2D p = exit;

        while (map[p.x][p.y] == 1) {

            if (map[p.x - 1][p.y] == 0) {
                road.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }

            if (map[p.x][p.y - 1] == 0) {
                road.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }

            if (map[p.x + 1][p.y] == 0) {
                road.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }

            if (map[p.x][p.y + 1] == 0) {
                road.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }

        }

        return road;
    }
}