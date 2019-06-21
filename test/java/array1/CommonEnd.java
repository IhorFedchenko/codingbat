package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonEnd {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void common_end_v01() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        assertTrue(solution.commonEnd(a, b));
    }

    @Test
    public void common_end_v02() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3, 2};
        assertFalse(solution.commonEnd(a, b));
    }

    @Test
    public void common_end_v03() {
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        assertTrue(solution.commonEnd(a, b));
    }

    @Test
    public void common_end_v04() {
        int[] a = {1, 2, 3};
        int[] b = {1};
        assertTrue(solution.commonEnd(a, b));
    }

    @Test
    public void common_end_v05() {
        int[] a = {1, 2, 3};
        int[] b = {2};
        assertFalse(solution.commonEnd(a, b));
    }
}
