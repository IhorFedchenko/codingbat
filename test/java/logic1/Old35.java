package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Old35 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void old35_3() {
        assertTrue(solution.old35(3));
    }

    @Test
    public void old35_10() {
        assertTrue(solution.old35(10));
    }

    @Test
    public void old35_15() {
        assertFalse(solution.old35(15));
    }

    @Test
    public void old35_5() {
        assertTrue(solution.old35(5));
    }

    @Test
    public void old35_9() {
        assertTrue(solution.old35(9));
    }

    @Test
    public void old35_8() {
        assertFalse(solution.old35(8));
    }

    @Test
    public void old35_7() {
        assertFalse(solution.old35(7));
    }

    @Test
    public void old35_6() {
        assertTrue(solution.old35(6));
    }

    @Test
    public void old35_17() {
        assertFalse(solution.old35(17));
    }

    @Test
    public void old35_18() {
        assertTrue(solution.old35(18));
    }

    @Test
    public void old35_29() {
        assertFalse(solution.old35(29));
    }

    @Test
    public void old35_20() {
        assertTrue(solution.old35(20));
    }

    @Test
    public void old35_21() {
        assertTrue(solution.old35(21));
    }

    @Test
    public void old35_22() {
        assertFalse(solution.old35(22));
    }

    @Test
    public void old35_45() {
        assertFalse(solution.old35(45));
    }

    @Test
    public void old35_99() {
        assertTrue(solution.old35(99));
    }
}
