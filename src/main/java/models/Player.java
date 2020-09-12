package models;

public class Player {
    private int position;
    private String name;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
