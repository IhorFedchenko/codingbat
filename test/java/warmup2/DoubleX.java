package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoubleX {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void double_x_axxbb() {
        assertTrue(solution.doubleX("axxbb"));
    }

    @Test
    public void double_x_axaxax() {
        assertFalse(solution.doubleX("axaxax"));
    }

    @Test
    public void double_x_xxxxx() {
        assertTrue(solution.doubleX("xxxxx"));
    }

    @Test
    public void double_x_xaxxx() {
        assertFalse(solution.doubleX("xaxxx"));
    }

    @Test
    public void double_x_aaaax() {
        assertFalse(solution.doubleX("aaaax"));
    }

    @Test
    public void double_x__() {
        assertTrue(solution.doubleX("axxbb"));
    }

    @Test
    public void double_x_abc() {
        assertFalse(solution.doubleX("abc"));
    }

    @Test
    public void double_x() {
        assertFalse(solution.doubleX("x"));
    }

    @Test
    public void double_x_xx() {
        assertTrue(solution.doubleX("xx"));
    }

    @Test
    public void double_x_xax() {
        assertFalse(solution.doubleX("xax"));
    }

    @Test
    public void double_x_xaxx() {
        assertFalse(solution.doubleX("xaxx"));
    }
}
