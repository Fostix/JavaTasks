package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;

public class Circle extends Figure {
    private double r; // radius

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
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
