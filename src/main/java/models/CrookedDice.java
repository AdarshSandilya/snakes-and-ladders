package models;

import java.util.Random;

public class CrookedDice implements Dice{

    @Override
    public int roll() {
        return new Random().nextInt(6/2) *2;
    }
}
