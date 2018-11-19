import org.junit.Test;
import warmup1.Solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SleepInSolutionTest {

    Solution solution = new Solution();

    //SLEEP IN
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

    //MONKEY TROUBLE

    //SUM DOUBLE


}
