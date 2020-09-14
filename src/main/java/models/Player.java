package models;

public class Player {
    private Spot position;
    private String name;

    public Player(String name) {
        this.name = name;
        this.position = new Spot(0, new NormalSpot(0));
    }

    public Spot getPosition() {
        return position;
    }

    public void setPosition(Spot position) {
        this.position = position;
    }
}
