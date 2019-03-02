package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MakeEnds {

    @Test
    public void make_ends_v01() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(solution.makeEnds(new int[]{1, 2, 3})));
    }

    @Test
    public void make_ends_v02() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 4}), Arrays.toString(solution.makeEnds(new int[]{1, 2, 3,4})));
    }

    @Test
    public void make_ends_v03() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{7,2}), Arrays.toString(solution.makeEnds(new int[]{7,4,6,2})));
    }

    @Test
    public void make_ends_v04() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(solution.makeEnds(new int[]{1,2,2,2,2,2,2,3})));
    }

    @Test
    public void make_ends_v05() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{7,4}), Arrays.toString(solution.makeEnds(new int[]{7,4})));
    }

    @Test
    public void make_ends_v06() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{7,7}), Arrays.toString(solution.makeEnds(new int[]{7})));
    }

    @Test
    public void make_ends_v07() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{5,9}), Arrays.toString(solution.makeEnds(new int[]{5,9})));
    }

    @Test
    public void make_ends_v08() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{2,1}), Arrays.toString(solution.makeEnds(new int[]{2,3,4,1})));
    }
}
