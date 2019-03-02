package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasBad {

    @Test
    public void has_bad_badxx(){
        Solution solution = new Solution();
        assertTrue(solution.hasBad("badxx"));
    }

    @Test
    public void has_bad_xbadxx(){
        Solution solution = new Solution();
        assertTrue(solution.hasBad("badxx"));
    }

    @Test
    public void has_bad_xxbadxx(){
        Solution solution = new Solution();
        assertFalse(solution.hasBad("xxbadxx"));
    }

    @Test
    public void has_bad_code(){
        Solution solution = new Solution();
        assertFalse(solution.hasBad("code"));
    }

    @Test
    public void has_bad_bad(){
        Solution solution = new Solution();
        assertTrue(solution.hasBad("bad"));
    }

    @Test
    public void has_bad_ba(){
        Solution solution = new Solution();
        assertFalse(solution.hasBad("ba"));
    }

    @Test
    public void has_bad_xba(){
        Solution solution = new Solution();
        assertFalse(solution.hasBad("xba"));
    }

    @Test
    public void has_bad_xbad(){
        Solution solution = new Solution();
        assertTrue(solution.hasBad("xbad"));
    }

    @Test
    public void has_bad__(){
        Solution solution = new Solution();
        assertFalse(solution.hasBad(""));
    }

    @Test
    public void has_bad_badyy(){
        Solution solution = new Solution();
        assertTrue(solution.hasBad("badyy"));
    }
}
