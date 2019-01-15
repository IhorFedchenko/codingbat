package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameFirstLast {

    @Test
    public void same_first_last_v01(){
        Solution solution = new Solution();
        assertFalse(solution.sameFirstLast(new int[]{1,2,3}));
    }

    @Test
    public void same_first_last_v02(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{1,2,3,1}));
    }

    @Test
    public void same_first_last_v03(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{1,2,1}));
    }

    @Test
    public void same_first_last_v04(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{7}));
    }

    @Test
    public void same_first_last_v05(){
        Solution solution = new Solution();
        assertFalse(solution.sameFirstLast(new int[]{}));
    }

    @Test
    public void same_first_last_v06(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{1,2,3,4,5,1}));
    }

    @Test
    public void same_first_last_v07(){
        Solution solution = new Solution();
        assertFalse(solution.sameFirstLast(new int[]{1,2,3,4,5,13}));
    }

    @Test
    public void same_first_last_v08(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{13,2,3,4,5,13}));
    }

    @Test
    public void same_first_last_v09(){
        Solution solution = new Solution();
        assertTrue(solution.sameFirstLast(new int[]{7,7}));
    }
}
