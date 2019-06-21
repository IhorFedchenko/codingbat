package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheEnd {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void the_end_v01() {
        assertEquals("H", solution.theEnd("Hello", true));
    }

    @Test
    public void the_end_v02() {
        assertEquals("o", solution.theEnd("Hello", false));
    }

    @Test
    public void the_end_v03() {
        assertEquals("o", solution.theEnd("oh", true));
    }

    @Test
    public void the_end_v04() {
        assertEquals("h", solution.theEnd("oh", false));
    }

    @Test
    public void the_end_v05() {
        assertEquals("x", solution.theEnd("x", true));
    }

    @Test
    public void the_end_v06() {
        assertEquals("x", solution.theEnd("x", false));
    }

    @Test
    public void the_end_v07() {
        assertEquals("j", solution.theEnd("java", true));
    }

    @Test
    public void the_end_v08() {
        assertEquals("e", solution.theEnd("chocolate", false));
    }

    @Test
    public void the_end_v09() {
        assertEquals("1", solution.theEnd("1234", true));
    }

    @Test
    public void the_end_v10() {
        assertEquals("e", solution.theEnd("code", false));
    }
}
