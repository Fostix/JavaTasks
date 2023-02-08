package DesignPatterns.S3HE2.FigureModels;

import DesignPatterns.S3HE2.FigureModels.Interface.ICircumference;

public abstract class FigureWithoutCorners extends Figure implements ICircumference {
    protected double[] radius;
}
