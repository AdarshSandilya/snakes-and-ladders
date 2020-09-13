package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LadderTest {

    @Test
    public void getStartPosition_should_return_start_of_the_ladder() {
        Ladder ladder = new Ladder(2, 5);
        
        assertThat(2, is(ladder.getStartPosition()));
    }
}