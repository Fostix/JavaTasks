package DesignPatterns.S2H.Hero;

import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Weapons.Sword;

public class Knight extends Hero {
    private Chainmail weapon;
    private Sword armor;
    public Knight(Chainmail weapon, Sword armor) {
        this.weapon = weapon;
        this.armor = armor;
    }
}
