package models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() throws Exception {
        ArrayList<Snake> snakes = new ArrayList<>();
        ArrayList<Ladder> ladders = new ArrayList<>();
        board = new Board(100, snakes, ladders);
    }
    

    @Test
    public void getPlayers_should_return_all_players_on_the_board() {
        final LinkedList<Player> players = new LinkedList<>();
        players.add(new Player("some-name"));
        board.setPlayers(players);

        assertEquals(players, board.getPlayers());
    }
}
