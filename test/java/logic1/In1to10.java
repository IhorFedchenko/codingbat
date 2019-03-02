package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In1to10 {

    @Test
    public void in1to10_v01(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(5, false));
    }

    @Test
    public void in1to10_v02(){
        Solution solution = new Solution();
        assertFalse(solution.in1To10(11, false));
    }

    @Test
    public void in1to10_v03(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(11, true));
    }

    @Test
    public void in1to10_v04(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(10, false));
    }

    @Test
    public void in1to10_v05(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(10, true));
    }

    @Test
    public void in1to10_v06(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(9, false));
    }

    @Test
    public void in1to10_v07(){
        Solution solution = new Solution();
        assertFalse(solution.in1To10(9, true));
    }

    @Test
    public void in1to10_v08(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(1, false));
    }

    @Test
    public void in1to10_v09(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(1, true));
    }

    @Test
    public void in1to10_v10(){
        Solution solution = new Solution();
        assertFalse(solution.in1To10(0, false));
    }

    @Test
    public void in1to10_v11(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(0, true));
    }

    @Test
    public void in1to10_v12(){
        Solution solution = new Solution();
        assertFalse(solution.in1To10(-1, false));
    }

    @Test
    public void in1to10_v13(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(-1, true));
    }

    @Test
    public void in1to10_v14(){
        Solution solution = new Solution();
        assertFalse(solution.in1To10(99, false));
    }

    @Test
    public void in1to10_v15(){
        Solution solution = new Solution();
        assertTrue(solution.in1To10(-99, true));
    }
}
