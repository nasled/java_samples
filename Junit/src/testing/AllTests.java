package testing;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        countATest.class,
        squareTest.class,
        divideTest.class
})


public class AllTests {
}
