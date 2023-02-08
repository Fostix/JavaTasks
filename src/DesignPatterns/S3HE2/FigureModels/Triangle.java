package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;

public class Triangle extends FigureWithCorners {
    /** Specify each length of each side
     * @param a side a
     * @param b side b
     * @param c side c */
    public Triangle(double a, double b, double c) throws InvalidFigureParametersException {
        if(a + b > c && b + c > a && a + c > b) {
            super.lines = new double[]{a, b, c};
        } else {
            throw new InvalidFigureParametersException(this);
        }
    }

    @Override
    public double calculateAre() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lines[0]) * (halfPerimeter - lines[1]) * (halfPerimeter - lines[2]));
    }
}
