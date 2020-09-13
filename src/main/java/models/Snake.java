package models;

public class Snake extends SpotType{

    private final int startPosition;
    private final int endPosition;

    public Snake(int startPosition, int endPosition) throws IllegalArgumentException{
        if(startPosition < endPosition)
            throw new IllegalArgumentException("start position should be greater than end position");
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
