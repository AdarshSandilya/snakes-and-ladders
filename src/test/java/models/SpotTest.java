package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpotTest {

    @Test
    public void getPositionValue_should_return_position_of_the_spot_on_the_board(){
        Spot spot = new Spot(2, new NormalSpot(0));
        
        assertEquals(2, spot.getPositionValue());
    }

    @Test
    public void should_return_true_if_spot_type_is_a_snake() {
        Spot spot = new Spot(2, new Snake(4, 2));
        
        assertTrue(spot.hasSnake());
    }

    @Test
    public void should_return_false_when_spot_type_is_not_a_snake() {
        Spot spot = new Spot(2, new Ladder(4, 5));

        assertFalse(spot.hasSnake());
    }

    @Test
    public void should_return_true_if_spot_type_is_a_ladder() {
        Spot spot = new Spot(2, new Ladder(2, 4));

        assertTrue(spot.hasLadder());
    }

    @Test
    public void should_return_false_when_spot_type_is_not_a_ladder() {
        Spot spot = new Spot(2, new Snake(6, 5));
        
        assertFalse(spot.hasLadder());
    }
}