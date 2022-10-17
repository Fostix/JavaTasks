package DesignPatterns.S2H.Client;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Factoryes.Armor.ArmorFactory;
import DesignPatterns.S2H.Factoryes.Armor.IArmorsFactory;
import DesignPatterns.S2H.Factoryes.Factory;
import DesignPatterns.S2H.Factoryes.Weapon.IWeaponsFactory;
import DesignPatterns.S2H.Factoryes.Weapon.WeaponFactory;
import DesignPatterns.S2H.Hero.Archer;
import DesignPatterns.S2H.Hero.Hero;
import DesignPatterns.S2H.Hero.Knight;
import DesignPatterns.S2H.Weapons.Bow;
import DesignPatterns.S2H.Weapons.Sword;
import DesignPatterns.S2H.Weapons.Weapon;

public class Program {
    public static void main(String[] args) {
        IArmorsFactory body = new ArmorFactory();
        Platemail badPlatemail = body.createPlatemail("borik");
        Chainmail goodChainmail = body.createChainmail("Buhruma");

        IWeaponsFactory swordFactory = new WeaponFactory();
        Bow badBow = swordFactory.createSimpleBow("Baltimur");
        Sword goodSword = swordFactory.createEpicSword("Frozensarrow");


        Hero hero1 = new Archer(badPlatemail, badBow);
        Hero hero2 = new Knight(goodChainmail, goodSword);
        Hero hero3 = new Knight(goodChainmail, goodSword);

        hero1.showId();
        hero2.showId();

        //Character hero = new Archer(test, bow);
    }
}
