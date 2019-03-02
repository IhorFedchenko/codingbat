package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Fix23 {

    @Test
    public void fix23_v01() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v02() {
        Solution solution = new Solution();
        int[] input = {2, 3, 5};
        int[] expected = {2, 0, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v03() {
        Solution solution = new Solution();
        int[] input = {1, 2, 1};
        int[] expected = {1, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v04() {
        Solution solution = new Solution();
        int[] input = {3, 2, 1};
        int[] expected = {3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v05() {
        Solution solution = new Solution();
        int[] input = {2, 2, 3};
        int[] expected = {2, 2, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v06() {
        Solution solution = new Solution();
        int[] input = {2, 3, 3};
        int[] expected = {2, 0, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }
}
