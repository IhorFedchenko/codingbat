package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Without2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without2_HelloHe() {
        assertEquals("lloHe", solution.without2("HelloHe"));
    }

    @Test
    public void without2_HelloHi() {
        assertEquals("HelloHi", solution.without2("HelloHi"));
    }

    @Test
    public void without2_Hi() {
        assertEquals("", solution.without2("Hi"));
    }

    @Test
    public void without2_Chocolate() {
        assertEquals("Chocolate", solution.without2("Chocolate"));
    }

    @Test
    public void without2_xxx() {
        assertEquals("x", solution.without2("x"));
    }

    @Test
    public void without2_xx() {
        assertEquals("", solution.without2(""));
    }

    @Test
    public void without2_x() {
        assertEquals("x", solution.without2("x"));
    }

    @Test
    public void without2___() {
        assertEquals("", solution.without2(""));
    }

    @Test
    public void without2_Fruits() {
        assertEquals("Fruits", solution.without2("Fruits"));
    }
}
