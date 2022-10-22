package DesignPatterns.S3H.FigureModels;

import DesignPatterns.S3H.FigureModels.Interface.ICalculatePerimeter;

public abstract class FigureWithCorners extends Figure implements ICalculatePerimeter {
    public abstract double calculatePerimeter();
}
