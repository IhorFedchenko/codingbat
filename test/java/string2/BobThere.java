package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BobThere {

    @Test
    public void bob_there_v01(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("abcbob"));
    }

    @Test
    public void bob_there_v02(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("b9b"));
    }

    @Test
    public void bob_there_v03(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("bac"));
    }

    @Test
    public void bob_there_v04(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("bbb"));
    }

    @Test
    public void bob_there_v05(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("abcdefb"));
    }

    @Test
    public void bob_there_v06(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("123abcbcdbabxyz"));
    }

    @Test
    public void bob_there_v07(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("b12"));
    }

    @Test
    public void bob_there_v08(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("b1b"));
    }

    @Test
    public void bob_there_v09(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("b12b1b"));
    }

    @Test
    public void bob_there_v10(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("bbc"));
    }

    @Test
    public void bob_there_v11(){
        Solution solution = new Solution();
        assertTrue(solution.bobThere("bbb"));
    }

    @Test
    public void bob_there_v12(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("bb"));
    }

    @Test
    public void bob_there_v13(){
        Solution solution = new Solution();
        assertFalse(solution.bobThere("b"));
    }
}
