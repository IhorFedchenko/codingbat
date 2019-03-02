package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array667 {

    @Test
    public void array667_v01() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{6, 6, 2}));
    }

    @Test
    public void array667_v02() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{6, 6, 2, 6}));
    }

    @Test
    public void array667_v03() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{6, 7, 2, 6}));
    }

    @Test
    public void array667_v04() {
        Solution solution = new Solution();
        assertEquals(2, solution.array667(new int[]{6, 6, 2, 6, 7}));
    }

    @Test
    public void array667_v05() {
        Solution solution = new Solution();
        assertEquals(0, solution.array667(new int[]{1, 6, 3}));
    }

    @Test
    public void array667_v06() {
        Solution solution = new Solution();
        assertEquals(0, solution.array667(new int[]{6, 1}));
    }

    @Test
    public void array667_v07() {
        Solution solution = new Solution();
        assertEquals(0, solution.array667(new int[]{}));
    }

    @Test
    public void array667_v08() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{3, 6, 7, 6}));
    }

    @Test
    public void array667_v09() {
        Solution solution = new Solution();
        assertEquals(2, solution.array667(new int[]{3, 6, 6, 7}));
    }

    @Test
    public void array667_v10() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{6, 3, 6, 6}));
    }

    @Test
    public void array667_v11() {
        Solution solution = new Solution();
        assertEquals(2, solution.array667(new int[]{6, 7, 6, 6}));
    }

    @Test
    public void array667_v12() {
        Solution solution = new Solution();
        assertEquals(0, solution.array667(new int[]{1, 2, 3, 5, 6}));
    }

    @Test
    public void array667_v13() {
        Solution solution = new Solution();
        assertEquals(1, solution.array667(new int[]{1, 2, 3, 6, 6}));
    }
}
