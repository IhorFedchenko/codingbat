package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlusTwo {

    @Test
    public void plus_two_v01() {
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.plusTwo(a, b)));
    }

    @Test
    public void plus_two_v02() {
        Solution solution = new Solution();
        int[] a = {4, 4};
        int[] b = {2, 2};
        int[] expected = {4, 4, 2, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.plusTwo(a, b)));
    }

    @Test
    public void plus_two_v03() {
        Solution solution = new Solution();
        int[] a = {9, 2};
        int[] b = {3, 4};
        int[] expected = {9, 2, 3, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.plusTwo(a, b)));
    }
}
