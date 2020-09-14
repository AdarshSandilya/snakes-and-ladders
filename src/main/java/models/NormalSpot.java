package models;

public class NormalSpot implements SpotType{

    private int position;

    public NormalSpot(int position) {
        this.position = position;
    }

    @Override
    public int getEndPosition() {
        return position;
    }
}
