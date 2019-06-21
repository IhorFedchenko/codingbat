package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Front11 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void front11_v01() {
        int[] a = {1, 2, 3};
        int[] b = {7, 9, 8};
        int[] expected = {1, 7};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v02() {
        int[] a = {1};
        int[] b = {2};
        int[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v03() {
        int[] a = {1, 7};
        int[] b = {};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v04() {
        int[] a = {};
        int[] b = {2, 8};
        int[] expected = {2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v05() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v06() {
        int[] a = {3};
        int[] b = {1, 4, 1, 9};
        int[] expected = {3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v07() {
        int[] a = {1, 4, 1, 9};
        int[] b = {};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }
}
