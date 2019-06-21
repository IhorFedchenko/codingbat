package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringX {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_x_xHix() {
        assertEquals("xHix", solution.stringX("xHix"));
    }

    @Test
    public void string_x_abxxxcd() {
        assertEquals("abcd", solution.stringX("abxxxcd"));
    }

    @Test
    public void string_x_xabxxxcdx() {
        assertEquals("xabcdx", solution.stringX("xabxxxcdx"));
    }

    @Test
    public void string_x_xKittenx() {
        assertEquals("xKittenx", solution.stringX("xKittenx"));
    }

    @Test
    public void string_x_Hello() {
        assertEquals("Hello", solution.stringX("Hello"));
    }

    @Test
    public void string_x_xx() {
        assertEquals("xx", solution.stringX("xx"));
    }

    @Test
    public void string_x() {
        assertEquals("x", solution.stringX("x"));
    }

    @Test
    public void string_x__() {
        assertEquals("", solution.stringX(""));
    }
}
