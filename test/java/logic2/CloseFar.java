package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CloseFar {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void close_far_v01() {
        assertTrue(solution.closeFar(1, 2, 10));
    }

    @Test
    public void close_far_v02() {
        assertFalse(solution.closeFar(1, 2, 3));
    }

    @Test
    public void close_far_v03() {
        assertTrue(solution.closeFar(4, 1, 3));
    }

    @Test
    public void close_far_v04() {
        assertFalse(solution.closeFar(4, 5, 3));
    }

    @Test
    public void close_far_v05() {
        assertFalse(solution.closeFar(4, 3, 5));
    }

    @Test
    public void close_far_v06() {
        assertTrue(solution.closeFar(-1, 10, 0));
    }

    @Test
    public void close_far_v07() {
        assertTrue(solution.closeFar(0, -1, 10));
    }

    @Test
    public void close_far_v08() {
        assertTrue(solution.closeFar(10, 10, 8));
    }

    @Test
    public void close_far_v09() {
        assertFalse(solution.closeFar(10, 8, 9));
    }

    @Test
    public void close_far_v10() {
        assertFalse(solution.closeFar(8, 9, 10));
    }

    @Test
    public void close_far_v11() {
        assertFalse(solution.closeFar(8, 9, 7));
    }

    @Test
    public void close_far_v12() {
        assertTrue(solution.closeFar(8, 6, 9));
    }
}
