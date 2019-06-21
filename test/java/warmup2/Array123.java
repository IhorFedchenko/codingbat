package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Array123 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void array123_v01() {
        assertTrue(solution.array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void array123_v02() {
        assertFalse(solution.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void array123_v03() {
        assertTrue(solution.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    @Test
    public void array123_v04() {
        assertFalse(solution.array123(new int[]{1, 1, 2, 1, 2, 1}));
    }

    @Test
    public void array123_v05() {
        assertTrue(solution.array123(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    public void array123_v06() {
        assertTrue(solution.array123(new int[]{1, 2, 3}));
    }

    @Test
    public void array123_v07() {
        assertFalse(solution.array123(new int[]{1, 1, 1}));
    }

    @Test
    public void array123_v08() {
        assertFalse(solution.array123(new int[]{1, 2}));
    }

    @Test
    public void array123_v09() {
        assertFalse(solution.array123(new int[]{1}));
    }

    @Test
    public void array123_v10() {
        assertFalse(solution.array123(new int[]{}));
    }
}
