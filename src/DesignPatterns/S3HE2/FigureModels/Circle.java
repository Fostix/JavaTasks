package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;

public class Circle extends FigureWithoutCorners {

    /** Specify the radius of the circle
     * @param r radius */
    public Circle(double r) throws InvalidFigureParametersException {
        if(r > 0)
            super.radius = new double[]{r};
        else
            throw new InvalidFigureParametersException(this);
    }

    @Override
    public double calculateAre() {
        return Math.PI * Math.pow(super.radius[0], 2);
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * super.radius[0];
    }
}
