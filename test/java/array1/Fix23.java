package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Fix23 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void fix23_v01() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v02() {
        int[] input = {2, 3, 5};
        int[] expected = {2, 0, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v03() {
        int[] input = {1, 2, 1};
        int[] expected = {1, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v04() {
        int[] input = {3, 2, 1};
        int[] expected = {3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v05() {
        int[] input = {2, 2, 3};
        int[] expected = {2, 2, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }

    @Test
    public void fix23_v06() {
        int[] input = {2, 3, 3};
        int[] expected = {2, 0, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.fix23(input)));
    }
}
