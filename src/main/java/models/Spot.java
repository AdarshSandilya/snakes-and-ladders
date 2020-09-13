package models;

public class Spot {
    private final SpotType spotType;
    private  Snake snake;
    private int positionValue;

//    public Spot(int positionValue, SpotType) {
//        this.positionValue = positionValue;
//    }

    public Spot(int positionValue, SpotType spotType) {
        this.positionValue = positionValue;
        this.spotType = spotType;
    }

//    public Spot(int positionValue, Snake snake) {
//        this.positionValue = positionValue;
//        this.snake = snake;
//    }


    public boolean hasSnake() {
        return true;
    }

    public Object getPositionValue() {
        return null;
    }
}
