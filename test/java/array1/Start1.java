package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Start1 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void start1_v01() {
        assertEquals(2, solution.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

    @Test
    public void start1_v02() {
        assertEquals(1, solution.start1(new int[]{7, 2, 3}, new int[]{1}));
    }

    @Test
    public void start1_v03() {
        assertEquals(1, solution.start1(new int[]{1, 2}, new int[]{}));
    }

    @Test
    public void start1_v04() {
        assertEquals(1, solution.start1(new int[]{}, new int[]{1, 2}));
    }

    @Test
    public void start1_v05() {
        assertEquals(0, solution.start1(new int[]{7}, new int[]{}));
    }

    @Test
    public void start1_v06() {
        assertEquals(1, solution.start1(new int[]{7}, new int[]{1}));
    }

    @Test
    public void start1_v07() {
        assertEquals(2, solution.start1(new int[]{1}, new int[]{1}));
    }

    @Test
    public void start1_v08() {
        assertEquals(0, solution.start1(new int[]{7}, new int[]{8}));
    }

    @Test
    public void start1_v09() {
        assertEquals(0, solution.start1(new int[]{}, new int[]{}));
    }

    @Test
    public void start1_v10() {
        assertEquals(2, solution.start1(new int[]{1, 3}, new int[]{1}));
    }
}
