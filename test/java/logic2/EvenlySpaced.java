package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenlySpaced {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void evenly_spaced_v01() {
        assertTrue(solution.evenlySpaced(2, 4, 6));
    }

    @Test
    public void evenly_spaced_v02() {
        assertTrue(solution.evenlySpaced(4, 6, 2));
    }

    @Test
    public void evenly_spaced_v03() {
        assertFalse(solution.evenlySpaced(4, 6, 3));
    }

    @Test
    public void evenly_spaced_v04() {
        assertTrue(solution.evenlySpaced(6, 2, 4));
    }

    @Test
    public void evenly_spaced_v05() {
        assertFalse(solution.evenlySpaced(6, 2, 8));
    }

    @Test
    public void evenly_spaced_v06() {
        assertTrue(solution.evenlySpaced(2, 2, 2));
    }

    @Test
    public void evenly_spaced_v07() {
        assertFalse(solution.evenlySpaced(2, 2, 3));
    }

    @Test
    public void evenly_spaced_v08() {
        assertTrue(solution.evenlySpaced(9, 10, 11));
    }

    @Test
    public void evenly_spaced_v09() {
        assertTrue(solution.evenlySpaced(10, 9, 11));
    }

    @Test
    public void evenly_spaced_v10() {
        assertFalse(solution.evenlySpaced(10, 9, 9));
    }

    @Test
    public void evenly_spaced_v11() {
        assertFalse(solution.evenlySpaced(2, 4, 4));
    }

    @Test
    public void evenly_spaced_v12() {
        assertFalse(solution.evenlySpaced(2, 2, 4));
    }

    @Test
    public void evenly_spaced_v13() {
        assertFalse(solution.evenlySpaced(3, 6, 12));
    }

    @Test
    public void evenly_spaced_v14() {
        assertFalse(solution.evenlySpaced(12, 3, 6));
    }
}
