package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Front11 {

    @Test
    public void front11_v01(){
        Solution solution = new Solution();
        int[] a = {1, 2, 3};
        int[] b = {7, 9, 8};
        int[] expected = {1, 7};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v02(){
        Solution solution = new Solution();
        int[] a = {1};
        int[] b = {2};
        int[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v03(){
        Solution solution = new Solution();
        int[] a = {1, 7};
        int[] b = {};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v04(){
        Solution solution = new Solution();
        int[] a = {};
        int[] b = {2, 8};
        int[] expected = {2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v05(){
        Solution solution = new Solution();
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v06(){
        Solution solution = new Solution();
        int[] a = {3};
        int[] b = {1, 4, 1, 9};
        int[] expected = {3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }

    @Test
    public void front11_v07(){
        Solution solution = new Solution();
        int[] a = {1, 4, 1, 9};
        int[] b = {};
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.front11(a, b)));
    }
}
