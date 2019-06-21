package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void sum2_v01() {
        assertEquals(3, solution.sum2(new int[]{1, 2, 3}));
    }

    @Test
    public void sum2_v02() {
        assertEquals(2, solution.sum2(new int[]{1, 1}));
    }

    @Test
    public void sum2_v03() {
        assertEquals(2, solution.sum2(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void sum2_v04() {
        assertEquals(3, solution.sum2(new int[]{1, 2}));
    }

    @Test
    public void sum2_v05() {
        assertEquals(1, solution.sum2(new int[]{1}));
    }

    @Test
    public void sum2_v06() {
        assertEquals(0, solution.sum2(new int[]{}));
    }

    @Test
    public void sum2_v07() {
        assertEquals(9, solution.sum2(new int[]{4, 5, 6}));
    }

    @Test
    public void sum2_v08() {
        assertEquals(4, solution.sum2(new int[]{4}));
    }
}
