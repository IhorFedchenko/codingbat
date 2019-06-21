package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoTeenSum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void no_teen_sum_v01() {
        assertEquals(6, solution.noTeenSum(1, 2, 3));
    }

    @Test
    public void no_teen_sum_v02() {
        assertEquals(3, solution.noTeenSum(2, 13, 1));
    }

    @Test
    public void no_teen_sum_v03() {
        assertEquals(3, solution.noTeenSum(2, 1, 14));
    }

    @Test
    public void no_teen_sum_v04() {
        assertEquals(18, solution.noTeenSum(2, 1, 15));
    }

    @Test
    public void no_teen_sum_v05() {
        assertEquals(19, solution.noTeenSum(2, 1, 16));
    }

    @Test
    public void no_teen_sum_v06() {
        assertEquals(3, solution.noTeenSum(2, 1, 17));
    }

    @Test
    public void no_teen_sum_v07() {
        assertEquals(3, solution.noTeenSum(17, 1, 2));
    }

    @Test
    public void no_teen_sum_v08() {
        assertEquals(19, solution.noTeenSum(2, 15, 2));
    }

    @Test
    public void no_teen_sum_v09() {
        assertEquals(16, solution.noTeenSum(16, 17, 18));
    }

    @Test
    public void no_teen_sum_v10() {
        assertEquals(0, solution.noTeenSum(17, 18, 19));
    }

    @Test
    public void no_teen_sum_v11() {
        assertEquals(32, solution.noTeenSum(15, 16, 1));
    }

    @Test
    public void no_teen_sum_v12() {
        assertEquals(30, solution.noTeenSum(15, 15, 19));
    }

    @Test
    public void no_teen_sum_v13() {
        assertEquals(31, solution.noTeenSum(15, 19, 16));
    }

    @Test
    public void no_teen_sum_v14() {
        assertEquals(5, solution.noTeenSum(5, 17, 18));
    }

    @Test
    public void no_teen_sum_v15() {
        assertEquals(16, solution.noTeenSum(17, 18, 16));
    }

    @Test
    public void no_teen_sum_v16() {
        assertEquals(0, solution.noTeenSum(17, 19, 18));
    }
}
