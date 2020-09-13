package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {

    private final int size;
    private final ArrayList<Spot> spots;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;
    private LinkedList<Player> players;

    public Board(int size, ArrayList<Snake> snakes, ArrayList<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = new LinkedList<>();
        this.spots = new ArrayList<>();
        createSpots();
    }

    private void createSpots() {
        for (int i = 1; i <= size ; i++) {
            Snake snakeOnTheSpot = findSnakeAt(i);
            if (snakeOnTheSpot != null){
                spots.add(new Spot(i, snakeOnTheSpot));
                continue;
            }
            Ladder ladderAtPosition = findLadderAt(i);
            if (ladderAtPosition !=null){
                spots.add(new Spot(i, ladderAtPosition));
                continue;
            }
            spots.add(new Spot(i, new SpotType()));
        }
    }

    private Ladder findLadderAt(int position) {
        return ladders.stream().filter(ladder -> ladder.getStartPosition() == position).findFirst().orElse(null);
    }

    private Snake findSnakeAt(int position) {
        return snakes.stream().filter(snake -> snake.getStartPosition() == position).findFirst().orElse(null);
    }
    

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }
    
}
