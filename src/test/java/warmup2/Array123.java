package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Array123 {

    @Test
    public void array123_v01() {
        Solution solution = new Solution();
        assertTrue(solution.array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void array123_v02() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void array123_v03() {
        Solution solution = new Solution();
        assertTrue(solution.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    @Test
    public void array123_v04() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{1, 1, 2, 1, 2, 1}));
    }

    @Test
    public void array123_v05() {
        Solution solution = new Solution();
        assertTrue(solution.array123(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    public void array123_v06() {
        Solution solution = new Solution();
        assertTrue(solution.array123(new int[]{1, 2, 3}));
    }

    @Test
    public void array123_v07() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{1, 1, 1}));
    }

    @Test
    public void array123_v08() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{1, 2}));
    }

    @Test
    public void array123_v09() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{1}));
    }

    @Test
    public void array123_v10() {
        Solution solution = new Solution();
        assertFalse(solution.array123(new int[]{}));
    }
}
