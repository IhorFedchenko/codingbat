package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FirstLast6 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void first_last6_v01() {
        assertTrue(solution.firstLast6(new int[]{1, 2, 6}));
    }

    @Test
    public void first_last6_v02() {
        assertTrue(solution.firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    public void first_last6_v03() {
        assertFalse(solution.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    @Test
    public void first_last6_v04() {
        assertTrue(solution.firstLast6(new int[]{13, 6, 1, 2, 6}));
    }

    @Test
    public void first_last6_v05() {
        assertFalse(solution.firstLast6(new int[]{3, 2, 1}));
    }

    @Test
    public void first_last6_v06() {
        assertFalse(solution.firstLast6(new int[]{3, 6, 1}));
    }

    @Test
    public void first_last6_v07() {
        assertTrue(solution.firstLast6(new int[]{3, 6}));
    }

    @Test
    public void first_last6_v08() {
        assertTrue(solution.firstLast6(new int[]{6}));
    }

    @Test
    public void first_last6_v09() {
        assertFalse(solution.firstLast6(new int[]{3}));
    }

    @Test
    public void first_last6_v10() {
        assertTrue(solution.firstLast6(new int[]{5, 6}));
    }

    @Test
    public void first_last6_v11() {
        assertFalse(solution.firstLast6(new int[]{5, 5}));
    }

    @Test
    public void first_last6_v12() {
        assertTrue(solution.firstLast6(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    public void first_last6_v13() {
        assertFalse(solution.firstLast6(new int[]{1, 2, 3, 4}));
    }
}
