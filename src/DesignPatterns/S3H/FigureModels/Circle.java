package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;
import DesignPatterns.S3H.FigureModels.Interface.ICircumference;

public class Circle extends FigureWithoutCorners  {
    private double r;

    /** Specify the radius of the circle
     * @param r radius */
    public Circle(double r) throws InvalidFigureParametersException{
        if(r > 0)
            this.r = r;
        else
            throw new InvalidFigureParametersException(this);
    }

    @Override
    public double calculateAre() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
