package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NearTen {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void near_ten_12() {
        assertTrue(solution.nearTen(12));
    }

    @Test
    public void near_ten_17() {
        assertFalse(solution.nearTen(17));
    }

    @Test
    public void near_ten_19() {
        assertTrue(solution.nearTen(19));
    }

    @Test
    public void near_ten_31() {
        assertTrue(solution.nearTen(31));
    }

    @Test
    public void near_ten_6() {
        assertFalse(solution.nearTen(6));
    }

    @Test
    public void near_ten_10() {
        assertTrue(solution.nearTen(10));
    }

    @Test
    public void near_ten_11() {
        assertTrue(solution.nearTen(11));
    }

    @Test
    public void near_ten_21() {
        assertTrue(solution.nearTen(21));
    }

    @Test
    public void near_ten_22() {
        assertTrue(solution.nearTen(22));
    }

    @Test
    public void near_ten_23() {
        assertFalse(solution.nearTen(23));
    }

    @Test
    public void near_ten_54() {
        assertFalse(solution.nearTen(54));
    }

    @Test
    public void near_ten_155() {
        assertFalse(solution.nearTen(155));
    }

    @Test
    public void near_ten_158() {
        assertTrue(solution.nearTen(158));
    }

    @Test
    public void near_ten_3() {
        assertFalse(solution.nearTen(3));
    }

    @Test
    public void near_ten_1() {
        assertTrue(solution.nearTen(1));
    }

}
