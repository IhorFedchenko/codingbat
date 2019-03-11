package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShareDigit {

    @Test
    public void share_digit_v01(){
        Solution solution = new Solution();
        assertTrue(solution.shareDigit(12,23));
    }

    @Test
    public void share_digit_v02(){
        Solution solution = new Solution();
        assertFalse(solution.shareDigit(12,43));
    }

    @Test
    public void share_digit_v03(){
        Solution solution = new Solution();
        assertFalse(solution.shareDigit(12,44));
    }

    @Test
    public void share_digit_v04(){
        Solution solution = new Solution();
        assertTrue(solution.shareDigit(23,12));
    }

    @Test
    public void share_digit_v05(){
        Solution solution = new Solution();
        assertTrue(solution.shareDigit(23,39));
    }

    @Test
    public void share_digit_v06(){
        Solution solution = new Solution();
        assertFalse(solution.shareDigit(23,19));
    }

    @Test
    public void share_digit_v07(){
        Solution solution = new Solution();
        assertTrue(solution.shareDigit(30,90));
    }

    @Test
    public void share_digit_v08(){
        Solution solution = new Solution();
        assertFalse(solution.shareDigit(30,91));
    }

    @Test
    public void share_digit_v09(){
        Solution solution = new Solution();
        assertTrue(solution.shareDigit(55,55));
    }

    @Test
    public void share_digit_v10(){
        Solution solution = new Solution();
        assertFalse(solution.shareDigit(55,44));
    }
}
