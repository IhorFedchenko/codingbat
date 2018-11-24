package warmup1;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class SumDoubleSolutionTest {

    Solution solution = new Solution();

    @Test
    public void sumDouble_1_2() {
        assertEquals("1+2 = 3", 3, solution.sumDouble(1, 2));
    }

    @Test
    public void sumDouble_3_2() {
        assertEquals("3+2 = 5", 5, solution.sumDouble(3, 2));
    }

    @Test
    public void sumDouble_2_2() {
        assertEquals("(2+2)*2 = 8", 8, solution.sumDouble(2, 2));
    }

    @Test
    public void sumDouble_minus_1_0() {
        assertEquals("-1+0 = -1", -1, solution.sumDouble(-1, 0));
    }

    @Test
    public void sumDouble_3_3() {
        assertEquals("(3+3)*2 = 12", 12, solution.sumDouble(3, 3));
    }

    @Test
    public void sumDouble_0_0() {
        assertEquals("0+0 = 0", 0, solution.sumDouble(0, 0));
    }

    @Test
    public void sumDouble_0_1() {
        assertEquals("0+1 = 1", 1, solution.sumDouble(0, 1));
    }

    @Test
    public void sumDouble_3_4() {
        assertEquals("3+4 = 7", 7, solution.sumDouble(3, 4));
    }
}
