package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class twoChar {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void two_char_v01() {
        assertEquals("ja", solution.twoChar("java", 0));
    }

    @Test
    public void two_char_v02() {
        assertEquals("va", solution.twoChar("java", 2));
    }

    @Test
    public void two_char_v03() {
        assertEquals("ja", solution.twoChar("java", 3));
    }

    @Test
    public void two_char_v04() {
        assertEquals("ja", solution.twoChar("java", 4));
    }

    @Test
    public void two_char_v05() {
        assertEquals("ja", solution.twoChar("java", -1));
    }

    @Test
    public void two_char_v06() {
        assertEquals("He", solution.twoChar("Hello", 0));
    }

    @Test
    public void two_char_v07() {
        assertEquals("el", solution.twoChar("Hello", 1));
    }

    @Test
    public void two_char_v08() {
        assertEquals("He", solution.twoChar("Hello", 99));
    }

    @Test
    public void two_char_v09() {
        assertEquals("lo", solution.twoChar("Hello", 3));
    }

    @Test
    public void two_char_v10() {
        assertEquals("He", solution.twoChar("Hello", 4));
    }

    @Test
    public void two_char_v11() {
        assertEquals("He", solution.twoChar("Hello", 5));
    }

    @Test
    public void two_char_v12() {
        assertEquals("He", solution.twoChar("Hello", -7));
    }

    @Test
    public void two_char_v13() {
        assertEquals("He", solution.twoChar("Hello", 6));
    }

    @Test
    public void two_char_v14() {
        assertEquals("He", solution.twoChar("Hello", -1));
    }

    @Test
    public void two_char_v15() {
        assertEquals("ya", solution.twoChar("yay", 0));
    }

}
