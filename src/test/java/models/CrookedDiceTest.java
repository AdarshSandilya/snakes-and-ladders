package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrookedDiceTest {

    @Test
    public void should_return_even_numbers_bw_1_to_6() {
        int min =1;
        int max =6;

        int resultedNumber = new CrookedDice().roll();
        assertTrue(resultedNumber %2==0 &&  resultedNumber<=max && resultedNumber >min );
    }

}