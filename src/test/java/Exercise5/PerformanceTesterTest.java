package Exercise5;

import com.telusko.Exercise5.PerformanceTester;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {
    PerformanceTester performanceTester =
            new PerformanceTester();

    @Test

    void testPerformance(){

        assertTimeout(

                Duration.ofSeconds(2),

                () -> performanceTester
                        .performTask()

        );

    }
}
