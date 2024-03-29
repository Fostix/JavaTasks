package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;

public class Square extends Rectangle {

    public Square(double a, double b) throws InvalidFigureParametersException {
        super(a, b);
    }

    @Override
    public double calculateAre() {
        return super.lines[0] * 4;
    }
}
