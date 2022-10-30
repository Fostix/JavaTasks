package DesignPatterns.S3HE2.FigureManagement;

import DesignPatterns.S3HE2.ArrayFigure.ArrayFigure;
import DesignPatterns.S3HE2.Exceptions.InvalidFigureParametersException;
import DesignPatterns.S3HE2.FigureManagement.Interfaces.ICalculateOfAllArea;
import DesignPatterns.S3HE2.FigureManagement.Interfaces.ICalculateOfAllCircumference;
import DesignPatterns.S3HE2.FigureManagement.Interfaces.ICalculateOfAllPerimeter;
import DesignPatterns.S3HE2.FigureModels.*;
import DesignPatterns.S3HE2.FigureModels.Interface.ICalculateAre;
import DesignPatterns.S3HE2.FigureModels.Interface.ICalculatePerimeter;
import DesignPatterns.S3HE2.FigureModels.Interface.ICircumference;
import DesignPatterns.S3HE2.View.PrintInConsole;
import DesignPatterns.S3HE2.View.View;

public class FigureManagement implements ICalculateOfAllPerimeter, ICalculateOfAllArea, ICalculateOfAllCircumference {

    private ArrayFigure<Figure> figureList;
    private View view;

    public FigureManagement() {
        this.figureList = new ArrayFigure<>();
        this.view = new PrintInConsole();
    }

    public void createTriangle(double a, double b, double c) {
        try {
            Figure triangle = new Triangle(a, b, c);
            figureList.addNewShape(triangle);
        } catch (InvalidFigureParametersException e) {
            view.InvalidFigureParametersException(String.format("%s", e.getMessage()));
        }
    }

    public void createRectangle(double a, double b) {
        try {
            if (a == b) {
                Figure square = new Square(a, b);
            }
            Figure rectangle = new Rectangle(a, b); // if a == b to create square!!
            figureList.addNewShape(rectangle);
        } catch (InvalidFigureParametersException e){
            view.InvalidFigureParametersException(String.format("%s", e.getMessage()));
        }
    }

    public void createCircle(double a) {
        try {
            Figure circle = new Circle(a);
            figureList.addNewShape(circle);
        } catch (InvalidFigureParametersException e) {
            view.InvalidFigureParametersException(String.format("%s", e.getMessage()));
        }
    }

    @Override
    public void calculateOfAllPerimeter() {
        double result = 0;
        for (Figure figure : figureList) {
            if (figure instanceof ICalculatePerimeter)
            result += ((ICalculatePerimeter) figure).calculatePerimeter();
        }
        view.showOfAllPerimeter(result);
    }



    @Override
    public void calculateOfAllArea() {
        double result = 0;
        for (Figure figure : figureList) {
            if (figure instanceof ICalculateOfAllArea)
                result += ((ICalculateAre) figure).calculateAre();
        }
        view.showOfAllArea(result);
    }

    @Override
    public void calculateOfAllCircumference() {
        double result = 0;
        for (Figure figure : figureList) {
            if (figure instanceof ICircumference)
                result += ((ICircumference) figure).circumference();
        }
        view.showOfAllCircumference(result);
    }
}