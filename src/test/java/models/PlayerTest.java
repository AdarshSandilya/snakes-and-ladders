package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("some-name");
    }

    @Test
    public void should_return_current_position_of_player() {
        Spot spot = new Spot(1, new NormalSpot(0));
        player.setPosition(spot);
        
        assertEquals(spot, player.getPosition());
    }
}