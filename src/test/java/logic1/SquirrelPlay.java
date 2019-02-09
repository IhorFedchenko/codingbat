package logic1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SquirrelPlay {

    @Test
    public void squirrelPlay_v01(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(70, false));
    }

    @Test
    public void squirrelPlay_v02(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(95, false));
    }

    @Test
    public void squirrelPlay_v03(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(95, true));
    }

    @Test
    public void squirrelPlay_v04(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(90, false));
    }

    @Test
    public void squirrelPlay_v05(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(90, true));
    }

    @Test
    public void squirrelPlay_v06(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(50, false));
    }

    @Test
    public void squirrelPlay_v07(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(50, true));
    }

    @Test
    public void squirrelPlay_v08(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(100, false));
    }

    @Test
    public void squirrelPlay_v09(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(100, true));
    }

    @Test
    public void squirrelPlay_v10(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(105, true));
    }

    @Test
    public void squirrelPlay_v11(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(59, false));
    }

    @Test
    public void squirrelPlay_v12(){
        Solution solution = new Solution();
        assertFalse(solution.squirrelPlay(59, true));
    }

    @Test
    public void squirrelPlay_v13(){
        Solution solution = new Solution();
        assertTrue(solution.squirrelPlay(60, false));
    }
}
