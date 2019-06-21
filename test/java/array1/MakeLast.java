package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MakeLast {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_last_v01() {
        int[] input = {4, 5, 6};
        int[] expected = {0, 0, 0, 0, 0, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v02() {
        int[] input = {1, 2};
        int[] expected = {0, 0, 0, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v03() {
        int[] input = {3};
        int[] expected = {0, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v04() {
        int[] input = {0};
        int[] expected = {0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v05() {
        int[] input = {7, 7, 7};
        int[] expected = {0, 0, 0, 0, 0, 7};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v06() {
        int[] input = {3, 1, 4};
        int[] expected = {0, 0, 0, 0, 0, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v07() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v08() {
        int[] input = {1, 2, 3, 0};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }

    @Test
    public void make_last_v09() {
        int[] input = {2, 4};
        int[] expected = {0, 0, 0, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makeLast(input)));
    }
}
