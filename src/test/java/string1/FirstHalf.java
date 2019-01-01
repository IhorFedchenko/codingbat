package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstHalf {

    @Test
    public void first_half_v01() {
        Solution solution = new Solution();
        assertEquals("Woo", solution.firstHalf("WooHoo"));
    }

    @Test
    public void first_half_v02() {
        Solution solution = new Solution();
        assertEquals("Hello", solution.firstHalf("HelloThere"));
    }

    @Test
    public void first_half_v03() {
        Solution solution = new Solution();
        assertEquals("abc", solution.firstHalf("abcdef"));
    }

    @Test
    public void first_half_v04() {
        Solution solution = new Solution();
        assertEquals("a", solution.firstHalf("ab"));
    }

    @Test
    public void first_half_v05() {
        Solution solution = new Solution();
        assertEquals("", solution.firstHalf(""));
    }

    @Test
    public void first_half_v06() {
        Solution solution = new Solution();
        assertEquals("01234", solution.firstHalf("0123456789"));
    }

    @Test
    public void first_half_v07() {
        Solution solution = new Solution();
        assertEquals("kit", solution.firstHalf("kitten"));
    }
}
