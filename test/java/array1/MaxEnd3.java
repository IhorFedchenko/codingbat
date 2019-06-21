package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxEnd3 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void max_end3_v01() {
        assertEquals(Arrays.toString(new int[]{3, 3, 3}), Arrays.toString(solution.maxEnd3(new int[]{1, 2, 3})));
    }

    @Test
    public void max_end3_v02() {
        assertEquals(Arrays.toString(new int[]{11, 11, 11}), Arrays.toString(solution.maxEnd3(new int[]{11, 5, 9})));
    }

    @Test
    public void max_end3_v03() {
        assertEquals(Arrays.toString(new int[]{3, 3, 3}), Arrays.toString(solution.maxEnd3(new int[]{2, 11, 3})));
    }

    @Test
    public void max_end3_v04() {
        assertEquals(Arrays.toString(new int[]{11, 11, 11}), Arrays.toString(solution.maxEnd3(new int[]{11, 3, 3})));
    }

    @Test
    public void max_end3_v05() {
        assertEquals(Arrays.toString(new int[]{11, 11, 11}), Arrays.toString(solution.maxEnd3(new int[]{3, 11, 11})));
    }

    @Test
    public void max_end3_v06() {
        assertEquals(Arrays.toString(new int[]{2, 2, 2}), Arrays.toString(solution.maxEnd3(new int[]{2, 2, 2})));
    }

    @Test
    public void max_end3_v07() {
        assertEquals(Arrays.toString(new int[]{2, 2, 2}), Arrays.toString(solution.maxEnd3(new int[]{2, 11, 2})));
    }

    @Test
    public void max_end3_v08() {
        assertEquals(Arrays.toString(new int[]{1, 1, 1}), Arrays.toString(solution.maxEnd3(new int[]{0, 0, 1})));
    }
}
