package fi.vamk.studentid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addTest(){
        assertEquals(10, App.add(6,4));
        assertEquals(0, App.add(0,0));
        assertEquals(0, App.add(-6,6));
    }

    @Test
    public void divideTest(){
        assertEquals(1.33d, App.divide(4.0d,3.0d), 0);
        assertEquals(0.0d, App.divide(0.0d,1.0d), 0);
        assertEquals(Double.NaN, App.divide(5.0d, 0.0d), 0);
    }

    @Test
    public void returnTwoCharsTest(){
        assertEquals("qw", App.returnTwoChars("qwerty"));
        assertEquals("VA", App.returnTwoChars("VA"));
        assertEquals("V", App.returnTwoChars("V"));
        assertEquals("", App.returnTwoChars(""));
        assertEquals(null, App.returnTwoChars(null));
    }

    @Test
    public void divTest(){
        assertEquals(Double.valueOf(1.33), App.div(new Double(4), new Double(3)), .2);
        assertEquals(Double.valueOf(33), App.div(new Double(99), new Double(3)), .2);
        assertEquals(null, App.div(null, new Double(3)));
        assertEquals(null, App.div(new Double(3), null));
        assertEquals(null, App.div(new Double(3), new Double(0)));
    }
}
