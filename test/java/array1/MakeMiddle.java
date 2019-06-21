package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MakeMiddle {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_middle_v01() {
        int[] expected = {2, 3};
        int[] input = {1, 2, 3, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeMiddle(input)));
    }

    @Test
    public void make_middle_v02() {
        int[] expected = {2, 3};
        int[] input = {7, 1, 2, 3, 4, 9};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeMiddle(input)));
    }

    @Test
    public void make_middle_v03() {
        int[] expected = {1, 2};
        int[] input = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeMiddle(input)));
    }

    @Test
    public void make_middle_v04() {
        int[] expected = {2, 4};
        int[] input = {5, 2, 4, 7};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeMiddle(input)));
    }

    @Test
    public void make_middle_v05() {
        int[] expected = {4, 3};
        int[] input = {9, 0, 4, 3, 9, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeMiddle(input)));
    }
}
