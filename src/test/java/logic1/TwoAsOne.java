package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoAsOne {

    @Test
    public void two_as_one_v01(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(1,2,3));
    }

    @Test
    public void two_as_one_v02(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(3,1,2));
    }

    @Test
    public void two_as_one_v03(){
        Solution solution = new Solution();
        assertFalse(solution.twoAsOne(3,2,2));
    }

    @Test
    public void two_as_one_v04(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(2,3,1));
    }

    @Test
    public void two_as_one_v05(){
        Solution solution = new Solution();
        assertFalse(solution.twoAsOne(6,3,-2));
    }

    @Test
    public void two_as_one_v06(){
        Solution solution = new Solution();
        assertFalse(solution.twoAsOne(5,3,-3));
    }

    @Test
    public void two_as_one_v07(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(2,5,3));
    }

    @Test
    public void two_as_one_v08(){
        Solution solution = new Solution();
        assertFalse(solution.twoAsOne(9,5,5));
    }

    @Test
    public void two_as_one_v09(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(9,4,5));
    }

    @Test
    public void two_as_one_v10(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(5,4,9));
    }

    @Test
    public void two_as_one_v11(){
        Solution solution = new Solution();
        assertTrue(solution.twoAsOne(3,3,0));
    }

    @Test
    public void two_as_one_v12(){
        Solution solution = new Solution();
        assertFalse(solution.twoAsOne(3,3,2));
    }
}
