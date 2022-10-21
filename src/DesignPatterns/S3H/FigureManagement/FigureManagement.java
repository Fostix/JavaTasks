package DesignPatterns.S3H.FigureManagement;

import DesignPatterns.S3H.ArrayFigure.ArrayFigure;
import DesignPatterns.S3H.Exceptions.InvalidFigureParametersException;
import DesignPatterns.S3H.FigureManagement.Interfaces.ICalculateOfAllArea;
import DesignPatterns.S3H.FigureManagement.Interfaces.ICalculateOfAllPerimeter;
import DesignPatterns.S3H.FigureModels.*;

public class FigureManagement implements ICalculateOfAllPerimeter, ICalculateOfAllArea{

    private ArrayFigure<Figure> figureList;

    public FigureManagement() {
        this.figureList = new ArrayFigure<>();
    }

    public void createTriangle(double a, double b, double c) { // helo ;lj
        try {
            Figure triangle = new Triangle(a, b, c);
            figureList.addNewShape(triangle);
        } catch (InvalidFigureParametersException e) {
            System.err.println(String.format("%s", e.getMessage()));
        }
    }

    public void createSquare(double a) {
        try {
            Figure square = new Square(a);
            figureList.addNewShape(square);
        } catch (InvalidFigureParametersException e) {
            System.err.println(String.format("%s", e.getMessage()));
        }
    }

    public void createRectangle(double a, double b) { // can't line side less than thero (0).
        try {
            Figure rectangle = new Rectangle(a, b);
            figureList.addNewShape(rectangle);
        } catch (InvalidFigureParametersException e){
            System.err.println(String.format("%s", e.getMessage()));
        }
    }

    public void createCircle(double a) {
        try {
            Figure circle = new Circle(a);
            figureList.addNewShape(circle);
        } catch (InvalidFigureParametersException e) {
            System.err.println(String.format("%s", e.getMessage()));
        }
    }

    @Override
    public double calculateOfAllPerimeter() {
        double result = 0;
        for (Figure figure : figureList) {
            result += figure.calculatePerimeter();
        }
        return result;
    }

    @Override
    public double calculateOfAllArea() {
        double result = 0;
        for (Figure figure : figureList) {
            result += figure.calculateAre();
        }
        return result;
    }
}
