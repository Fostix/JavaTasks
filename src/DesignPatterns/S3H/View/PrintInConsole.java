package DesignPatterns.S3H.View;

public class PrintInConsole implements View{
    @Override
    public void InvalidFigureParametersException(String message) {
        System.err.println(message);
    }

    @Override
    public void showOfAllArea(double result) {
        System.out.println(result);
    }

    @Override
    public void showOfAllPerimeter(double result) {
        System.out.println(result);
    }

    @Override
    public void showOfAllCircumference(double result) {
        System.out.println(result);
    }
}
