package DesignPatterns.S2H.Factoryes.Armor;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Factoryes.Factory;

import java.util.Random;

public class ArmorFactory extends Factory implements IArmorsFactory{

    @Override
    public Chainmail createChainmail(String nameChainmail) {
        int defence = random.nextInt(100, 300);
        return new Chainmail(nameChainmail, 1);
    }

    @Override
    public Platemail createPlatemail(String namePlatemail) {
        int defence = random.nextInt(400, 600);
        return new Platemail(namePlatemail, defence);
    }
}
