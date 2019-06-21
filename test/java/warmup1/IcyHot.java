package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IcyHot {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void icy_hot_v1() {
        assertTrue(solution.icyHot(120, -1));
    }

    @Test
    public void icy_hot_v2() {
        assertTrue(solution.icyHot(-1, 120));
    }

    @Test
    public void icy_hot_v3() {
        assertFalse(solution.icyHot(2, -120));
    }

    @Test
    public void icy_hot_v4() {
        assertFalse(solution.icyHot(-1, 100));
    }

    @Test
    public void icy_hot_v5() {
        assertFalse(solution.icyHot(-2, -2));
    }

    @Test
    public void icy_hot_v6() {
        assertFalse(solution.icyHot(120, 120));
    }
}
