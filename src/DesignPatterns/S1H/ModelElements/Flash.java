package DesignPatterns.S1H.ModelElements;

import DesignPatterns.S1H.ModelElements.othersModels.Angle3D;
import DesignPatterns.S1H.ModelElements.othersModels.Point3D;

import java.awt.*;


public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;



    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }
}
