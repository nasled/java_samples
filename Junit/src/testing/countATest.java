package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class countATest {

    @Test
    public void count() {
        JunitTesting test = new JunitTesting();
        int output = test.count("alphabet");
        assertEquals(2, output);
    }
}