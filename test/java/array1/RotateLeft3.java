package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RotateLeft3 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void rotate_left_3_v01() {
        assertEquals(Arrays.toString(new int[]{2, 3, 1}), Arrays.toString(solution.rotateLeft3(new int[]{1, 2, 3})));
    }

    @Test
    public void rotate_left_3_v02() {
        assertEquals(Arrays.toString(new int[]{11, 9, 5}), Arrays.toString(solution.rotateLeft3(new int[]{5, 11, 9})));
    }

    @Test
    public void rotate_left_3_v03() {
        assertEquals(Arrays.toString(new int[]{0, 0, 7}), Arrays.toString(solution.rotateLeft3(new int[]{7, 0, 0})));
    }

    @Test
    public void rotate_left_3_v04() {
        assertEquals(Arrays.toString(new int[]{2, 1, 1}), Arrays.toString(solution.rotateLeft3(new int[]{1, 2, 1})));
    }

    @Test
    public void rotate_left_3_v05() {
        assertEquals(Arrays.toString(new int[]{0, 1, 0}), Arrays.toString(solution.rotateLeft3(new int[]{0, 0, 1})));
    }
}
