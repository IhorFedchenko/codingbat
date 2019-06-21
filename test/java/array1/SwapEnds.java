package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SwapEnds {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void swap_ends_v01() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v02() {
        int[] input = {1, 2, 3};
        int[] expected = {3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v03() {
        int[] input = {8, 6, 7, 9, 5};
        int[] expected = {5, 6, 7, 9, 8};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v04() {
        int[] input = {3, 1, 4, 1, 5};
        int[] expected = {5, 1, 4, 1, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v05() {
        int[] input = {1, 2};
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v06() {
        int[] input = {1};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }
}
