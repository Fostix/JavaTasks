package DesignPatterns.S2H.Hero;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Weapons.Bow;
import DesignPatterns.S2H.Weapons.Weapon;

public abstract class Hero {
    private int id;
    private int hp;
    private Armor armor;
    private Weapon weapon;

    public Hero() {
        hp = 500;
        id = ID.setID();
    }

    public void wearArmor(Armor armor) {
        this.armor = armor;
    }

    public void takeUpArms(Weapon weapon) {
        this.weapon = weapon;
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
