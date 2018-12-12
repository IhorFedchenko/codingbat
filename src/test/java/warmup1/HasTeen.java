package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasTeen {

    @Test
    public void has_teen_case_01(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(13,20,10));
    }

    @Test
    public void has_teen_case_02(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(20,19,10));
    }

    @Test
    public void has_teen_case_03(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(20,10,13));
    }

    @Test
    public void has_teen_case_04(){
        Solution solution = new Solution();
        assertFalse(solution.hasTeen(1,20,12));
    }

    @Test
    public void has_teen_case_05(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(19,20,12));
    }

    @Test
    public void has_teen_case_06(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(12,20,19));
    }

    @Test
    public void has_teen_case_07(){
        Solution solution = new Solution();
        assertFalse(solution.hasTeen(12,9,20));
    }

    @Test
    public void has_teen_case_08(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(12,18,20));
    }

    @Test
    public void has_teen_case_09(){
        Solution solution = new Solution();
        assertTrue(solution.hasTeen(14, 2, 20));
    }

    @Test
    public void has_teen_case_10(){
        Solution solution = new Solution();
        assertFalse(solution.hasTeen(4,2,20));
    }

    @Test
    public void has_teen_case_11(){
        Solution solution = new Solution();
        assertFalse(solution.hasTeen(11,22,22));
    }
}
