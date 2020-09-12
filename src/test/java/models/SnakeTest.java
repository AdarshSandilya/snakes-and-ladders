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

}