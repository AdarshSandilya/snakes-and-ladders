package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class NormalDiceTest {

    @Test
    public void should_return_any_number_bw_1_to_6() {
        int min =1;
        int max =6;

        int resultedNumber = NormalDice.roll();
        assertTrue(min <= resultedNumber && resultedNumber <= max);
    }
}