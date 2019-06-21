package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeenSum {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void teen_sum_v01() {
        assertEquals(7, solution.teenSum(3, 4));
    }

    @Test
    public void teen_sum_v02() {
        assertEquals(19, solution.teenSum(10, 13));
    }

    @Test
    public void teen_sum_v03() {
        assertEquals(19, solution.teenSum(13, 2));
    }

    @Test
    public void teen_sum_v04() {
        assertEquals(19, solution.teenSum(3, 19));
    }

    @Test
    public void teen_sum_v05() {
        assertEquals(19, solution.teenSum(13, 13));
    }

    @Test
    public void teen_sum_v06() {
        assertEquals(20, solution.teenSum(10, 10));
    }

    @Test
    public void teen_sum_v07() {
        assertEquals(19, solution.teenSum(6, 14));
    }

    @Test
    public void teen_sum_v08() {
        assertEquals(19, solution.teenSum(15, 2));
    }

    @Test
    public void teen_sum_v09() {
        assertEquals(19, solution.teenSum(19, 19));
    }

    @Test
    public void teen_sum_v10() {
        assertEquals(19, solution.teenSum(19, 20));
    }

    @Test
    public void teen_sum_v11() {
        assertEquals(19, solution.teenSum(2, 18));
    }

    @Test
    public void teen_sum_v12() {
        assertEquals(16, solution.teenSum(12, 4));
    }

    @Test
    public void teen_sum_v13() {
        assertEquals(22, solution.teenSum(2, 20));
    }

    @Test
    public void teen_sum_v14() {
        assertEquals(19, solution.teenSum(2, 17));
    }

    @Test
    public void teen_sum_v15() {
        assertEquals(19, solution.teenSum(2, 16));
    }

    @Test
    public void teen_sum_v16() {
        assertEquals(13, solution.teenSum(6, 7));
    }
}
