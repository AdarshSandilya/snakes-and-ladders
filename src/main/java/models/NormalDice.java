package models;

import java.util.Random;

public class NormalDice {
    public static int roll() {
        return new Random().nextInt(6) + 1;
    }
}
