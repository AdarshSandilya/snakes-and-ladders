package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {

    public final Board board;
    private static final int BOARD_SIZE =100;

    public Game(ArrayList<Snake> snakes, ArrayList<Ladder> ladders, LinkedList<Player> players) {
        this.board = new Board(BOARD_SIZE);
        board.setSnakes(snakes);
        board.setLadder(ladders);
        board.setPlayers(players);
    }

    public void start() {
        
    }
}
