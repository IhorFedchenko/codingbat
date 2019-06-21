package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LastDigit {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void last_digit_v01() {
        assertTrue(solution.lastDigit(23, 19, 13));
    }

    @Test
    public void last_digit_v02() {
        assertFalse(solution.lastDigit(23, 19, 12));
    }

    @Test
    public void last_digit_v03() {
        assertTrue(solution.lastDigit(23, 19, 3));
    }

    @Test
    public void last_digit_v04() {
        assertTrue(solution.lastDigit(23, 19, 39));
    }

    @Test
    public void last_digit_v05() {
        assertFalse(solution.lastDigit(1, 2, 3));
    }

    @Test
    public void last_digit_v06() {
        assertTrue(solution.lastDigit(1, 1, 2));
    }

    @Test
    public void last_digit_v07() {
        assertTrue(solution.lastDigit(1, 2, 2));
    }

    @Test
    public void last_digit_v08() {
        assertFalse(solution.lastDigit(14, 25, 43));
    }

    @Test
    public void last_digit_v09() {
        assertTrue(solution.lastDigit(14, 25, 45));
    }

    @Test
    public void last_digit_v10() {
        assertFalse(solution.lastDigit(248, 106, 1002));
    }

    @Test
    public void last_digit_v11() {
        assertTrue(solution.lastDigit(248, 106, 1008));
    }

    @Test
    public void last_digit_v12() {
        assertTrue(solution.lastDigit(10, 11, 20));
    }

    @Test
    public void last_digit_v13() {
        assertTrue(solution.lastDigit(0, 11, 0));
    }
}
