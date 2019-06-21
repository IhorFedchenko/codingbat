package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MakeEnds {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_ends_v01() {
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(solution.makeEnds(new int[]{1, 2, 3})));
    }

    @Test
    public void make_ends_v02() {
        assertEquals(Arrays.toString(new int[]{1, 4}), Arrays.toString(solution.makeEnds(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void make_ends_v03() {
        assertEquals(Arrays.toString(new int[]{7, 2}), Arrays.toString(solution.makeEnds(new int[]{7, 4, 6, 2})));
    }

    @Test
    public void make_ends_v04() {
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(solution.makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3})));
    }

    @Test
    public void make_ends_v05() {
        assertEquals(Arrays.toString(new int[]{7, 4}), Arrays.toString(solution.makeEnds(new int[]{7, 4})));
    }

    @Test
    public void make_ends_v06() {
        assertEquals(Arrays.toString(new int[]{7, 7}), Arrays.toString(solution.makeEnds(new int[]{7})));
    }

    @Test
    public void make_ends_v07() {
        assertEquals(Arrays.toString(new int[]{5, 9}), Arrays.toString(solution.makeEnds(new int[]{5, 9})));
    }

    @Test
    public void make_ends_v08() {
        assertEquals(Arrays.toString(new int[]{2, 1}), Arrays.toString(solution.makeEnds(new int[]{2, 3, 4, 1})));
    }
}
