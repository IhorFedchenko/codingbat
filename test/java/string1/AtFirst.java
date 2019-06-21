package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtFirst {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void at_first_v01() {
        assertEquals("he", solution.atFirst("hello"));
    }

    @Test
    public void at_first_v02() {
        assertEquals("hi", solution.atFirst("hi"));
    }

    @Test
    public void at_first_v03() {
        assertEquals("h@", solution.atFirst("h"));
    }

    @Test
    public void at_first_v04() {
        assertEquals("@@", solution.atFirst(""));
    }

    @Test
    public void at_first_v05() {
        assertEquals("ki", solution.atFirst("kitten"));
    }

    @Test
    public void at_first_v06() {
        assertEquals("ja", solution.atFirst("java"));
    }

    @Test
    public void at_first_v07() {
        assertEquals("j@", solution.atFirst("j"));
    }
}
