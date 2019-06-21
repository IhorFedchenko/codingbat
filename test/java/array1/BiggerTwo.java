package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BiggerTwo {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void bigger_two_v01() {
        int[] a = {1, 2};
        int[] b = {3, 4};
        assertEquals(Arrays.toString(b), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v02() {
        int[] a = {3, 4};
        int[] b = {1, 2};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v03() {
        int[] a = {1, 1};
        int[] b = {1, 2};
        assertEquals(Arrays.toString(b), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v04() {
        int[] a = {2, 1};
        int[] b = {1, 1};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v05() {
        int[] a = {2, 2};
        int[] b = {1, 3};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v06() {
        int[] a = {1, 3};
        int[] b = {2, 2};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }

    @Test
    public void bigger_two_v07() {
        int[] a = {6, 7};
        int[] b = {3, 1};
        assertEquals(Arrays.toString(a), Arrays.toString(solution.biggerTwo(a, b)));
    }
}
