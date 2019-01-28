package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SwapEnds {

    @Test
    public void swap_ends_v01(){
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v02(){
        Solution solution = new Solution();
        int[] input = {1, 2, 3};
        int[] expected = {3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v03(){
        Solution solution = new Solution();
        int[] input = {8, 6, 7, 9, 5};
        int[] expected = {5, 6, 7, 9, 8};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v04(){
        Solution solution = new Solution();
        int[] input = {3, 1, 4, 1, 5};
        int[] expected = {5, 1, 4, 1, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v05(){
        Solution solution = new Solution();
        int[] input = {1, 2};
        int[] expected = {2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }

    @Test
    public void swap_ends_v06(){
        Solution solution = new Solution();
        int[] input = {1};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.swapEnds(input)));
    }
}
