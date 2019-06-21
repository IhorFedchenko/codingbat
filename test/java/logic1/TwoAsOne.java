package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoAsOne {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void two_as_one_v01() {
        assertTrue(solution.twoAsOne(1, 2, 3));
    }

    @Test
    public void two_as_one_v02() {
        assertTrue(solution.twoAsOne(3, 1, 2));
    }

    @Test
    public void two_as_one_v03() {
        assertFalse(solution.twoAsOne(3, 2, 2));
    }

    @Test
    public void two_as_one_v04() {
        assertTrue(solution.twoAsOne(2, 3, 1));
    }

    @Test
    public void two_as_one_v05() {
        assertFalse(solution.twoAsOne(6, 3, -2));
    }

    @Test
    public void two_as_one_v06() {
        assertFalse(solution.twoAsOne(5, 3, -3));
    }

    @Test
    public void two_as_one_v07() {
        assertTrue(solution.twoAsOne(2, 5, 3));
    }

    @Test
    public void two_as_one_v08() {
        assertFalse(solution.twoAsOne(9, 5, 5));
    }

    @Test
    public void two_as_one_v09() {
        assertTrue(solution.twoAsOne(9, 4, 5));
    }

    @Test
    public void two_as_one_v10() {
        assertTrue(solution.twoAsOne(5, 4, 9));
    }

    @Test
    public void two_as_one_v11() {
        assertTrue(solution.twoAsOne(3, 3, 0));
    }

    @Test
    public void two_as_one_v12() {
        assertFalse(solution.twoAsOne(3, 3, 2));
    }
}
