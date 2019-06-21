package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Less20 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void less20_18() {
        assertTrue(solution.less20(18));
    }

    @Test
    public void less20_19() {
        assertTrue(solution.less20(19));
    }

    @Test
    public void less20_20() {
        assertFalse(solution.less20(20));
    }

    @Test
    public void less20_8() {
        assertFalse(solution.less20(8));
    }

    @Test
    public void less20_17() {
        assertFalse(solution.less20(17));
    }

    @Test
    public void less20_23() {
        assertFalse(solution.less20(23));
    }

    @Test
    public void less20_25() {
        assertFalse(solution.less20(25));
    }

    @Test
    public void less20_30() {
        assertFalse(solution.less20(30));
    }

    @Test
    public void less20_31() {
        assertFalse(solution.less20(31));
    }

    @Test
    public void less20_58() {
        assertTrue(solution.less20(58));
    }

    @Test
    public void less20_59() {
        assertTrue(solution.less20(59));
    }

    @Test
    public void less20_60() {
        assertFalse(solution.less20(60));
    }

    @Test
    public void less20_61() {
        assertFalse(solution.less20(61));
    }

    @Test
    public void less20_62() {
        assertFalse(solution.less20(62));
    }

    @Test
    public void less20_1017() {
        assertFalse(solution.less20(1017));
    }

    @Test
    public void less20_1018() {
        assertTrue(solution.less20(1018));
    }

    @Test
    public void less20_1019() {
        assertTrue(solution.less20(1019));
    }

    @Test
    public void less20_1020() {
        assertFalse(solution.less20(1020));
    }

    @Test
    public void less20_1021() {
        assertFalse(solution.less20(1021));
    }

    @Test
    public void less20_1022() {
        assertFalse(solution.less20(1022));
    }

    @Test
    public void less20_1023() {
        assertFalse(solution.less20(1023));
    }

    @Test
    public void less20_37() {
        assertFalse(solution.less20(37));
    }
}
