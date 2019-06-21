package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyBalance {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void xy_balance_v01() {
        assertTrue(solution.xyBalance("aaxbby"));
    }

    @Test
    public void xy_balance_v02() {
        assertFalse(solution.xyBalance("aaxbb"));
    }

    @Test
    public void xy_balance_v03() {
        assertFalse(solution.xyBalance("yaaxbb"));
    }

    @Test
    public void xy_balance_v04() {
        assertTrue(solution.xyBalance("yaaxbby"));
    }

    @Test
    public void xy_balance_v05() {
        assertTrue(solution.xyBalance("xaxxbby"));
    }

    @Test
    public void xy_balance_v06() {
        assertFalse(solution.xyBalance("xaxxbbyx"));
    }

    @Test
    public void xy_balance_v07() {
        assertTrue(solution.xyBalance("xxbxy"));
    }

    @Test
    public void xy_balance_v08() {
        assertFalse(solution.xyBalance("xxbx"));
    }

    @Test
    public void xy_balance_v09() {
        assertTrue(solution.xyBalance("bbb"));
    }

    @Test
    public void xy_balance_v10() {
        assertFalse(solution.xyBalance("bxbb"));
    }

    @Test
    public void xy_balance_v11() {
        assertTrue(solution.xyBalance("bxyb"));
    }

    @Test
    public void xy_balance_v12() {
        assertTrue(solution.xyBalance("xy"));
    }

    @Test
    public void xy_balance_v13() {
        assertTrue(solution.xyBalance("y"));
    }

    @Test
    public void xy_balance_v14() {
        assertFalse(solution.xyBalance("x"));
    }

    @Test
    public void xy_balance_v15() {
        assertTrue(solution.xyBalance(""));
    }

    @Test
    public void xy_balance_v16() {
        assertFalse(solution.xyBalance("yxyxyxyx"));
    }

    @Test
    public void xy_balance_v17() {
        assertTrue(solution.xyBalance("yxyxyxyxy"));
    }

    @Test
    public void xy_balance_v18() {
        assertTrue(solution.xyBalance("12xabxxydxyxyzz"));
    }
}
