package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Start1 {

    @Test
    public void start1_v01(){
        Solution solution = new Solution();
        assertEquals(2, solution.start1(new int[]{1,2,3}, new int[]{1,3}));
    }

    @Test
    public void start1_v02(){
        Solution solution = new Solution();
        assertEquals(1, solution.start1(new int[]{7,2,3}, new int[]{1}));
    }

    @Test
    public void start1_v03(){
        Solution solution = new Solution();
        assertEquals(1, solution.start1(new int[]{1,2}, new int[]{}));
    }

    @Test
    public void start1_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.start1(new int[]{}, new int[]{1,2}));
    }

    @Test
    public void start1_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.start1(new int[]{7}, new int[]{}));
    }

    @Test
    public void start1_v06(){
        Solution solution = new Solution();
        assertEquals(1, solution.start1(new int[]{7}, new int[]{1}));
    }

    @Test
    public void start1_v07(){
        Solution solution = new Solution();
        assertEquals(2, solution.start1(new int[]{1}, new int[]{1}));
    }

    @Test
    public void start1_v08(){
        Solution solution = new Solution();
        assertEquals(0, solution.start1(new int[]{7}, new int[]{8}));
    }

    @Test
    public void start1_v09(){
        Solution solution = new Solution();
        assertEquals(0, solution.start1(new int[]{}, new int[]{}));
    }

    @Test
    public void start1_v10(){
        Solution solution = new Solution();
        assertEquals(2, solution.start1(new int[]{1,3}, new int[]{1}));
    }
}
