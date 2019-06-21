package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundSum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void round_sum_v01() {
        assertEquals(60, solution.roundSum(16, 17, 18));
    }

    @Test
    public void round_sum_v02() {
        assertEquals(30, solution.roundSum(12, 13, 14));
    }

    @Test
    public void round_sum_v03() {
        assertEquals(10, solution.roundSum(6, 4, 4));
    }

    @Test
    public void round_sum_v04() {
        assertEquals(20, solution.roundSum(4, 6, 5));
    }

    @Test
    public void round_sum_v05() {
        assertEquals(10, solution.roundSum(4, 4, 6));
    }

    @Test
    public void round_sum_v06() {
        assertEquals(10, solution.roundSum(9, 4, 4));
    }

    @Test
    public void round_sum_v07() {
        assertEquals(0, solution.roundSum(0, 0, 1));
    }

    @Test
    public void round_sum_v08() {
        assertEquals(10, solution.roundSum(0, 9, 0));
    }

    @Test
    public void round_sum_v09() {
        assertEquals(40, solution.roundSum(10, 10, 19));
    }

    @Test
    public void round_sum_v10() {
        assertEquals(90, solution.roundSum(20, 30, 40));
    }

    @Test
    public void round_sum_v11() {
        assertEquals(100, solution.roundSum(45, 21, 30));
    }

    @Test
    public void round_sum_v12() {
        assertEquals(60, solution.roundSum(23, 11, 26));
    }

    @Test
    public void round_sum_v13() {
        assertEquals(70, solution.roundSum(23, 24, 25));
    }

    @Test
    public void round_sum_v14() {
        assertEquals(80, solution.roundSum(25, 24, 25));
    }

    @Test
    public void round_sum_v15() {
        assertEquals(70, solution.roundSum(23, 24, 29));
    }

    @Test
    public void round_sum_v16() {
        assertEquals(70, solution.roundSum(11, 24, 36));
    }

    @Test
    public void round_sum_v17() {
        assertEquals(90, solution.roundSum(24, 36, 32));
    }

    @Test
    public void round_sum_v18() {
        assertEquals(50, solution.roundSum(14, 12, 26));
    }

    @Test
    public void round_sum_v19() {
        assertEquals(40, solution.roundSum(12, 10, 24));
    }
}
