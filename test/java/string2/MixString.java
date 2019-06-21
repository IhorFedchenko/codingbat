package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MixString {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void mix_string_v01() {
        assertEquals("axbycz", solution.mixString("abc", "xyz"));
    }

    @Test
    public void mix_string_v02() {
        assertEquals("HTihere", solution.mixString("Hi", "There"));
    }

    @Test
    public void mix_string_v03() {
        assertEquals("xTxhxexre", solution.mixString("xxxx", "There"));
    }

    @Test
    public void mix_string_v04() {
        assertEquals("xXxx", solution.mixString("xxx", "X"));
    }

    @Test
    public void mix_string_v05() {
        assertEquals("22/7 around", solution.mixString("2/", "27 around"));
    }

    @Test
    public void mix_string_v06() {
        assertEquals("Hello", solution.mixString("", "Hello"));
    }

    @Test
    public void mix_string_v07() {
        assertEquals("Abc", solution.mixString("Abc", ""));
    }

    @Test
    public void mix_string_v08() {
        assertEquals("", solution.mixString("", ""));
    }

    @Test
    public void mix_string_v09() {
        assertEquals("ab", solution.mixString("a", "b"));
    }

    @Test
    public void mix_string_v10() {
        assertEquals("abx", solution.mixString("ax", "b"));
    }

    @Test
    public void mix_string_v11() {
        assertEquals("abx", solution.mixString("a", "bx"));
    }

    @Test
    public void mix_string_v12() {
        assertEquals("SLoong", solution.mixString("So", "Long"));
    }

    @Test
    public void mix_string_v13() {
        assertEquals("LSoong", solution.mixString("Long", "So"));
    }
}
