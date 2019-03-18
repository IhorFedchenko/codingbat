package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoneSum {

    @Test
    public void lone_sum_v01(){
        Solution solution = new Solution();
        assertEquals(6, solution.loneSum(1,2,3));
    }

    @Test
    public void lone_sum_v02(){
        Solution solution = new Solution();
        assertEquals(2, solution.loneSum(3,2,3));
    }

    @Test
    public void lone_sum_v03(){
        Solution solution = new Solution();
        assertEquals(0, solution.loneSum(3,3,3));
    }

    @Test
    public void lone_sum_v04(){
        Solution solution = new Solution();
        assertEquals(9, solution.loneSum(9,2,2));
    }

    @Test
    public void lone_sum_v05(){
        Solution solution = new Solution();
        assertEquals(9, solution.loneSum(2,2,9));
    }

    @Test
    public void lone_sum_v06(){
        Solution solution = new Solution();
        assertEquals(9, solution.loneSum(2,9,2));
    }

    @Test
    public void lone_sum_v07(){
        Solution solution = new Solution();
        assertEquals(14, solution.loneSum(2,9,3));
    }

    @Test
    public void lone_sum_v08(){
        Solution solution = new Solution();
        assertEquals(9, solution.loneSum(4,2,3));
    }

    @Test
    public void lone_sum_v09(){
        Solution solution = new Solution();
        assertEquals(3, solution.loneSum(1,3,1));
    }
}
