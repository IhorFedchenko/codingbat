package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStart {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void non_start_v01() {
        assertEquals("ellohere", solution.nonStart("Hello", "There"));
    }

    @Test
    public void non_start_v02() {
        assertEquals("avaode", solution.nonStart("java", "code"));
    }

    @Test
    public void non_start_v03() {
        assertEquals("hotlava", solution.nonStart("shotl", "java"));
    }

    @Test
    public void non_start_v04() {
        assertEquals("by", solution.nonStart("ab", "xy"));
    }

    @Test
    public void non_start_v05() {
        assertEquals("b", solution.nonStart("ab", "x"));
    }

    @Test
    public void non_start_v06() {
        assertEquals("c", solution.nonStart("x", "ac"));
    }

    @Test
    public void non_start_v07() {
        assertEquals("", solution.nonStart("a", "x"));
    }

    @Test
    public void non_start_v08() {
        assertEquals("itat", solution.nonStart("kit", "kat"));
    }

    @Test
    public void non_start_v09() {
        assertEquals("artart", solution.nonStart("mart", "dart"));
    }
}
