package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastChars {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void last_chars_v01() {
        assertEquals("ls", solution.lastChars("last", "chars"));
    }

    @Test
    public void last_chars_v02() {
        assertEquals("ya", solution.lastChars("yo", "yava"));
    }

    @Test
    public void last_chars_v03() {
        assertEquals("h@", solution.lastChars("hi", ""));
    }

    @Test
    public void last_chars_v04() {
        assertEquals("@o", solution.lastChars("", "hello"));
    }

    @Test
    public void last_chars_v05() {
        assertEquals("@@", solution.lastChars("", ""));
    }

    @Test
    public void last_chars_v06() {
        assertEquals("ki", solution.lastChars("kitten", "hi"));
    }

    @Test
    public void last_chars_v07() {
        assertEquals("kp", solution.lastChars("k", "zip"));
    }

    @Test
    public void last_chars_v08() {
        assertEquals("k@", solution.lastChars("kitten", ""));
    }

    @Test
    public void last_chars_v09() {
        assertEquals("kp", solution.lastChars("kitten", "zip"));
    }
}
