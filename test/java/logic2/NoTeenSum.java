package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoTeenSum {

    @Test
    public void no_teen_sum_v01(){
        Solution solution = new Solution();
        assertEquals(6, solution.noTeenSum(1,2,3));
    }

    @Test
    public void no_teen_sum_v02(){
        Solution solution = new Solution();
        assertEquals(3, solution.noTeenSum(2,13,1));
    }

    @Test
    public void no_teen_sum_v03(){
        Solution solution = new Solution();
        assertEquals(3, solution.noTeenSum(2,1,14));
    }

    @Test
    public void no_teen_sum_v04(){
        Solution solution = new Solution();
        assertEquals(18, solution.noTeenSum(2,1,15));
    }

    @Test
    public void no_teen_sum_v05(){
        Solution solution = new Solution();
        assertEquals(19, solution.noTeenSum(2,1,16));
    }

    @Test
    public void no_teen_sum_v06(){
        Solution solution = new Solution();
        assertEquals(3, solution.noTeenSum(2,1,17));
    }

    @Test
    public void no_teen_sum_v07(){
        Solution solution = new Solution();
        assertEquals(3, solution.noTeenSum(17,1,2));
    }

    @Test
    public void no_teen_sum_v08(){
        Solution solution = new Solution();
        assertEquals(19, solution.noTeenSum(2,15,2));
    }

    @Test
    public void no_teen_sum_v09(){
        Solution solution = new Solution();
        assertEquals(16, solution.noTeenSum(16, 17, 18));
    }

    @Test
    public void no_teen_sum_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.noTeenSum(17,18,19));
    }

    @Test
    public void no_teen_sum_v11(){
        Solution solution = new Solution();
        assertEquals(32, solution.noTeenSum(15,16,1));
    }

    @Test
    public void no_teen_sum_v12(){
        Solution solution = new Solution();
        assertEquals(30, solution.noTeenSum(15,15,19));
    }

    @Test
    public void no_teen_sum_v13(){
        Solution solution = new Solution();
        assertEquals(31, solution.noTeenSum(15,19,16));
    }

    @Test
    public void no_teen_sum_v14(){
        Solution solution = new Solution();
        assertEquals(5, solution.noTeenSum(5,17,18));
    }

    @Test
    public void no_teen_sum_v15(){
        Solution solution = new Solution();
        assertEquals(16, solution.noTeenSum(17,18,16));
    }

    @Test
    public void no_teen_sum_v16(){
        Solution solution = new Solution();
        assertEquals(0, solution.noTeenSum(17,19,18));
    }
}
