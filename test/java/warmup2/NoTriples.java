package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoTriples {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void no_triples_v01() {
        assertTrue(solution.noTriples(new int[]{1, 1, 2, 2, 1}));
    }

    @Test
    public void no_triples_v02() {
        assertFalse(solution.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
    }

    @Test
    public void no_triples_v03() {
        assertFalse(solution.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    @Test
    public void no_triples_v04() {
        assertTrue(solution.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
    }

    @Test
    public void no_triples_v05() {
        assertTrue(solution.noTriples(new int[]{1, 2, 1}));
    }

    @Test
    public void no_triples_v06() {
        assertFalse(solution.noTriples(new int[]{1, 1, 1}));
    }

    @Test
    public void no_triples_v07() {
        assertTrue(solution.noTriples(new int[]{1, 1}));
    }

    @Test
    public void no_triples_v08() {
        assertTrue(solution.noTriples(new int[]{1}));
    }

    @Test
    public void no_triples_v09() {
        assertTrue(solution.noTriples(new int[]{}));
    }

}
