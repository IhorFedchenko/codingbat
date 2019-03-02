package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LastDigit {

    @Test
    public void last_digit_v01(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(23,19, 13));
    }

    @Test
    public void last_digit_v02(){
        Solution solution = new Solution();
        assertFalse(solution.lastDigit(23,19, 12));
    }

    @Test
    public void last_digit_v03(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(23,19, 3));
    }

    @Test
    public void last_digit_v04(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(23,19, 39));
    }

    @Test
    public void last_digit_v05(){
        Solution solution = new Solution();
        assertFalse(solution.lastDigit(1,2, 3));
    }

    @Test
    public void last_digit_v06(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(1,1, 2));
    }

    @Test
    public void last_digit_v07(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(1,2, 2));
    }

    @Test
    public void last_digit_v08(){
        Solution solution = new Solution();
        assertFalse(solution.lastDigit(14,25, 43));
    }

    @Test
    public void last_digit_v09(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(14,25, 45));
    }

    @Test
    public void last_digit_v10(){
        Solution solution = new Solution();
        assertFalse(solution.lastDigit(248,106, 1002));
    }

    @Test
    public void last_digit_v11(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(248,106, 1008));
    }

    @Test
    public void last_digit_v12(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(10,11, 20));
    }

    @Test
    public void last_digit_v13(){
        Solution solution = new Solution();
        assertTrue(solution.lastDigit(0,11, 0));
    }
}
