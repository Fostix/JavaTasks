package DesignPatterns.S3H.Client;

import DesignPatterns.S3H.FigureManagement.FigureManagement;

public class Main {
    public static void main(String[] args) {
        FigureManagement figureManagement = new FigureManagement();

        figureManagement.createRectangle(5, 0);
        System.out.println(figureManagement.calculateOfAllArea());
        System.out.println(figureManagement.calculateOfAllPerimeter());
        figureManagement.createCircle(3);
        System.out.println(figureManagement.calculateOfAllArea());
        System.out.println(figureManagement.calculateOfAllPerimeter());
        figureManagement.createRectangle(5, 2);
        System.out.println(figureManagement.calculateOfAllArea());
        System.out.println(figureManagement.calculateOfAllPerimeter());
        figureManagement.createSquare(5);
        System.out.println(figureManagement.calculateOfAllArea());
        System.out.println(figureManagement.calculateOfAllPerimeter());
        figureManagement.createTriangle(2, 2, 0);
        System.out.println(figureManagement.calculateOfAllArea());
        System.out.println(figureManagement.calculateOfAllPerimeter());
    }
}
