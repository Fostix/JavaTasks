package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;

public class Square extends Figure {
    private double a;

    /** enter the length of the sides
     * @param a each side*/
    public Square(double a) throws InvalidFigureParametersException{
        if (a > 0)
            this.a = a;
        else
            throw new InvalidFigureParametersException(this);
    }

    @Override
    public double calculateAre() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}
