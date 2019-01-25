package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BiggerTwo {

    @Test
    public void bigger_two_v01() {
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {3, 4};
        assertEquals(Arrays.toString(b), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v02() {
        Solution solution = new Solution();
        int[] a = {3, 4};
        int[] b = {1, 2};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v03() {
        Solution solution = new Solution();
        int[] a = {1, 1};
        int[] b = {1, 2};
        assertEquals(Arrays.toString(b), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v04() {
        Solution solution = new Solution();
        int[] a = {2, 1};
        int[] b = {1, 1};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v05() {
        Solution solution = new Solution();
        int[] a = {2, 2};
        int[] b = {1, 3};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v06() {
        Solution solution = new Solution();
        int[] a = {1, 3};
        int[] b = {2, 2};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v07() {
        Solution solution = new Solution();
        int[] a = {6, 7};
        int[] b = {3, 1};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }
}
