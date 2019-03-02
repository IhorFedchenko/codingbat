package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayFront9 {

    @Test
    public void array_front_9_v01() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }

    @Test
    public void array_front_9_v02() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    public void array_front_9_v03() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void array_front_9_v04() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{9, 2, 3}));
    }

    @Test
    public void array_front_9_v05() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{1, 9, 9}));
    }

    @Test
    public void array_front_9_v06() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3}));
    }

    @Test
    public void array_front_9_v07() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{1, 9}));
    }

    @Test
    public void array_front_9_v08() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{5, 5}));
    }

    @Test
    public void array_front_9_v09() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{2}));
    }

    @Test
    public void array_front_9_v10() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{9}));
    }

    @Test
    public void array_front_9_v11() {
        Solution solution = new Solution();
        assertFalse(solution.arrayFront9(new int[]{}));
    }

    @Test
    public void array_front_9_v12() {
        Solution solution = new Solution();
        assertTrue(solution.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }
}
