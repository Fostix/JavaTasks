package DesignPatterns.S2H.Exceptions;

public class WrongParametres extends RuntimeException{
    @Override
    public String getMessage() { // if less than 0 wrong negative number, if more then 60 very big characteristic
        return "";
    }
}
