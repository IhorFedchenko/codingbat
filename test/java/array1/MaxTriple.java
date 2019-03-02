package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTriple {

    @Test
    public void max_triple_v01() {
        Solution solution = new Solution();
        assertEquals(3, solution.maxTriple(new int[]{1, 2, 3}));
    }

    @Test
    public void max_triple_v02() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{1, 5, 3}));
    }

    @Test
    public void max_triple_v03() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{5, 2, 3}));
    }

    @Test
    public void max_triple_v04() {
        Solution solution = new Solution();
        assertEquals(3, solution.maxTriple(new int[]{1, 2, 3, 1, 1}));
    }

    @Test
    public void max_triple_v05() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{1, 7, 3, 1, 5}));
    }

    @Test
    public void max_triple_v06() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{5, 1, 3, 7, 1}));
    }

    @Test
    public void max_triple_v07() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
    }

    @Test
    public void max_triple_v08() {
        Solution solution = new Solution();
        assertEquals(9, solution.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
    }

    @Test
    public void max_triple_v09() {
        Solution solution = new Solution();
        assertEquals(9, solution.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
    }

    @Test
    public void max_triple_v10() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxTriple(new int[]{2, 2, 5, 1, 1}));
    }
}
