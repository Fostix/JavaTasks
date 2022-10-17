package DesignPatterns.S2H.Weapons;

public abstract class Bow extends Weapon{
    private int range;

    public Bow(String name, int damage, int range) {
        super(name, damage);
        this.range = range;
    }
}
