package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessBy10 {

    @Test
    public void less_by_10_v01(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(1, 7, 11));
    }

    @Test
    public void less_by_10_v02(){
        Solution solution = new Solution();
        assertFalse(solution.lessBy10(1, 7, 10));
    }

    @Test
    public void less_by_10_v03(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(11, 1, 7));
    }

    @Test
    public void less_by_10_v04(){
        Solution solution = new Solution();
        assertFalse(solution.lessBy10(10, 7, 1));
    }

    @Test
    public void less_by_10_v05(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(-10, 2, 2));
    }

    @Test
    public void less_by_10_v06(){
        Solution solution = new Solution();
        assertFalse(solution.lessBy10(2, 11, 11));
    }

    @Test
    public void less_by_10_v07(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(3, 3, 30));
    }

    @Test
    public void less_by_10_v08(){
        Solution solution = new Solution();
        assertFalse(solution.lessBy10(3, 3, 3));
    }

    @Test
    public void less_by_10_v09(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(10, 1, 11));
    }

    @Test
    public void less_by_10_v10(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(10, 11, 1));
    }

    @Test
    public void less_by_10_v11(){
        Solution solution = new Solution();
        assertFalse(solution.lessBy10(10, 11, 2));
    }

    @Test
    public void less_by_10_v12(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(3, 30, 3));
    }

    @Test
    public void less_by_10_v13(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(2, 2, -8));
    }

    @Test
    public void less_by_10_v14(){
        Solution solution = new Solution();
        assertTrue(solution.lessBy10(2, 8, 12));
    }
}
