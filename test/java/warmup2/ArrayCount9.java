package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCount9 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void arrayCount9_v01() {
        int input[] = {1, 2, 9};
        assertEquals(1, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v02() {
        int input[] = {1, 9, 9};
        assertEquals(2, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v03() {
        int input[] = {1, 9, 9, 3, 9};
        assertEquals(3, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v04() {
        int input[] = {1, 2, 3};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v05() {
        int input[] = {};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v06() {
        int input[] = {4, 2, 4, 3, 1};
        assertEquals(0, solution.arrayCount9(input));
    }

    @Test
    public void arrayCount9_v07() {
        int input[] = {9, 2, 4, 3, 1};
        assertEquals(1, solution.arrayCount9(input));
    }
}
