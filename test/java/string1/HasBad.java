package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasBad {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void has_bad_badxx() {
        assertTrue(solution.hasBad("badxx"));
    }

    @Test
    public void has_bad_xbadxx() {
        assertTrue(solution.hasBad("badxx"));
    }

    @Test
    public void has_bad_xxbadxx() {
        assertFalse(solution.hasBad("xxbadxx"));
    }

    @Test
    public void has_bad_code() {
        assertFalse(solution.hasBad("code"));
    }

    @Test
    public void has_bad_bad() {
        assertTrue(solution.hasBad("bad"));
    }

    @Test
    public void has_bad_ba() {
        assertFalse(solution.hasBad("ba"));
    }

    @Test
    public void has_bad_xba() {
        assertFalse(solution.hasBad("xba"));
    }

    @Test
    public void has_bad_xbad() {
        assertTrue(solution.hasBad("xbad"));
    }

    @Test
    public void has_bad__() {
        assertFalse(solution.hasBad(""));
    }

    @Test
    public void has_bad_badyy() {
        assertTrue(solution.hasBad("badyy"));
    }
}
