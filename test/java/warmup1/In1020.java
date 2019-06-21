package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In1020 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void in1020_case01() {
        assertTrue(solution.in1020(12, 99));
    }

    @Test
    public void in1020_case02() {
        assertTrue(solution.in1020(21, 12));
    }

    @Test
    public void in1020_case03() {
        assertFalse(solution.in1020(8, 99));
    }

    @Test
    public void in1020_case04() {
        assertTrue(solution.in1020(99, 10));
    }

    @Test
    public void in1020_case05() {
        assertTrue(solution.in1020(20, 20));
    }

    @Test
    public void in1020_case06() {
        assertFalse(solution.in1020(21, 21));
    }

    @Test
    public void in1020_case07() {
        assertFalse(solution.in1020(9, 9));
    }
}
