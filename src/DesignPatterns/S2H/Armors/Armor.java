package DesignPatterns.S2H.Armors;

public abstract class Armor {
    private String name;
    private int defence;

    public Armor(String name, int defence) {
        this.defence = defence;
    }
}
