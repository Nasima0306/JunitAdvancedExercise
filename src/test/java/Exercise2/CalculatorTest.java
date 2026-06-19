package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition(){
         assertEquals(5,2+3);
    }
    @Test
    void testSubtraction(){
        assertEquals(2,5-3);
    }
}
