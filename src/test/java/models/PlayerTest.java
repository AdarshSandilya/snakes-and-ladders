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
        player.setPosition(1);
        
        assertEquals(1, player.getPosition());
    }
}