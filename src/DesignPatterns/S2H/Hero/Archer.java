package DesignPatterns.S2H.Hero;

import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Weapons.Bow;

public class Archer extends Hero {
    private Platemail platemail;
    private Bow bow;
    public Archer(Platemail armor, Bow weapon) {
        this.platemail = armor;
        this.bow = weapon;
    }
}
