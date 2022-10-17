package DesignPatterns.S2H.Hero;

public class ID {
    private static int id;

    {
        id = 0;
    }

    public static int setID() {
        id++;
        return id;
    }
}
