package DesignPatterns.S2H.Factoryes;

import java.util.Random;

public abstract class Factory {
    protected Random random;

    public Factory() {
        random = new Random();
    }
}
