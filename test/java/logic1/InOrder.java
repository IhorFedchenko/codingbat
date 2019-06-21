package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InOrder {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void in_order_v01() {
        assertTrue(solution.inOrder(1, 2, 4, true));
    }

    @Test
    public void in_order_v02() {
        assertFalse(solution.inOrder(1, 2, 1, false));
    }

    @Test
    public void in_order_v03() {
        assertTrue(solution.inOrder(1, 1, 2, true));
    }

    @Test
    public void in_order_v04() {
        assertFalse(solution.inOrder(3, 2, 4, false));
    }

    @Test
    public void in_order_v05() {
        assertTrue(solution.inOrder(2, 3, 4, false));
    }

    @Test
    public void in_order_v06() {
        assertTrue(solution.inOrder(3, 2, 4, true));
    }

    @Test
    public void in_order_v07() {
        assertFalse(solution.inOrder(4, 2, 2, true));
    }

    @Test
    public void in_order_v08() {
        assertFalse(solution.inOrder(4, 5, 2, true));
    }

    @Test
    public void in_order_v09() {
        assertTrue(solution.inOrder(2, 4, 6, true));
    }

    @Test
    public void in_order_v10() {
        assertTrue(solution.inOrder(7, 9, 10, false));
    }

    @Test
    public void in_order_v11() {
        assertTrue(solution.inOrder(7, 5, 6, true));
    }

    @Test
    public void in_order_v12() {
        assertFalse(solution.inOrder(7, 5, 4, true));
    }
}
