package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class divideTest {

    @Test
    public void divide() {
        JunitTesting test = new JunitTesting();
        double actual = test.divide(6, 2);
        double expected = 3.0;
        assertEquals(expected, actual, 0.0);
    }
}