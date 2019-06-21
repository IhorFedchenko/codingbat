package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstHalf {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void first_half_v01() {
        assertEquals("Woo", solution.firstHalf("WooHoo"));
    }

    @Test
    public void first_half_v02() {
        assertEquals("Hello", solution.firstHalf("HelloThere"));
    }

    @Test
    public void first_half_v03() {
        assertEquals("abc", solution.firstHalf("abcdef"));
    }

    @Test
    public void first_half_v04() {
        assertEquals("a", solution.firstHalf("ab"));
    }

    @Test
    public void first_half_v05() {
        assertEquals("", solution.firstHalf(""));
    }

    @Test
    public void first_half_v06() {
        assertEquals("01234", solution.firstHalf("0123456789"));
    }

    @Test
    public void first_half_v07() {
        assertEquals("kit", solution.firstHalf("kitten"));
    }
}
