package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PosNeg {

    Solution solution = new Solution();

    @Test
    public void posNeg_1_1n_false() {
        assertTrue(solution.posNeg(1, -1, false));
    }

    @Test
    public void posNeg_1n_1_false() {
        assertTrue(solution.posNeg(-1, 1, false));
    }

    @Test
    public void posNeg_4n_5n_true() {
        assertTrue(solution.posNeg(-4, -5, true));
    }

    @Test
    public void posNeg_4n_5n_false() {
        assertFalse(solution.posNeg(-4, -5, false));
    }

    @Test
    public void posNeg4n_5_false() {
        assertTrue(solution.posNeg(-4, 5, false));
    }

    @Test
    public void posNeg_4n_5_true() {
        assertFalse(solution.posNeg(-4, 5, true));
    }

    @Test
    public void posNeg_1_1_false() {
        assertFalse(solution.posNeg(1, 1, false));
    }

    @Test
    public void posNeg_1n_1n_false() {
        assertFalse(solution.posNeg(-1, -1, false));
    }

    @Test
    public void posNeg_1_1n_true() {
        assertFalse(solution.posNeg(1, -1, true));
    }

    @Test
    public void posNeg_1n_1_true() {
        assertFalse(solution.posNeg(-1, 1, true));
    }

    @Test
    public void posNeg_1_1_true() {
        assertFalse(solution.posNeg(1, 1, true));
    }

    @Test
    public void posNeg_1n_1n_true() {
        assertTrue(solution.posNeg(-1, -1, true));
    }

    @Test
    public void posNeg_5_5n_false() {
        assertTrue(solution.posNeg(5, -5, false));
    }

    @Test
    public void posNeg_6n_6_false() {
        assertTrue(solution.posNeg(-6, 6, false));
    }

    @Test
    public void posNeg_5n_6n_false() {
        assertFalse(solution.posNeg(-5, -6, false));
    }

    @Test
    public void posNeg_2n_1n_false() {
        assertFalse(solution.posNeg(-2, -1, false));
    }

    @Test
    public void posNeg_1_2_false() {
        assertFalse(solution.posNeg(1, 2, false));
    }

    @Test
    public void posNeg_5n_6_true() {
        assertFalse(solution.posNeg(-5, 6, true));
    }

    @Test
    public void posNeg_5n_5n_true() {
        assertTrue(solution.posNeg(-5, -5, true));
    }

}
