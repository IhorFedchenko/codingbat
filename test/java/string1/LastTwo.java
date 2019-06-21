package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastTwo {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void last_two_coding() {
        assertEquals("codign", solution.lastTwo("coding"));
    }

    @Test
    public void last_two_cat() {
        assertEquals("cta", solution.lastTwo("cat"));
    }

    @Test
    public void last_two_ba() {
        assertEquals("ba", solution.lastTwo("ab"));
    }

    @Test
    public void last_two_a() {
        assertEquals("a", solution.lastTwo("a"));
    }

    @Test
    public void last_two__() {
        assertEquals("", solution.lastTwo(""));
    }
}
