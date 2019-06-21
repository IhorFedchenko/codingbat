package logic1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SquirrelPlay {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void squirrelPlay_v01() {
        assertTrue(solution.squirrelPlay(70, false));
    }

    @Test
    public void squirrelPlay_v02() {
        assertFalse(solution.squirrelPlay(95, false));
    }

    @Test
    public void squirrelPlay_v03() {
        assertTrue(solution.squirrelPlay(95, true));
    }

    @Test
    public void squirrelPlay_v04() {
        assertTrue(solution.squirrelPlay(90, false));
    }

    @Test
    public void squirrelPlay_v05() {
        assertTrue(solution.squirrelPlay(90, true));
    }

    @Test
    public void squirrelPlay_v06() {
        assertFalse(solution.squirrelPlay(50, false));
    }

    @Test
    public void squirrelPlay_v07() {
        assertFalse(solution.squirrelPlay(50, true));
    }

    @Test
    public void squirrelPlay_v08() {
        assertFalse(solution.squirrelPlay(100, false));
    }

    @Test
    public void squirrelPlay_v09() {
        assertTrue(solution.squirrelPlay(100, true));
    }

    @Test
    public void squirrelPlay_v10() {
        assertFalse(solution.squirrelPlay(105, true));
    }

    @Test
    public void squirrelPlay_v11() {
        assertFalse(solution.squirrelPlay(59, false));
    }

    @Test
    public void squirrelPlay_v12() {
        assertFalse(solution.squirrelPlay(59, true));
    }

    @Test
    public void squirrelPlay_v13() {
        assertTrue(solution.squirrelPlay(60, false));
    }
}
