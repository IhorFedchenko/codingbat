package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Reverse3 {

    @Test
    public void reverse3_v01() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{3, 2, 1}), Arrays.toString(solution.reverse3(new int[]{1, 2, 3})));
    }

    @Test
    public void reverse3_v02() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{9, 11, 5}), Arrays.toString(solution.reverse3(new int[]{5, 11, 9})));
    }

    @Test
    public void reverse3_v03() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{0, 0, 7}), Arrays.toString(solution.reverse3(new int[]{7, 0, 0})));
    }

    @Test
    public void reverse3_v04() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{2, 1, 2}), Arrays.toString(solution.reverse3(new int[]{2, 1, 2})));
    }

    @Test
    public void reverse3_v05() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 2, 1}), Arrays.toString(solution.reverse3(new int[]{1, 2, 1})));
    }

    @Test
    public void reverse3_v06() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{3, 11, 2}), Arrays.toString(solution.reverse3(new int[]{2, 11, 3})));
    }

    @Test
    public void reverse3_v07() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{5, 6, 0}), Arrays.toString(solution.reverse3(new int[]{0, 6, 5})));
    }

    @Test
    public void reverse3_v08() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{3, 2, 7}), Arrays.toString(solution.reverse3(new int[]{7, 2, 3})));
    }
}
