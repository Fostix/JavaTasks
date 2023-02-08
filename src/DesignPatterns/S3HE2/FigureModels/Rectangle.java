package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;

public class Rectangle extends FigureWithCorners {

    /** indicate the lengths of the sides
     * @param a length
     * @param b width*/
    public Rectangle(double a, double b) throws InvalidFigureParametersException {
        if (a > 0 && b > 0) {
            super.lines = new double[]{a, b};
        } else
            throw new InvalidFigureParametersException(this);
    }

    @Override
    public double calculateAre() {
        return lines[0] * lines[1];
    }
}
