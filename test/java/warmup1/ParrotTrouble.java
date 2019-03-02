package warmup1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParrotTrouble {
    Solution solution = new Solution();

    @Test
    public void parrotTroubleTrue6() {
        assertTrue(solution.parrotTrouble(true, 6));
    }

    @Test
    public void parrotTroubleTrue7() {
        assertFalse(solution.parrotTrouble(true, 7));
    }

}
