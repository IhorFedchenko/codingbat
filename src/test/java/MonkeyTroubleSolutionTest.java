import org.junit.Test;
import warmup1.Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleSolutionTest {

    Solution solution = new Solution();

    @Test
    public void monkeyTroubleTrueTrue() {
        assertTrue(solution.monkeyTrouble(true, true));
    }

    @Test
    public void monkeyTroubleFalseFalse() {
        assertTrue(solution.monkeyTrouble(false, false));
    }

    @Test
    public void monkeyTroubleTrueFalse() {
        assertFalse(solution.monkeyTrouble(true, false));
    }

    @Test
    public void monkeyTroubleFalseTrue() {
        assertFalse(solution.monkeyTrouble(false, true));
    }
}
