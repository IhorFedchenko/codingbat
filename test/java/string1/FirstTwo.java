package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTwo {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void first_two_v01() {
        assertEquals("He", solution.firstTwo("Hello"));
    }

    @Test
    public void first_two_v02() {
        assertEquals("ab", solution.firstTwo("abcdefg"));
    }

    @Test
    public void first_two_v03() {
        assertEquals("ab", solution.firstTwo("ab"));
    }

    @Test
    public void first_two_v04() {
        assertEquals("a", solution.firstTwo("a"));
    }

    @Test
    public void first_two_v05() {
        assertEquals("", solution.firstTwo(""));
    }

    @Test
    public void first_two_v06() {
        assertEquals("Ki", solution.firstTwo("Kitten"));
    }

    @Test
    public void first_two_v07() {
        assertEquals("hi", solution.firstTwo("hi"));
    }

    @Test
    public void first_two_v08() {
        assertEquals("hi", solution.firstTwo("hiya"));
    }
}
