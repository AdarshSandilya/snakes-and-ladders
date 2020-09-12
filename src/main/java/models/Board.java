package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {

    private final int size;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladder;
    private LinkedList<Player> players;

    public Board(int size) {
        this.size = size;
        this.snakes = new ArrayList<Snake>();
        ladder = new ArrayList<Ladder>();
        this.players = new LinkedList<Player>();
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

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }
}
