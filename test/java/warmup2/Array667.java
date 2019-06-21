package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array667 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void array667_v01() {
        assertEquals(1, solution.array667(new int[]{6, 6, 2}));
    }

    @Test
    public void array667_v02() {
        assertEquals(1, solution.array667(new int[]{6, 6, 2, 6}));
    }

    @Test
    public void array667_v03() {
        assertEquals(1, solution.array667(new int[]{6, 7, 2, 6}));
    }

    @Test
    public void array667_v04() {
        assertEquals(2, solution.array667(new int[]{6, 6, 2, 6, 7}));
    }

    @Test
    public void array667_v05() {
        assertEquals(0, solution.array667(new int[]{1, 6, 3}));
    }

    @Test
    public void array667_v06() {
        assertEquals(0, solution.array667(new int[]{6, 1}));
    }

    @Test
    public void array667_v07() {
        assertEquals(0, solution.array667(new int[]{}));
    }

    @Test
    public void array667_v08() {
        assertEquals(1, solution.array667(new int[]{3, 6, 7, 6}));
    }

    @Test
    public void array667_v09() {
        assertEquals(2, solution.array667(new int[]{3, 6, 6, 7}));
    }

    @Test
    public void array667_v10() {
        assertEquals(1, solution.array667(new int[]{6, 3, 6, 6}));
    }

    @Test
    public void array667_v11() {
        assertEquals(2, solution.array667(new int[]{6, 7, 6, 6}));
    }

    @Test
    public void array667_v12() {
        assertEquals(0, solution.array667(new int[]{1, 2, 3, 5, 6}));
    }

    @Test
    public void array667_v13() {
        assertEquals(1, solution.array667(new int[]{1, 2, 3, 6, 6}));
    }
}
