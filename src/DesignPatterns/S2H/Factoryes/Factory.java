package DesignPatterns.S2H.Factoryes;

import DesignPatterns.S2H.Armors.*;
import DesignPatterns.S2H.Exceptions.WrongParametres;
import DesignPatterns.S2H.Hero.Archer;
import DesignPatterns.S2H.Hero.Hero;
import DesignPatterns.S2H.Hero.Knight;
import DesignPatterns.S2H.Weapons.*;

import java.util.Random;

public class Factory {
    private static Factory instance;
    private Random random;

    private Factory() {
        random = new Random();
    }

    public static Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }

    public Armor createArmor(Hero hero, String name, int quality) {
        if (hero instanceof Archer) {
            if (quality == 0)
                return new SimpleChainmail(name);
            if (quality == 1)
                return new EpicChainmail(name);
        } else if (hero instanceof Knight) {
            if (quality == 0)
                return new SimplePlatemail(name);
            if (quality == 1)
                return new EpicPlatemail(name);
        }
        throw new WrongParametres();
    }

    public Weapon createWeapon(Hero hero, String name, int quality) {
        if (hero instanceof Archer) {
            if (quality == 0)
                return new SimpleBow(name);
            if (quality == 1)
                return new EpicBow(name);
        } else if (hero instanceof Knight) {
            if (quality == 0)
                return new SimpleSword(name);
            if (quality == 1)
                return new EpicSword(name);
        }
        throw new WrongParametres();
    }
}
