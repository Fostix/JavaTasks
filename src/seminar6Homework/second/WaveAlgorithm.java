package seminar6Homework.second;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class WaveAlgorithm{
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
                queue.clear();
                return new Point2D(p.x - 1, p.y);
            }
            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == -3) {
                queue.clear();
                return new Point2D(p.x, p.y - 1);
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == -3) {
                // getRoad(new Point2D(p.x + 1, p.y)); // delete -3 element
                queue.clear();
                return new Point2D(p.x + 1, p.y);
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == -3) {
                System.out.println(queue);
                queue.clear();
                return new Point2D(p.x, p.y + 1);
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
        return new Point2D(startPoint.x, startPoint.y);

    }

    public ArrayList<Point2D> getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();


        map[exit.x][exit.y] = 17;

        Point2D p = exit;

        road.add(new Point2D(exit.x, exit.y));

        while (map[p.x][p.y] >= 1) {
            if (map[p.x - 1][p.y] < map[p.x][p.y] && map[p.x - 1][p.y] > 0) {
                road.add(new Point2D(p.x - 1, p.y));
                p.x -= 1;
            }

            if (map[p.x][p.y - 1] < map[p.x][p.y] && map[p.x][p.y - 1] > 0) {
                road.add(new Point2D(p.x, p.y - 1));
                p.y -= 1;
            }

            if (map[p.x + 1][p.y] < map[p.x][p.y] && map[p.x + 1][p.y] > 0) {
                road.add(new Point2D(p.x + 1, p.y));
                p.x -= 1;
            }

            if (map[p.x][p.y + 1] < map[p.x][p.y] && map[p.x][p.y + 1] > 0) {
                road.add(new Point2D(p.x, p.y + 1));
                p.y += 1;
            }
            System.out.println(road);

        }
        return road;
    }

    public void markWay(ArrayList<Point2D> way) {
        while (!way.isEmpty()) {
            System.out.println(way.size());
        }
    }


    public void createWay(ArrayList<Point2D> way) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println(way);
    }


}
