package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MiddleWay {

    @Test
    public void middle_way_v01() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] expected = {2, 5};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }

    @Test
    public void middle_way_v02() {
        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};
        int[] expected = {7, 8};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }

    @Test
    public void middle_way_v03() {
        int[] a = {5, 2, 9};
        int[] b = {1, 4, 5};
        int[] expected = {2, 4};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }

    @Test
    public void middle_way_v04() {
        int[] a = {1, 9, 7};
        int[] b = {4, 8, 8};
        int[] expected = {9, 8};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }

    @Test
    public void middle_way_v05() {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 4};
        int[] expected = {2, 1};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }

    @Test
    public void middle_way_v06() {
        int[] a = {1, 2, 3};
        int[] b = {4, 1, 1};
        int[] expected = {2, 1};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.middleWay(a, b)));
    }
}
