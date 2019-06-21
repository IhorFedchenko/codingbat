package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InOrderEqual {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void in_order_equal_v01() {
        assertTrue(solution.inOrderEqual(2, 5, 11, false));
    }

    @Test
    public void in_order_equal_v02() {
        assertFalse(solution.inOrderEqual(5, 7, 6, false));
    }

    @Test
    public void in_order_equal_v03() {
        assertTrue(solution.inOrderEqual(5, 5, 7, true));
    }

    @Test
    public void in_order_equal_v04() {
        assertFalse(solution.inOrderEqual(5, 5, 7, false));
    }

    @Test
    public void in_order_equal_v05() {
        assertFalse(solution.inOrderEqual(2, 5, 4, false));
    }

    @Test
    public void in_order_equal_v06() {
        assertFalse(solution.inOrderEqual(3, 4, 3, false));
    }

    @Test
    public void in_order_equal_v07() {
        assertFalse(solution.inOrderEqual(3, 4, 4, false));
    }

    @Test
    public void in_order_equal_v08() {
        assertFalse(solution.inOrderEqual(3, 4, 3, true));
    }

    @Test
    public void in_order_equal_v09() {
        assertTrue(solution.inOrderEqual(3, 4, 4, true));
    }

    @Test
    public void in_order_equal_v10() {
        assertTrue(solution.inOrderEqual(1, 5, 5, true));
    }

    @Test
    public void in_order_equal_v11() {
        assertTrue(solution.inOrderEqual(5, 5, 5, true));
    }

    @Test
    public void in_order_equal_v12() {
        assertFalse(solution.inOrderEqual(2, 2, 1, true));
    }

    @Test
    public void in_order_equal_v13() {
        assertFalse(solution.inOrderEqual(9, 2, 2, false));
    }

    @Test
    public void in_order_equal_v14() {
        assertFalse(solution.inOrderEqual(0, 1, 0, true));
    }
}
