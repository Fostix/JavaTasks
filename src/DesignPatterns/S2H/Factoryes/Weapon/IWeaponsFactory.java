package DesignPatterns.S2H.Factoryes.Weapon;

import DesignPatterns.S2H.Weapons.Bow;
import DesignPatterns.S2H.Weapons.Sword;

public interface IWeaponsFactory {
    Bow createSimpleBow(String nameBow);
    Bow createEpicBow(String nameBow);
    Sword createSimpleSword(String nameSword);
    Sword createEpicSword(String nameSword);
}
