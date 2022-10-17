package DesignPatterns.S2H.Factoryes.Armor;

import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;
import DesignPatterns.S2H.Factoryes.Factory;

public class ArmorFactorySingleton extends Factory implements IArmorsFactory{

    private static ArmorFactorySingleton instance;

    private ArmorFactorySingleton() {
    }

    public static ArmorFactorySingleton getInstance() {
        if(instance == null) {
            instance = new ArmorFactorySingleton();
        }

        return instance;
    }

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
