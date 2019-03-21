package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundSum {

    @Test
    public void round_sum_v01(){
        Solution solution = new Solution();
        assertEquals(60, solution.roundSum(16,17,18));
    }

    @Test
    public void round_sum_v02(){
        Solution solution = new Solution();
        assertEquals(30, solution.roundSum(12,13,14));
    }

    @Test
    public void round_sum_v03(){
        Solution solution = new Solution();
        assertEquals(10, solution.roundSum(6,4,4));
    }

    @Test
    public void round_sum_v04(){
        Solution solution = new Solution();
        assertEquals(20, solution.roundSum(4,6,5));
    }

    @Test
    public void round_sum_v05(){
        Solution solution = new Solution();
        assertEquals(10, solution.roundSum(4,4,6));
    }

    @Test
    public void round_sum_v06(){
        Solution solution = new Solution();
        assertEquals(10, solution.roundSum(9,4,4));
    }

    @Test
    public void round_sum_v07(){
        Solution solution = new Solution();
        assertEquals(0, solution.roundSum(0,0,1));
    }

    @Test
    public void round_sum_v08(){
        Solution solution = new Solution();
        assertEquals(10, solution.roundSum(0,9,0));
    }

    @Test
    public void round_sum_v09(){
        Solution solution = new Solution();
        assertEquals(40, solution.roundSum(10,10,19));
    }

    @Test
    public void round_sum_v10(){
        Solution solution = new Solution();
        assertEquals(90, solution.roundSum(20,30,40));
    }

    @Test
    public void round_sum_v11(){
        Solution solution = new Solution();
        assertEquals(100, solution.roundSum(45,21,30));
    }

    @Test
    public void round_sum_v12(){
        Solution solution = new Solution();
        assertEquals(60, solution.roundSum(23, 11, 26));
    }

    @Test
    public void round_sum_v13(){
        Solution solution = new Solution();
        assertEquals(70, solution.roundSum(23, 24, 25));
    }

    @Test
    public void round_sum_v14(){
        Solution solution = new Solution();
        assertEquals(80, solution.roundSum(25, 24, 25));
    }

    @Test
    public void round_sum_v15(){
        Solution solution = new Solution();
        assertEquals(70, solution.roundSum(23, 24, 29));
    }

    @Test
    public void round_sum_v16(){
        Solution solution = new Solution();
        assertEquals(70, solution.roundSum(11, 24, 36));
    }

    @Test
    public void round_sum_v17(){
        Solution solution = new Solution();
        assertEquals(90, solution.roundSum(24, 36, 32));
    }

    @Test
    public void round_sum_v18(){
        Solution solution = new Solution();
        assertEquals(50, solution.roundSum(14, 12, 26));
    }

    @Test
    public void round_sum_v19(){
        Solution solution = new Solution();
        assertEquals(40, solution.roundSum(12, 10, 24));
    }
}
