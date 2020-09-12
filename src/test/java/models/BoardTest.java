package models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board(100);
    }

    @Test
    public void getSnakes_should_return_all_snakes_on_the_board() {
        final ArrayList<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(12, 7));
        board.setSnakes(snakes);
        
        assertEquals(snakes, board.getSnakes());
    }


    @Test
    public void getPlayers_should_return_all_players_on_the_board() {
        final ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("some-name"));
        board.setPlayers(players);

        assertEquals(players, board.getPlayers());
    }


    @Test
    public void getLadders_should_return_all_ladders_on_the_board() {
        final ArrayList<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(12, 7));
        board.setLadder(ladders);

        assertEquals(ladders, board.getLadders());
    }
}
