package DesignPatterns.S3HE2.Exceptions;

import DesignPatterns.S3HE2.FigureModels.Figure;

public class InvalidFigureParametersException extends Exception {
    public InvalidFigureParametersException() {
    }

    /** Enter class name please */
    public InvalidFigureParametersException(Figure figure) {
        super(String.format("Incorrect %s parameters entered", figure.getClass()));
    }
}
