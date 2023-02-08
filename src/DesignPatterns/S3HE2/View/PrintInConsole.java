package DesignPatterns.S3HE2.View;

public class PrintInConsole implements View {
    @Override
    public void InvalidFigureParametersException(String message) {
        System.err.println(message);
    }

    @Override
    public void showOfAllArea(double result) {
        System.out.printf("%f = show area\n", result);
    }

    @Override
    public void showOfAllPerimeter(double result) {
        System.out.printf("%f = show perimeter\n", result);
    }

    @Override
    public void showOfAllCircumference(double result) {
        System.out.printf("%f = show circumference\n", result);
    }
}
