package DesignPatterns.S2H.Factoryes.Armor;

import DesignPatterns.S2H.Armors.Armor;
import DesignPatterns.S2H.Armors.Chainmail;
import DesignPatterns.S2H.Armors.Platemail;

public interface IArmorsFactory {
    Chainmail createChainmail(String nameChainmail);

    Platemail createPlatemail(String namePlatemail);
}
