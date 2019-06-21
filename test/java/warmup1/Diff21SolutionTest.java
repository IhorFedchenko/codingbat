package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Diff21SolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void diff21_19() {
        assertEquals(2, solution.diff21(19));
    }

    @Test
    public void diff21_10() {
        assertEquals(11, solution.diff21(10));
    }

    @Test
    public void diff21_21() {
        assertEquals(0, solution.diff21(21));
    }

    @Test
    public void diff21_22() {
        assertEquals(2, solution.diff21(22));
    }

    @Test
    public void diff21_25() {
        assertEquals(8, solution.diff21(25));
    }

    @Test
    public void diff21_30() {
        assertEquals(18, solution.diff21(30));
    }

    @Test
    public void diff21_0() {
        assertEquals(21, solution.diff21(0));
    }

    @Test
    public void diff21_1() {
        assertEquals(20, solution.diff21(1));
    }

    @Test
    public void diff21_2() {
        assertEquals(19, solution.diff21(2));
    }

    @Test
    public void diff21_minus1() {
        assertEquals(22, solution.diff21(-1));
    }

    @Test
    public void diff21_minus2() {
        assertEquals(23, solution.diff21(-2));
    }

    @Test
    public void diff21_50() {
        assertEquals(58, solution.diff21(50));
    }
}
