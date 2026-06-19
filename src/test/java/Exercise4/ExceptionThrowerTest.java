package Exercise4;

import com.telusko.Exercise4.ExceptionThrower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {
    ExceptionThrower exceptionthrower=new ExceptionThrower();
    @Test
    void testException(){
        assertThrows(IllegalArgumentException.class,()->exceptionthrower.throwException());
    }
}
