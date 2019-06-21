package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordEnds {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void word_ends_v01() {
        assertEquals("c13i", solution.wordEnds("abcXY123XYijk", "XY"));
    }

    @Test
    public void word_ends_v02() {
        assertEquals("13", solution.wordEnds("XY123XY", "XY"));
    }

    @Test
    public void word_ends_v03() {
        assertEquals("11", solution.wordEnds("XY1XY", "XY"));
    }

    @Test
    public void word_ends_v04() {
        assertEquals("XY", solution.wordEnds("XYXY", "XY"));
    }

    @Test
    public void word_ends_v05() {
        assertEquals("", solution.wordEnds("XY", "XY"));
    }

    @Test
    public void word_ends_v06() {
        assertEquals("", solution.wordEnds("Hi", "XY"));
    }

    @Test
    public void word_ends_v07() {
        assertEquals("", solution.wordEnds("", "XY"));
    }

    @Test
    public void word_ends_v08() {
        assertEquals("cxziij", solution.wordEnds("abc1xyz1i1j", "1"));
    }

    @Test
    public void word_ends_v09() {
        assertEquals("cxz", solution.wordEnds("abc1xyz1", "1"));
    }

    @Test
    public void word_ends_v10() {
        assertEquals("cxz11", solution.wordEnds("abc1xyz11", "1"));
    }

    @Test
    public void word_ends_v11() {
        assertEquals("11", solution.wordEnds("abc1xyz1abc", "abc"));
    }

    @Test
    public void word_ends_v12() {
        assertEquals("acac", solution.wordEnds("abc1xyz1abc", "b"));
    }

    @Test
    public void word_ends_v13() {
        assertEquals("1111", solution.wordEnds("abc1abc1abc", "abc"));
    }
}
