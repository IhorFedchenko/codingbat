package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class No23 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void no23_v01() {
        assertTrue(solution.no23(new int[]{4, 5}));
    }

    @Test
    public void no23_v02() {
        assertFalse(solution.no23(new int[]{4, 2}));
    }

    @Test
    public void no23_v03() {
        assertFalse(solution.no23(new int[]{3, 5}));
    }

    @Test
    public void no23_v04() {
        assertTrue(solution.no23(new int[]{1, 9}));
    }

    @Test
    public void no23_v05() {
        assertFalse(solution.no23(new int[]{2, 9}));
    }

    @Test
    public void no23_v06() {
        assertFalse(solution.no23(new int[]{1, 3}));
    }

    @Test
    public void no23_v07() {
        assertTrue(solution.no23(new int[]{1, 1}));
    }

    @Test
    public void no23_v08() {
        assertFalse(solution.no23(new int[]{2, 2}));
    }

    @Test
    public void no23_v09() {
        assertFalse(solution.no23(new int[]{3, 3}));
    }

    @Test
    public void no23_v10() {
        assertTrue(solution.no23(new int[]{7, 8}));
    }

    @Test
    public void no23_v11() {
        assertTrue(solution.no23(new int[]{8, 7}));
    }
}
