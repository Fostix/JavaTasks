package DesignPatterns.S2H.Client;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Factoryes.Factory;
import DesignPatterns.S2H.Hero.Archer;
import DesignPatterns.S2H.Hero.Hero;
import DesignPatterns.S2H.Hero.Knight;
import DesignPatterns.S2H.Weapons.Bow;
import DesignPatterns.S2H.Weapons.Sword;
import DesignPatterns.S2H.Weapons.Weapon;

public class Program {
    public static void main(String[] args) { // use patterns singleton and abstract factory
        Factory factory = Factory.getInstance();
        var a1 = new Archer();
        var k1 = new Knight();

        Armor badChainmail = factory.createArmor(a1, "Borik", 0);
        Weapon goodWeapon = factory.createWeapon(a1, "Hello", 1);
        Armor goodPlatemail = factory.createArmor(k1, "Bahruma", 1);
        Weapon badSword = factory.createWeapon(k1, "Bahruma", 0);

        a1.wearArmor(badChainmail);
        a1.wearArmor(goodPlatemail);
        a1.takeUpArms(goodWeapon);
        k1.wearArmor(goodPlatemail);
        k1.takeUpArms(badSword);

        a1.showId();
        k1.showId();
    }
}
