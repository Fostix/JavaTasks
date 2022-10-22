package DesignPatterns.S3H.Client;

import DesignPatterns.S3H.FigureManagement.FigureManagement;

public class Main {
    public static void main(String[] args) {
        FigureManagement figureManagement = new FigureManagement();

        figureManagement.createRectangle(5, 0);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
        figureManagement.createCircle(3);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
        figureManagement.createRectangle(5, 2);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
        figureManagement.createTriangle(2, 2, 2);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
    }
}
