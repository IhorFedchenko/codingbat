package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum3 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void sum3_v01() {
        assertEquals(6, solution.sum3(new int[]{1, 2, 3}));
    }

    @Test
    public void sum3_v02() {
        assertEquals(18, solution.sum3(new int[]{5, 11, 2}));
    }

    @Test
    public void sum3_v03() {
        assertEquals(7, solution.sum3(new int[]{7, 0, 0}));
    }

    @Test
    public void sum3_v04() {
        assertEquals(4, solution.sum3(new int[]{1, 2, 1}));
    }

    @Test
    public void sum3_v05() {
        assertEquals(3, solution.sum3(new int[]{1, 1, 1}));
    }

    @Test
    public void sum3_v06() {
        assertEquals(11, solution.sum3(new int[]{2, 7, 2}));
    }
}
