package models;

import java.util.Random;

public class CrookedDice{

    public static int roll() {
        return new Random().nextInt(6/2) *2;
    }
}
