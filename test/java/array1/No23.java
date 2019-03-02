package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class No23 {

    @Test
    public void no23_v01() {
        Solution solution = new Solution();
        assertTrue(solution.no23(new int[]{4, 5}));
    }

    @Test
    public void no23_v02() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{4, 2}));
    }

    @Test
    public void no23_v03() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{3, 5}));
    }

    @Test
    public void no23_v04() {
        Solution solution = new Solution();
        assertTrue(solution.no23(new int[]{1, 9}));
    }

    @Test
    public void no23_v05() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{2, 9}));
    }

    @Test
    public void no23_v06() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{1, 3}));
    }

    @Test
    public void no23_v07() {
        Solution solution = new Solution();
        assertTrue(solution.no23(new int[]{1, 1}));
    }

    @Test
    public void no23_v08() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{2, 2}));
    }

    @Test
    public void no23_v09() {
        Solution solution = new Solution();
        assertFalse(solution.no23(new int[]{3, 3}));
    }

    @Test
    public void no23_v10() {
        Solution solution = new Solution();
        assertTrue(solution.no23(new int[]{7, 8}));
    }

    @Test
    public void no23_v11() {
        Solution solution = new Solution();
        assertTrue(solution.no23(new int[]{8, 7}));
    }
}
