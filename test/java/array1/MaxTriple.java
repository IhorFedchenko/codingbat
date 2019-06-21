package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTriple {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void max_triple_v01() {
        assertEquals(3, solution.maxTriple(new int[]{1, 2, 3}));
    }

    @Test
    public void max_triple_v02() {
        assertEquals(5, solution.maxTriple(new int[]{1, 5, 3}));
    }

    @Test
    public void max_triple_v03() {
        assertEquals(5, solution.maxTriple(new int[]{5, 2, 3}));
    }

    @Test
    public void max_triple_v04() {
        assertEquals(3, solution.maxTriple(new int[]{1, 2, 3, 1, 1}));
    }

    @Test
    public void max_triple_v05() {
        assertEquals(5, solution.maxTriple(new int[]{1, 7, 3, 1, 5}));
    }

    @Test
    public void max_triple_v06() {
        assertEquals(5, solution.maxTriple(new int[]{5, 1, 3, 7, 1}));
    }

    @Test
    public void max_triple_v07() {
        assertEquals(5, solution.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
    }

    @Test
    public void max_triple_v08() {
        assertEquals(9, solution.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
    }

    @Test
    public void max_triple_v09() {
        assertEquals(9, solution.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
    }

    @Test
    public void max_triple_v10() {
        assertEquals(5, solution.maxTriple(new int[]{2, 2, 5, 1, 1}));
    }
}
