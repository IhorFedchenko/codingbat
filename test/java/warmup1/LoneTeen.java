package warmup1;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoneTeen {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void lone_teen13_99() {
        assertTrue(solution.loneTeen(13, 99));
    }

    @Test
    public void lone_teen21_19() {
        assertTrue(solution.loneTeen(21, 19));
    }

    @Test
    public void lone_teen13_13() {
        assertFalse(solution.loneTeen(13, 13));
    }

    @Test
    public void lone_teen14_20() {
        assertTrue(solution.loneTeen(14, 20));
    }

    @Test
    public void lone_teen20_15() {
        assertTrue(solution.loneTeen(20, 15));
    }

    @Test
    public void lone_teen16_17() {
        assertFalse(solution.loneTeen(16, 17));
    }

    @Test
    public void lone_teen16_9() {
        assertTrue(solution.loneTeen(16, 9));
    }

    @Test
    public void lone_teen16_18() {
        assertFalse(solution.loneTeen(16, 18));
    }

    @Test
    public void lone_teen13_19() {
        assertFalse(solution.loneTeen(13, 19));
    }

    @Test
    public void lone_teen13_20() {
        assertTrue(solution.loneTeen(13, 20));
    }

    @Test
    public void lone_teen6_18() {
        assertTrue(solution.loneTeen(6, 18));
    }

    @Test
    public void lone_teen99_13() {
        assertTrue(solution.loneTeen(99, 13));
    }

    @Test
    public void lone_teen99_99() {
        assertFalse(solution.loneTeen(99, 99));
    }

}
