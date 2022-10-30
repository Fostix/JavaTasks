package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;

public class Rectangle extends FigureWithCorners {
    private double a;
    private double b;

    /** indicate the lengths of the sides
     * @param a length
     * @param b width*/
    public Rectangle(double a, double b) throws InvalidFigureParametersException {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
        } else
            throw new InvalidFigureParametersException(this);
    }

    @Override
    public double calculateAre() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
