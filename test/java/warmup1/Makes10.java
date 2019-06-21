package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Makes10 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void Makes10_9_10() {
        assertTrue(solution.makes10(9, 10));
    }

    @Test
    public void Makes10_9_9() {
        assertFalse(solution.makes10(9, 9));
    }

    @Test
    public void Makes10_1_9() {
        assertTrue(solution.makes10(1, 9));
    }

    @Test
    public void Makes10_10_1() {
        assertTrue(solution.makes10(10, 1));
    }

    @Test
    public void Makes10_10_10() {
        assertTrue(solution.makes10(10, 10));
    }

    @Test
    public void Makes10_8_2() {
        assertTrue(solution.makes10(8, 2));
    }

    @Test
    public void Makes10_8_3() {
        assertFalse(solution.makes10(8, 3));
    }

    @Test
    public void Makes10_10_42() {
        assertTrue(solution.makes10(10, 42));
    }

    @Test
    public void Makes10_12_negative2() {
        assertTrue(solution.makes10(12, -2));
    }
}
