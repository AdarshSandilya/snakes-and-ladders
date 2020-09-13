package models;

import org.junit.Test;

public class SnakeTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_an_exception_if_startPosition_is_less_than_endPosition() {
        new Snake(1, 2);
    }


    @Test
    public void should_not_throw_an_exception_if_startPosition_is_greater_than_endPosition() {
        new Snake(2, 1);
    }

    @Test
    public void getStartPosition_should_return_start_position_of_the_snake() {
        int startPosition = 2;
        int endPosition = 1;
        Snake snake = new Snake(startPosition, endPosition);
        
//        assertThat()
    }
}