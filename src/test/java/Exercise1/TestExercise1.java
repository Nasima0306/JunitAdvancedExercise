package Exercise1;

import com.telusko.Exercise1.EvenChecker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestExercise1 {
    EvenChecker evenChecker=new EvenChecker();
    @ParameterizedTest
    @ValueSource(
            ints={2,4,6,8,10}
    )

    public void testEvenNumbers(int n){
        assertTrue(evenChecker.isEven(n));
    }
}
