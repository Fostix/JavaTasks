package DesignPatterns.S2H.Factoryes.Weapon;

import DesignPatterns.S2H.Factoryes.Factory;
import DesignPatterns.S2H.Weapons.*;

import java.util.Random;

public class WeaponFactory extends Factory implements IWeaponsFactory{
    @Override
    public Bow createSimpleBow(String nameBow) {
        int damage = random.nextInt(5, 15);
        int range = random.nextInt( 3, 150);
        return new SimpleBow(nameBow, damage, range);
    }

    @Override
    public Bow createEpicBow(String nameBow) {
        int damage = random.nextInt(20, 35);
        int range = random.nextInt( 170, 300);
        return new EpicBow(nameBow, damage, range);
    }

    @Override
    public Sword createSimpleSword(String nameSword) {
        int damage = random.nextInt(25, 40);
        return new SimpleSword(nameSword, damage);
    }

    @Override
    public Sword createEpicSword(String nameSword) {
        int damage = random.nextInt(45, 60);
        return new EpicSword(nameSword, damage);
    }
}
