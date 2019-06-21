package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BobThere {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void bob_there_v01() {
        assertTrue(solution.bobThere("abcbob"));
    }

    @Test
    public void bob_there_v02() {
        assertTrue(solution.bobThere("b9b"));
    }

    @Test
    public void bob_there_v03() {
        assertFalse(solution.bobThere("bac"));
    }

    @Test
    public void bob_there_v04() {
        assertTrue(solution.bobThere("bbb"));
    }

    @Test
    public void bob_there_v05() {
        assertFalse(solution.bobThere("abcdefb"));
    }

    @Test
    public void bob_there_v06() {
        assertTrue(solution.bobThere("123abcbcdbabxyz"));
    }

    @Test
    public void bob_there_v07() {
        assertFalse(solution.bobThere("b12"));
    }

    @Test
    public void bob_there_v08() {
        assertTrue(solution.bobThere("b1b"));
    }

    @Test
    public void bob_there_v09() {
        assertTrue(solution.bobThere("b12b1b"));
    }

    @Test
    public void bob_there_v10() {
        assertFalse(solution.bobThere("bbc"));
    }

    @Test
    public void bob_there_v11() {
        assertTrue(solution.bobThere("bbb"));
    }

    @Test
    public void bob_there_v12() {
        assertFalse(solution.bobThere("bb"));
    }

    @Test
    public void bob_there_v13() {
        assertFalse(solution.bobThere("b"));
    }
}
