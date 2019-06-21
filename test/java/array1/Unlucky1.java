package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Unlucky1 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void unlucky_v01() {
        assertTrue(solution.unlucky1(new int[]{1, 3, 4, 5}));
    }

    @Test
    public void unlucky_v02() {
        assertTrue(solution.unlucky1(new int[]{2, 1, 3, 4, 5}));
    }

    @Test
    public void unlucky_v03() {
        assertFalse(solution.unlucky1(new int[]{1, 1, 1}));
    }

    @Test
    public void unlucky_v04() {
        assertTrue(solution.unlucky1(new int[]{1, 3, 1}));
    }

    @Test
    public void unlucky_v05() {
        assertTrue(solution.unlucky1(new int[]{1, 1, 3}));
    }

    @Test
    public void unlucky_v06() {
        assertFalse(solution.unlucky1(new int[]{1, 2, 3}));
    }

    @Test
    public void unlucky_v07() {
        assertFalse(solution.unlucky1(new int[]{3, 3, 3}));
    }

    @Test
    public void unlucky_v08() {
        assertTrue(solution.unlucky1(new int[]{1, 3}));
    }

    @Test
    public void unlucky_v09() {
        assertFalse(solution.unlucky1(new int[]{1, 4}));
    }

    @Test
    public void unlucky_v10() {
        assertFalse(solution.unlucky1(new int[]{1}));
    }

    @Test
    public void unlucky_v11() {
        assertFalse(solution.unlucky1(new int[]{}));
    }

    @Test
    public void unlucky_v12() {
        assertFalse(solution.unlucky1(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    public void unlucky_v13() {
        assertTrue(solution.unlucky1(new int[]{1, 1, 3, 1, 1}));
    }

    @Test
    public void unlucky_v14() {
        assertTrue(solution.unlucky1(new int[]{1, 1, 1, 1, 3}));
    }

    @Test
    public void unlucky_v15() {
        assertFalse(solution.unlucky1(new int[]{1, 4, 1, 5}));
    }

    @Test
    public void unlucky_v16() {
        assertFalse(solution.unlucky1(new int[]{1, 1, 2, 3}));
    }

    @Test
    public void unlucky_v17() {
        assertFalse(solution.unlucky1(new int[]{2, 3, 2, 1}));
    }

    @Test
    public void unlucky_v18() {
        assertTrue(solution.unlucky1(new int[]{2, 3, 1, 3}));
    }

    @Test
    public void unlucky_v19() {
        assertTrue(solution.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
    }
}
