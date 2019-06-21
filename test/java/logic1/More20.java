package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class More20 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void more20_20() {
        assertFalse(solution.more20(20));
    }

    @Test
    public void more20_21() {
        assertTrue(solution.more20(21));
    }

    @Test
    public void more20_22() {
        assertTrue(solution.more20(22));
    }

    @Test
    public void more20_23() {
        assertFalse(solution.more20(23));
    }

    @Test
    public void more20_25() {
        assertFalse(solution.more20(25));
    }

    @Test
    public void more20_30() {
        assertFalse(solution.more20(30));
    }

    @Test
    public void more20_31() {
        assertFalse(solution.more20(31));
    }

    @Test
    public void more20_59() {
        assertFalse(solution.more20(59));
    }

    @Test
    public void more20_60() {
        assertFalse(solution.more20(60));
    }

    @Test
    public void more20_61() {
        assertTrue(solution.more20(61));
    }

    @Test
    public void more20_62() {
        assertTrue(solution.more20(62));
    }

    @Test
    public void more20_1020() {
        assertFalse(solution.more20(1020));
    }

    @Test
    public void more20_1021() {
        assertTrue(solution.more20(1021));
    }

    @Test
    public void more20_1000() {
        assertFalse(solution.more20(1000));
    }

    @Test
    public void more20_1001() {
        assertTrue(solution.more20(1001));
    }

    @Test
    public void more20_50() {
        assertFalse(solution.more20(50));
    }

    @Test
    public void more20_55() {
        assertFalse(solution.more20(55));
    }

    @Test
    public void more20_40() {
        assertFalse(solution.more20(40));
    }

    @Test
    public void more20_41() {
        assertTrue(solution.more20(41));
    }

    @Test
    public void more20_39() {
        assertFalse(solution.more20(39));
    }

    @Test
    public void more20_42() {
        assertTrue(solution.more20(42));
    }
}
