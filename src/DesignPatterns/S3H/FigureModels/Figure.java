package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;

public abstract class Figure{
    public Figure() {
    }

    public abstract double calculateAre();
    public abstract double calculatePerimeter();
}
