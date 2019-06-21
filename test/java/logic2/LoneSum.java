package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoneSum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void lone_sum_v01() {
        assertEquals(6, solution.loneSum(1, 2, 3));
    }

    @Test
    public void lone_sum_v02() {
        assertEquals(2, solution.loneSum(3, 2, 3));
    }

    @Test
    public void lone_sum_v03() {
        assertEquals(0, solution.loneSum(3, 3, 3));
    }

    @Test
    public void lone_sum_v04() {
        assertEquals(9, solution.loneSum(9, 2, 2));
    }

    @Test
    public void lone_sum_v05() {
        assertEquals(9, solution.loneSum(2, 2, 9));
    }

    @Test
    public void lone_sum_v06() {
        assertEquals(9, solution.loneSum(2, 9, 2));
    }

    @Test
    public void lone_sum_v07() {
        assertEquals(14, solution.loneSum(2, 9, 3));
    }

    @Test
    public void lone_sum_v08() {
        assertEquals(9, solution.loneSum(4, 2, 3));
    }

    @Test
    public void lone_sum_v09() {
        assertEquals(3, solution.loneSum(1, 3, 1));
    }
}
