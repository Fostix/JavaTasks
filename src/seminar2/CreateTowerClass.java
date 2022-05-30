package seminar2;

import java.util.ArrayList;
import java.util.List;

public class CreateTowerClass {
    public static List<Integer> CreateTower(int count) {
        ArrayList<Integer> firstTower = new ArrayList<>();
        for (int i = count; i > 0; i--) {
            firstTower.add(i);
        }
        return firstTower;
    }
}
