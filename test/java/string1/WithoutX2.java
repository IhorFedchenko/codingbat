package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutX2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without_x2_xHi() {
        assertEquals("Hi", solution.withoutX2("xHi"));
    }

    @Test
    public void without_x2_Hxi() {
        assertEquals("Hi", solution.withoutX2("Hxi"));
    }

    @Test
    public void without_x2_Hi() {
        assertEquals("Hi", solution.withoutX2("Hi"));
    }

    @Test
    public void without_x2_xxHi() {
        assertEquals("Hi", solution.withoutX2("xxHi"));
    }

    @Test
    public void without_x2_Hix() {
        assertEquals("Hix", solution.withoutX2("Hix"));
    }

    @Test
    public void without_x2_xaxb() {
        assertEquals("axb", solution.withoutX2("xaxb"));
    }

    @Test
    public void without_x2_xx() {
        assertEquals("", solution.withoutX2("xx"));
    }

    @Test
    public void without_x2_x() {
        assertEquals("", solution.withoutX2("x"));
    }

    @Test
    public void without_x2__() {
        assertEquals("", solution.withoutX2(""));
    }

    @Test
    public void without_x2_Hello() {
        assertEquals("Hello", solution.withoutX2("Hello"));
    }

    @Test
    public void without_x2_Hexllo() {
        assertEquals("Hexllo", solution.withoutX2("Hexllo"));
    }

    @Test
    public void without_x2_xHxllo() {
        assertEquals("Hxllo", solution.withoutX2("xHxllo"));
    }
}
