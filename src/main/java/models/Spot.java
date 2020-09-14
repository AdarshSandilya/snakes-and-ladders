package models;

public class Spot {

    private final SpotType spotType;
    private int positionValue;


    public Spot(int positionValue, SpotType spotType) {
        this.positionValue = positionValue;
        this.spotType = spotType;
    }
    
    public boolean hasSnake() {
        return spotType.getClass().getSimpleName().equals("Snake");
    }

    public boolean hasLadder() {
        return spotType.getClass().getSimpleName().equals("Ladder");
    }

    public int getPositionValue() {
        return positionValue;
    }
    
    SpotType getSpotType() {
        return spotType;
    }
}
