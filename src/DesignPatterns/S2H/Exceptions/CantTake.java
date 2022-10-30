package DesignPatterns.S2H.Exceptions;

public class CantTake extends RuntimeException{
    @Override
    public String getMessage() {
        return "can't";
    }
}
