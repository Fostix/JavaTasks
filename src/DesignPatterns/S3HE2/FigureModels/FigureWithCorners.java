package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.FigureModels.Interface.ICalculatePerimeter;

public abstract class FigureWithCorners extends Figure implements ICalculatePerimeter {
    protected double[] lines;
    public double calculatePerimeter() {
        double result = 0;
        for (int i = 0; i < this.lines.length; i++) {
            result += this.lines[i];
        }
        return result;
    }
}
