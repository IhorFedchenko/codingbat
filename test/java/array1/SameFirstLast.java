package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameFirstLast {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void same_first_last_v01() {
        assertFalse(solution.sameFirstLast(new int[]{1, 2, 3}));
    }

    @Test
    public void same_first_last_v02() {
        assertTrue(solution.sameFirstLast(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void same_first_last_v03() {
        assertTrue(solution.sameFirstLast(new int[]{1, 2, 1}));
    }

    @Test
    public void same_first_last_v04() {
        assertTrue(solution.sameFirstLast(new int[]{7}));
    }

    @Test
    public void same_first_last_v05() {
        assertFalse(solution.sameFirstLast(new int[]{}));
    }

    @Test
    public void same_first_last_v06() {
        assertTrue(solution.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
    }

    @Test
    public void same_first_last_v07() {
        assertFalse(solution.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}));
    }

    @Test
    public void same_first_last_v08() {
        assertTrue(solution.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}));
    }

    @Test
    public void same_first_last_v09() {
        assertTrue(solution.sameFirstLast(new int[]{7, 7}));
    }
}
