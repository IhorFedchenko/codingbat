package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SleepInSolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void sleepInFalseFalse() {
        assertTrue(solution.sleepIn(false, false));
    }

    @Test
    public void sleepInTrueFalse() {
        assertFalse(solution.sleepIn(true, false));
    }

    @Test
    public void sleepInFalseTrue() {
        assertTrue(solution.sleepIn(false, true));
    }

    @Test
    public void sleepInTrueTrue() {
        assertTrue(solution.sleepIn(true, true));
    }

}
