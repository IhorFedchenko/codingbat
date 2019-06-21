package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class withoutX {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without_xHix() {
        assertEquals("Hi", solution.withoutX("xHix"));
    }

    @Test
    public void without_xHi() {
        assertEquals("Hi", solution.withoutX("xHi"));
    }

    @Test
    public void without_Hxix() {
        assertEquals("Hxi", solution.withoutX("Hxix"));
    }

    @Test
    public void without_Hi() {
        assertEquals("Hi", solution.withoutX("Hi"));
    }

    @Test
    public void without_xxHi() {
        assertEquals("xHi", solution.withoutX("xxHi"));
    }

    @Test
    public void without_Hix() {
        assertEquals("Hi", solution.withoutX("Hix"));
    }

    @Test
    public void without_xaxbx() {
        assertEquals("axb", solution.withoutX("xaxbx"));
    }

    @Test
    public void without_xx() {
        assertEquals("", solution.withoutX("xx"));
    }

    @Test
    public void without__() {
        assertEquals("", solution.withoutX(""));
    }

    @Test
    public void without_Hello() {
        assertEquals("Hello", solution.withoutX("Hello"));
    }

    @Test
    public void without_Hexllo() {
        assertEquals("Hexllo", solution.withoutX("Hexllo"));
    }
}
