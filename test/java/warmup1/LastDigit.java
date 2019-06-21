package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LastDigit {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void last_digit_7_17() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_6_17() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_3_113() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_114_113() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_114_4() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_10_0() {
        assertTrue(solution.lastDigit(7, 17));
    }

    @Test
    public void last_digit_11_0() {
        assertTrue(solution.lastDigit(7, 17));
    }
}
