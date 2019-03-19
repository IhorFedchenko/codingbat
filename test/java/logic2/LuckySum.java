package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LuckySum {

    @Test
    public void lucky_sum_v01(){
        Solution solution = new Solution();
        assertEquals(6, solution.luckySum(1,2,3));
    }

    @Test
    public void lucky_sum_v02(){
        Solution solution = new Solution();
        assertEquals(3, solution.luckySum(1,2,13));
    }

    @Test
    public void lucky_sum_v03(){
        Solution solution = new Solution();
        assertEquals(1, solution.luckySum(1,13,3));
    }

    @Test
    public void lucky_sum_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.luckySum(1,13,13));
    }

    @Test
    public void lucky_sum_v05(){
        Solution solution = new Solution();
        assertEquals(13, solution.luckySum(6,5,2));
    }

    @Test
    public void lucky_sum_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.luckySum(13,2,3));
    }

    @Test
    public void lucky_sum_v07(){
        Solution solution = new Solution();
        assertEquals(0, solution.luckySum(13,2,13));
    }

    @Test
    public void lucky_sum_v08(){
        Solution solution = new Solution();
        assertEquals(0, solution.luckySum(13,13,2));
    }

    @Test
    public void lucky_sum_v09(){
        Solution solution = new Solution();
        assertEquals(13, solution.luckySum(9,4,13));
    }

    @Test
    public void lucky_sum_v10(){
        Solution solution = new Solution();
        assertEquals(8, solution.luckySum(8,13,2));
    }

    @Test
    public void lucky_sum_v11(){
        Solution solution = new Solution();
        assertEquals(10, solution.luckySum(7,2,1));
    }

    @Test
    public void lucky_sum_v12(){
        Solution solution = new Solution();
        assertEquals(6, solution.luckySum(3,3,13));
    }
}
