package DesignPatterns.S2H.Hero;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Weapons.Weapon;

public abstract class Hero {
    private int id;
    private int hp;
    private Weapon weapon;
    private Armor armor;

    public Hero() {
        hp = 500;
        id = ID.setID();
    }

    public void showId() {
        System.out.println(id);
    }

    public void showHp() {
        System.out.println(hp);
    }

    public void Attack() {

    }

    public void takeDamage() {

    }
}
