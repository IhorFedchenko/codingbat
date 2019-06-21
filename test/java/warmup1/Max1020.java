package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Max1020 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void max1020_11_19() {
        assertEquals(19, solution.max1020(11, 19));
    }

    @Test
    public void max1020_19_11() {
        assertEquals(19, solution.max1020(19, 11));
    }

    @Test
    public void max1020_11_9() {
        assertEquals(19, solution.max1020(11, 19));
    }

    @Test
    public void max1020_9_21() {
        assertEquals(0, solution.max1020(9, 21));
    }

    @Test
    public void max1020_10_21() {
        assertEquals(10, solution.max1020(10, 21));
    }

    @Test
    public void max1020_21_10() {
        assertEquals(10, solution.max1020(21, 10));
    }

    @Test
    public void max1020_9_11() {
        assertEquals(11, solution.max1020(9, 11));
    }

    @Test
    public void max1020_23_10() {
        assertEquals(10, solution.max1020(23, 10));
    }

    @Test
    public void max1020_20_10() {
        assertEquals(20, solution.max1020(20, 10));
    }

    @Test
    public void max1020_7_20() {
        assertEquals(20, solution.max1020(7, 20));
    }

    @Test
    public void max1020_17_16() {
        assertEquals(17, solution.max1020(17, 16));
    }
}
