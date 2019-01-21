package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum2 {

    @Test
    public void sum2_v01() {
        Solution solution = new Solution();
        assertEquals(3, solution.sum2(new int[]{1, 2, 3}));
    }

    @Test
    public void sum2_v02() {
        Solution solution = new Solution();
        assertEquals(2, solution.sum2(new int[]{1, 1}));
    }

    @Test
    public void sum2_v03() {
        Solution solution = new Solution();
        assertEquals(2, solution.sum2(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void sum2_v04() {
        Solution solution = new Solution();
        assertEquals(3, solution.sum2(new int[]{1, 2}));
    }

    @Test
    public void sum2_v05() {
        Solution solution = new Solution();
        assertEquals(1, solution.sum2(new int[]{1}));
    }

    @Test
    public void sum2_v06() {
        Solution solution = new Solution();
        assertEquals(0, solution.sum2(new int[]{}));
    }

    @Test
    public void sum2_v07() {
        Solution solution = new Solution();
        assertEquals(9, solution.sum2(new int[]{4, 5, 6}));
    }

    @Test
    public void sum2_v08() {
        Solution solution = new Solution();
        assertEquals(4, solution.sum2(new int[]{4}));
    }
}
