package L1.ModelElements;

import DesignPatterns.L1.ModelElements.othersModels.Angle3D;
import DesignPatterns.L1.ModelElements.othersModels.Point3D;

public class Camera {
    public Angle3D angle;
    public Point3D location;

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }
}
