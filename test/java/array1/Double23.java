package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Double23 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void double23_v01() {
        assertTrue(solution.double23(new int[]{2, 2}));
    }

    @Test
    public void double23_v02() {
        assertTrue(solution.double23(new int[]{3, 3}));
    }

    @Test
    public void double23_v03() {
        assertFalse(solution.double23(new int[]{2, 3}));
    }

    @Test
    public void double23_v04() {
        assertFalse(solution.double23(new int[]{3, 2}));
    }

    @Test
    public void double23_v05() {
        assertFalse(solution.double23(new int[]{4, 5}));
    }

    @Test
    public void double23_v06() {
        assertFalse(solution.double23(new int[]{2}));
    }

    @Test
    public void double23_v07() {
        assertFalse(solution.double23(new int[]{3}));
    }

    @Test
    public void double23_v08() {
        assertFalse(solution.double23(new int[]{}));
    }

    @Test
    public void double23_v09() {
        assertFalse(solution.double23(new int[]{3, 4}));
    }
}
