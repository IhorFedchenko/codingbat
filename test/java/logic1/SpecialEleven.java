package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SpecialEleven {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void specialEleven_22() {
        assertTrue(solution.specialEleven(22));
    }

    @Test
    public void specialEleven_23() {
        assertTrue(solution.specialEleven(23));
    }

    @Test
    public void specialEleven_24() {
        assertFalse(solution.specialEleven(24));
    }

    @Test
    public void specialEleven_21() {
        assertFalse(solution.specialEleven(21));
    }

    @Test
    public void specialEleven_11() {
        assertTrue(solution.specialEleven(11));
    }

    @Test
    public void specialEleven_12() {
        assertTrue(solution.specialEleven(12));
    }

    @Test
    public void specialEleven_10() {
        assertFalse(solution.specialEleven(10));
    }

    @Test
    public void specialEleven_9() {
        assertFalse(solution.specialEleven(9));
    }

    @Test
    public void specialEleven_8() {
        assertFalse(solution.specialEleven(8));
    }

    @Test
    public void specialEleven_0() {
        assertTrue(solution.specialEleven(0));
    }

    @Test
    public void specialEleven_1() {
        assertTrue(solution.specialEleven(1));
    }

    @Test
    public void specialEleven_2() {
        assertFalse(solution.specialEleven(2));
    }

    @Test
    public void specialEleven_121() {
        assertTrue(solution.specialEleven(121));
    }

    @Test
    public void specialEleven_122() {
        assertTrue(solution.specialEleven(122));
    }

    @Test
    public void specialEleven_123() {
        assertFalse(solution.specialEleven(123));
    }

    @Test
    public void specialEleven_46() {
        assertFalse(solution.specialEleven(46));
    }

    @Test
    public void specialEleven_49() {
        assertFalse(solution.specialEleven(49));
    }

    @Test
    public void specialEleven_52() {
        assertFalse(solution.specialEleven(52));
    }

    @Test
    public void specialEleven_54() {
        assertFalse(solution.specialEleven(54));
    }

    @Test
    public void specialEleven_55() {
        assertTrue(solution.specialEleven(55));
    }
}
