package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Make2 {

    @Test
    public void make2_v01(){
        Solution solution = new Solution();
        int[] a = {4, 5};
        int[] b = {1, 2, 3};
        int[] expected = {4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v02(){
        Solution solution = new Solution();
        int[] a = {4};
        int[] b = {1, 2, 3};
        int[] expected = {4, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v03(){
        Solution solution = new Solution();
        int[] a = {};
        int[] b = {1, 2};
        int[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v04(){
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {};
        int[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v05(){
        Solution solution = new Solution();
        int[] a = {3};
        int[] b = {1, 2, 3};
        int[] expected = {3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v06(){
        Solution solution = new Solution();
        int[] a = {3};
        int[] b = {1};
        int[] expected = {3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v07(){
        Solution solution = new Solution();
        int[] a = {3, 1 , 4};
        int[] b = {};
        int[] expected = {3, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v08(){
        Solution solution = new Solution();
        int[] a = {1};
        int[] b = {1};
        int[] expected = {1, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v09(){
        Solution solution = new Solution();
        int[] a = {1, 2, 3};
        int[] b = {7, 8};
        int[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v10(){
        Solution solution = new Solution();
        int[] a = {7, 8};
        int[] b = {1, 2, 3};
        int[] expected = {7, 8};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v11(){
        Solution solution = new Solution();
        int[] a = {7};
        int[] b = {1, 2, 3};
        int[] expected = {7, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }

    @Test
    public void make2_v12(){
        Solution solution = new Solution();
        int[] a = {5, 4};
        int[] b = {2, 3, 7};
        int[] expected = {5, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.make2(a, b)));
    }
}
