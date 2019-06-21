package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LuckySum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void lucky_sum_v01() {
        assertEquals(6, solution.luckySum(1, 2, 3));
    }

    @Test
    public void lucky_sum_v02() {
        assertEquals(3, solution.luckySum(1, 2, 13));
    }

    @Test
    public void lucky_sum_v03() {
        assertEquals(1, solution.luckySum(1, 13, 3));
    }

    @Test
    public void lucky_sum_v04() {
        assertEquals(1, solution.luckySum(1, 13, 13));
    }

    @Test
    public void lucky_sum_v05() {
        assertEquals(13, solution.luckySum(6, 5, 2));
    }

    @Test
    public void lucky_sum_v06() {
        assertEquals(0, solution.luckySum(13, 2, 3));
    }

    @Test
    public void lucky_sum_v07() {
        assertEquals(0, solution.luckySum(13, 2, 13));
    }

    @Test
    public void lucky_sum_v08() {
        assertEquals(0, solution.luckySum(13, 13, 2));
    }

    @Test
    public void lucky_sum_v09() {
        assertEquals(13, solution.luckySum(9, 4, 13));
    }

    @Test
    public void lucky_sum_v10() {
        assertEquals(8, solution.luckySum(8, 13, 2));
    }

    @Test
    public void lucky_sum_v11() {
        assertEquals(10, solution.luckySum(7, 2, 1));
    }

    @Test
    public void lucky_sum_v12() {
        assertEquals(6, solution.luckySum(3, 3, 13));
    }
}
