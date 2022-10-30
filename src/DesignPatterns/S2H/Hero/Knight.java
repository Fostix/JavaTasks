package DesignPatterns.S2H.Hero;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Exceptions.CantTake;
import DesignPatterns.S2H.Weapons.Bow;
import DesignPatterns.S2H.Weapons.Sword;
import DesignPatterns.S2H.Weapons.Weapon;

public class Knight extends Hero {
    public void wearArmor(Armor armor) {
        if (armor instanceof Platemail)
            super.wearArmor(armor);
        else
            throw new CantTake();
    }

    @Override
    public void takeUpArms(Weapon weapon) {
        if (weapon instanceof Sword)
            super.takeUpArms(weapon);
        else
            throw new CantTake();
    }
}
