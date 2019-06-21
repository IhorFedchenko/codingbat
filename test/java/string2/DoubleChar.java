package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleChar {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void double_char_v01() {
        assertEquals("TThhee", solution.doubleChar("The"));
    }

    @Test
    public void double_char_v02() {
        assertEquals("AAAAbbbb", solution.doubleChar("AAbb"));
    }

    @Test
    public void double_char_v03() {
        assertEquals("HHii--TThheerree", solution.doubleChar("Hi-There"));
    }

    @Test
    public void double_char_v04() {
        assertEquals("WWoorrdd!!", solution.doubleChar("Word!"));
    }

    @Test
    public void double_char_v05() {
        assertEquals("!!!!", solution.doubleChar("!!"));
    }

    @Test
    public void double_char_v06() {
        assertEquals("", solution.doubleChar(""));
    }

    @Test
    public void double_char_v07() {
        assertEquals("aa", solution.doubleChar("a"));
    }

    @Test
    public void double_char_v08() {
        assertEquals("..", solution.doubleChar("."));
    }

    @Test
    public void double_char_v09() {
        assertEquals("aaaa", solution.doubleChar("aa"));
    }
}
