package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortaSum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void sorta_sum_v01() {
        assertEquals(7, solution.sortaSum(3, 4));
    }

    @Test
    public void sorta_sum_v02() {
        assertEquals(20, solution.sortaSum(9, 4));
    }

    @Test
    public void sorta_sum_v03() {
        assertEquals(21, solution.sortaSum(10, 11));
    }

    @Test
    public void sorta_sum_v04() {
        assertEquals(9, solution.sortaSum(12, -3));
    }

    @Test
    public void sorta_sum_v05() {
        assertEquals(9, solution.sortaSum(-3, 12));
    }

    @Test
    public void sorta_sum_v06() {
        assertEquals(9, solution.sortaSum(4, 5));
    }

    @Test
    public void sorta_sum_v07() {
        assertEquals(20, solution.sortaSum(4, 6));
    }

    @Test
    public void sorta_sum_v08() {
        assertEquals(21, solution.sortaSum(14, 7));
    }

    @Test
    public void sorta_sum_v09() {
        assertEquals(20, solution.sortaSum(14, 6));
    }
}
