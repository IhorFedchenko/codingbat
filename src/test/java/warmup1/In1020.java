package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In1020 {

    @Test
    public void in1020_case01(){
        Solution solution = new Solution();
        assertTrue(solution.in1020(12,99));
    }

    @Test
    public void in1020_case02(){
        Solution solution = new Solution();
        assertTrue(solution.in1020(21,12));
    }

    @Test
    public void in1020_case03(){
        Solution solution = new Solution();
        assertFalse(solution.in1020(8,99));
    }

    @Test
    public void in1020_case04(){
        Solution solution = new Solution();
        assertTrue(solution.in1020(99,10));
    }

    @Test
    public void in1020_case05(){
        Solution solution = new Solution();
        assertTrue(solution.in1020(20,20));
    }

    @Test
    public void in1020_case06(){
        Solution solution = new Solution();
        assertFalse(solution.in1020(21,21));
    }

    @Test
    public void in1020_case07(){
        Solution solution = new Solution();
        assertFalse(solution.in1020(9,9));
    }
}
