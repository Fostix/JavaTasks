package DesignPatterns.S3H.Exceptions;

import DesignPatterns.S3H.FigureModels.Figure;

public class InvalidFigureParametersException extends Exception {
    public InvalidFigureParametersException() {
    }

    /** Enter class name please */
    public InvalidFigureParametersException(Figure figure) {
        super(String.format("Incorrect %s parameters entered", figure.getClass()));
    }
}
