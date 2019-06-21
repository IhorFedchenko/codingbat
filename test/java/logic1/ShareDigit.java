package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShareDigit {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void share_digit_v01() {
        assertTrue(solution.shareDigit(12, 23));
    }

    @Test
    public void share_digit_v02() {
        assertFalse(solution.shareDigit(12, 43));
    }

    @Test
    public void share_digit_v03() {
        assertFalse(solution.shareDigit(12, 44));
    }

    @Test
    public void share_digit_v04() {
        assertTrue(solution.shareDigit(23, 12));
    }

    @Test
    public void share_digit_v05() {
        assertTrue(solution.shareDigit(23, 39));
    }

    @Test
    public void share_digit_v06() {
        assertFalse(solution.shareDigit(23, 19));
    }

    @Test
    public void share_digit_v07() {
        assertTrue(solution.shareDigit(30, 90));
    }

    @Test
    public void share_digit_v08() {
        assertFalse(solution.shareDigit(30, 91));
    }

    @Test
    public void share_digit_v09() {
        assertTrue(solution.shareDigit(55, 55));
    }

    @Test
    public void share_digit_v10() {
        assertFalse(solution.shareDigit(55, 44));
    }
}
