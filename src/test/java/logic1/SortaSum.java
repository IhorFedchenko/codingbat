package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortaSum {

    @Test
    public void sorta_sum_v01(){
        Solution solution = new Solution();
        assertEquals(7, solution.sortaSum(3,4));
    }

    @Test
    public void sorta_sum_v02(){
        Solution solution = new Solution();
        assertEquals(20, solution.sortaSum(9,4));
    }

    @Test
    public void sorta_sum_v03(){
        Solution solution = new Solution();
        assertEquals(21, solution.sortaSum(10,11));
    }

    @Test
    public void sorta_sum_v04(){
        Solution solution = new Solution();
        assertEquals(9, solution.sortaSum(12,-3));
    }

    @Test
    public void sorta_sum_v05(){
        Solution solution = new Solution();
        assertEquals(9, solution.sortaSum(-3,12));
    }

    @Test
    public void sorta_sum_v06(){
        Solution solution = new Solution();
        assertEquals(9, solution.sortaSum(4,5));
    }

    @Test
    public void sorta_sum_v07(){
        Solution solution = new Solution();
        assertEquals(20, solution.sortaSum(4,6));
    }

    @Test
    public void sorta_sum_v08(){
        Solution solution = new Solution();
        assertEquals(21, solution.sortaSum(14,7));
    }

    @Test
    public void sorta_sum_v09(){
        Solution solution = new Solution();
        assertEquals(20, solution.sortaSum(14,6));
    }
}
