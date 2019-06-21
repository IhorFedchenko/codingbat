package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MidThree {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void mid_three_v01() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.midThree(input)));
    }

    @Test
    public void mid_three_v02() {
        int[] input = {8, 6, 7, 5, 3, 0, 9};
        int[] expected = {7, 5, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.midThree(input)));
    }

    @Test
    public void mid_three_v03() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.midThree(input)));
    }
}
