package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayFront9 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void array_front_9_v01() {
        assertTrue(solution.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }

    @Test
    public void array_front_9_v02() {
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    public void array_front_9_v03() {
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void array_front_9_v04() {
        assertTrue(solution.arrayFront9(new int[]{9, 2, 3}));
    }

    @Test
    public void array_front_9_v05() {
        assertTrue(solution.arrayFront9(new int[]{1, 9, 9}));
    }

    @Test
    public void array_front_9_v06() {
        assertFalse(solution.arrayFront9(new int[]{1, 2, 3}));
    }

    @Test
    public void array_front_9_v07() {
        assertTrue(solution.arrayFront9(new int[]{1, 9}));
    }

    @Test
    public void array_front_9_v08() {
        assertFalse(solution.arrayFront9(new int[]{5, 5}));
    }

    @Test
    public void array_front_9_v09() {
        assertFalse(solution.arrayFront9(new int[]{2}));
    }

    @Test
    public void array_front_9_v10() {
        assertTrue(solution.arrayFront9(new int[]{9}));
    }

    @Test
    public void array_front_9_v11() {
        assertFalse(solution.arrayFront9(new int[]{}));
    }

    @Test
    public void array_front_9_v12() {
        assertTrue(solution.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }
}
