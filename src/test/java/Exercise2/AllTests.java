package Exercise2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculatorTest.class,

        StringOperationsTest.class
}

)
public class AllTests {

}
