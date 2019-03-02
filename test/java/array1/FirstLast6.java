package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FirstLast6 {

    @Test
    public void first_last6_v01() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{1, 2, 6}));
    }

    @Test
    public void first_last6_v02() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    public void first_last6_v03() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    @Test
    public void first_last6_v04() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{13, 6, 1, 2, 6}));
    }

    @Test
    public void first_last6_v05() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{3, 2, 1}));
    }

    @Test
    public void first_last6_v06() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{3, 6, 1}));
    }

    @Test
    public void first_last6_v07() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{3, 6}));
    }

    @Test
    public void first_last6_v08() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{6}));
    }

    @Test
    public void first_last6_v09() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{3}));
    }

    @Test
    public void first_last6_v10() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{5, 6}));
    }

    @Test
    public void first_last6_v11() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{5, 5}));
    }

    @Test
    public void first_last6_v12() {
        Solution solution = new Solution();
        assertTrue(solution.firstLast6(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    public void first_last6_v13() {
        Solution solution = new Solution();
        assertFalse(solution.firstLast6(new int[]{1, 2, 3, 4}));
    }
}
