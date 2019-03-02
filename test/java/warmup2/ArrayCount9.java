package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCount9 {

    @Test
    public void arrayCount9_v01() {
        Solution solution = new Solution();
        int input[] = {1, 2, 9};
        assertEquals(1, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v02() {
        Solution solution = new Solution();
        int input[] = {1, 9, 9};
        assertEquals(2, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v03() {
        Solution solution = new Solution();
        int input[] = {1, 9, 9, 3, 9};
        assertEquals(3, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v04() {
        Solution solution = new Solution();
        int input[] = {1, 2, 3};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v05() {
        Solution solution = new Solution();
        int input[] = {};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v06() {
        Solution solution = new Solution();
        int input[] = {4, 2, 4, 3, 1};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v07() {
        Solution solution = new Solution();
        int input[] = {9, 2, 4, 3, 1};
        assertEquals(1, solution.arrayCount9(input));
    }
}
