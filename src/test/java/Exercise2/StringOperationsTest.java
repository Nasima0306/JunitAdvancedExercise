package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOperationsTest {

    @Test
    public void testUpperCase(){
        assertEquals("HELLO","hello".toUpperCase());
    }
    public void testlength(){
        assertEquals(5,"Hello".length());
    }
}
