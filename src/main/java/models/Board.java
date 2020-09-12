package models;

import java.util.ArrayList;

public class Board {

    private final int size;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladder;
    private ArrayList<Player> players;

    public Board(int size) {
        this.size = size;
        this.snakes = new ArrayList<Snake>();
        ladder = new ArrayList<Ladder>();
        this.players = new ArrayList<Player>();
    }


    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public ArrayList<Ladder> getLadders() {
        return ladder;
    }

    public void setLadder(ArrayList<Ladder> ladder) {
        this.ladder = ladder;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
