package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum3 {

    @Test
    public void sum3_v01() {
        Solution solution = new Solution();
        assertEquals(6, solution.sum3(new int[]{1, 2, 3}));
    }

    @Test
    public void sum3_v02() {
        Solution solution = new Solution();
        assertEquals(18, solution.sum3(new int[]{5, 11, 2}));
    }

    @Test
    public void sum3_v03() {
        Solution solution = new Solution();
        assertEquals(7, solution.sum3(new int[]{7, 0, 0}));
    }

    @Test
    public void sum3_v04() {
        Solution solution = new Solution();
        assertEquals(4, solution.sum3(new int[]{1, 2, 1}));
    }

    @Test
    public void sum3_v05() {
        Solution solution = new Solution();
        assertEquals(3, solution.sum3(new int[]{1, 1, 1}));
    }

    @Test
    public void sum3_v06() {
        Solution solution = new Solution();
        assertEquals(11, solution.sum3(new int[]{2, 7, 2}));
    }
}
