package models;

import exceptions.GameCompletedException;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {

    private boolean COMPLETED = false;
    private final Board board;
    private static final int BOARD_SIZE =100;
    private Player currentPlayer;
    private LinkedList<Player> players;
    private Player winner;

    public Game(ArrayList<Snake> snakes, ArrayList<Ladder> ladders, LinkedList<Player> players) {
        this.players = players;
        this.board = new Board(BOARD_SIZE, snakes, ladders);
        this.currentPlayer = players.poll();
    }

    public void play(Dice dice) throws GameCompletedException {
        if(hasGameEnded())
            throw new GameCompletedException("Game has ended");
        int diceResult = dice.roll();
        
        int newPositionValue = currentPlayer.getPosition().getPositionValue() + diceResult;
        if(newPositionValue > BOARD_SIZE)
            return;
        if(newPositionValue == BOARD_SIZE) {
            endGame();
            return;
        }
        Spot currentSpot = board.getSpotAt(newPositionValue);
        
        if(currentSpot.hasSnake() || currentSpot.hasLadder())
            currentSpot = board.getSpotAt(currentSpot.getSpotType().getEndPosition());
        currentPlayer.setPosition(currentSpot);
        players.add(currentPlayer);
        this.currentPlayer =  players.poll();
    }

    public boolean hasGameEnded() {
        return this.COMPLETED;
    }

    private void endGame() {
        this.COMPLETED = true;
        this.winner = currentPlayer;
    }


    private boolean hasEnded() {
        return true;
    }
}

