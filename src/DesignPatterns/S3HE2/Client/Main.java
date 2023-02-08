package DesignPatterns.S3HE2.Client;

import DesignPatterns.S3HE2.FigureManagement.FigureManagement;

public class Main {
    public static void main(String[] args) {
        FigureManagement figureManagement = new FigureManagement();

        figureManagement.createSquare(2);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();

        figureManagement.createTriangle(2, 2, 2);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter(); // last

        figureManagement.createRectangle(5, 3);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
        figureManagement.createCircle(3);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter();
        figureManagement.calculateOfAllCircumference();
        figureManagement.createRectangle(5, 2);
        figureManagement.calculateOfAllArea();
        figureManagement.calculateOfAllPerimeter(); // 3
    }
}
