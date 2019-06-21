package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumLimit {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void sum_limit_v01() {
        assertEquals(5, solution.sumLimit(2, 3));
    }

    @Test
    public void sum_limit_v02() {
        assertEquals(8, solution.sumLimit(8, 3));
    }

    @Test
    public void sum_limit_v03() {
        assertEquals(9, solution.sumLimit(8, 1));
    }

    @Test
    public void sum_limit_v04() {
        assertEquals(50, solution.sumLimit(11, 39));
    }

    @Test
    public void sum_limit_v05() {
        assertEquals(11, solution.sumLimit(11, 99));
    }

    @Test
    public void sum_limit_v06() {
        assertEquals(0, solution.sumLimit(0, 0));
    }

    @Test
    public void sum_limit_v07() {
        assertEquals(99, solution.sumLimit(99, 0));
    }

    @Test
    public void sum_limit_v08() {
        assertEquals(99, solution.sumLimit(99, 1));
    }

    @Test
    public void sum_limit_v09() {
        assertEquals(124, solution.sumLimit(123, 1));
    }

    @Test
    public void sum_limit_v10() {
        assertEquals(1, solution.sumLimit(1, 123));
    }

    @Test
    public void sum_limit_v11() {
        assertEquals(83, solution.sumLimit(23, 60));
    }

    @Test
    public void sum_limit_v12() {
        assertEquals(23, solution.sumLimit(23, 80));
    }

    @Test
    public void sum_limit_v13() {
        assertEquals(9001, solution.sumLimit(9000, 1));
    }

    @Test
    public void sum_limit_v14() {
        assertEquals(90000001, solution.sumLimit(90000000, 1));
    }

    @Test
    public void sum_limit_v15() {
        assertEquals(9000, solution.sumLimit(9000, 1000));
    }
}
