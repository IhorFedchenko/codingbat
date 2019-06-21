package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In1to10 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void in1to10_v01() {
        assertTrue(solution.in1To10(5, false));
    }

    @Test
    public void in1to10_v02() {
        assertFalse(solution.in1To10(11, false));
    }

    @Test
    public void in1to10_v03() {
        assertTrue(solution.in1To10(11, true));
    }

    @Test
    public void in1to10_v04() {
        assertTrue(solution.in1To10(10, false));
    }

    @Test
    public void in1to10_v05() {
        assertTrue(solution.in1To10(10, true));
    }

    @Test
    public void in1to10_v06() {
        assertTrue(solution.in1To10(9, false));
    }

    @Test
    public void in1to10_v07() {
        assertFalse(solution.in1To10(9, true));
    }

    @Test
    public void in1to10_v08() {
        assertTrue(solution.in1To10(1, false));
    }

    @Test
    public void in1to10_v09() {
        assertTrue(solution.in1To10(1, true));
    }

    @Test
    public void in1to10_v10() {
        assertFalse(solution.in1To10(0, false));
    }

    @Test
    public void in1to10_v11() {
        assertTrue(solution.in1To10(0, true));
    }

    @Test
    public void in1to10_v12() {
        assertFalse(solution.in1To10(-1, false));
    }

    @Test
    public void in1to10_v13() {
        assertTrue(solution.in1To10(-1, true));
    }

    @Test
    public void in1to10_v14() {
        assertFalse(solution.in1To10(99, false));
    }

    @Test
    public void in1to10_v15() {
        assertTrue(solution.in1To10(-99, true));
    }
}
