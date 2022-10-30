package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.FigureModels.Interface.ICalculatePerimeter;

public abstract class FigureWithCorners extends Figure implements ICalculatePerimeter {
    public double calculatePerimeter() {
        return 2.2;
    }
}
