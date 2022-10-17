package DesignPatterns.S2H.Weapons;

import java.util.Random;

public abstract class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
