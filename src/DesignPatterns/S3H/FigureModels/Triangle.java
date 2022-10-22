package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;

public class Triangle extends FigureWithCorners {
    private double a;
    private double b;
    private double c;

    /** Specify each length of each side
     * @param a side a
     * @param b side b
     * @param c side c */
    public Triangle(double a, double b, double c) throws InvalidFigureParametersException {
        if(a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new InvalidFigureParametersException(this);
        }
    }

    @Override
    public double calculateAre() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
