package seminar6Homework.second;

import java.util.*;

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

    public Deque<Point2D> getRoad(Point2D exit) {
        Deque<Point2D> road = new ArrayDeque<>();


        map[exit.x][exit.y] = 17;

        Point2D p = exit;

        road.add(new Point2D(exit.x, exit.y));

        while (map[p.x][p.y] != 1) {
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
                p.x += 1;
            }

            if (map[p.x][p.y + 1] < map[p.x][p.y] && map[p.x][p.y + 1] > 0) {
                road.add(new Point2D(p.x, p.y + 1));
                p.y += 1;
            }

        }
        return road;
    }

    public void markWay(Deque<Point2D> way) {
        for (int i = way.size(); i > 0; i--) {
            map[way.getFirst().getX()][way.getFirst().getY()] = i;
            way.removeFirst();

        }
    }




}
