package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Unlucky1 {

    @Test
    public void unlucky_v01() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 3, 4, 5}));
    }

    @Test
    public void unlucky_v02() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{2, 1, 3, 4, 5}));
    }

    @Test
    public void unlucky_v03() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 1, 1}));
    }

    @Test
    public void unlucky_v04() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 3, 1}));
    }

    @Test
    public void unlucky_v05() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 1, 3}));
    }

    @Test
    public void unlucky_v06() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 2, 3}));
    }

    @Test
    public void unlucky_v07() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{3, 3, 3}));
    }

    @Test
    public void unlucky_v08() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 3}));
    }

    @Test
    public void unlucky_v09() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 4}));
    }

    @Test
    public void unlucky_v10() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1}));
    }

    @Test
    public void unlucky_v11() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{}));
    }

    @Test
    public void unlucky_v12() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    public void unlucky_v13() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 1, 3, 1, 1}));
    }

    @Test
    public void unlucky_v14() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 1, 1, 1, 3}));
    }

    @Test
    public void unlucky_v15() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 4, 1, 5}));
    }

    @Test
    public void unlucky_v16() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{1, 1, 2, 3}));
    }

    @Test
    public void unlucky_v17() {
        Solution solution = new Solution();
        assertFalse(solution.unlucky1(new int[]{2, 3, 2, 1}));
    }

    @Test
    public void unlucky_v18() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{2, 3, 1, 3}));
    }

    @Test
    public void unlucky_v19() {
        Solution solution = new Solution();
        assertTrue(solution.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
    }
}
