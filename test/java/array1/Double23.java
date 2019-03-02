package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Double23 {

    @Test
    public void double23_v01() {
        Solution solution = new Solution();
        assertTrue(solution.double23(new int[]{2, 2}));
    }

    @Test
    public void double23_v02() {
        Solution solution = new Solution();
        assertTrue(solution.double23(new int[]{3, 3}));
    }

    @Test
    public void double23_v03() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{2, 3}));
    }

    @Test
    public void double23_v04() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{3, 2}));
    }

    @Test
    public void double23_v05() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{4, 5}));
    }

    @Test
    public void double23_v06() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{2}));
    }

    @Test
    public void double23_v07() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{3}));
    }

    @Test
    public void double23_v08() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{}));
    }

    @Test
    public void double23_v09() {
        Solution solution = new Solution();
        assertFalse(solution.double23(new int[]{3, 4}));
    }
}
