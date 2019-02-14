package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Old35 {

    @Test
    public void old35_3(){
        Solution solution = new Solution();
        assertTrue(solution.old35(3));
    }

    @Test
    public void old35_10(){
        Solution solution = new Solution();
        assertTrue(solution.old35(10));
    }

    @Test
    public void old35_15(){
        Solution solution = new Solution();
        assertFalse(solution.old35(15));
    }

    @Test
    public void old35_5(){
        Solution solution = new Solution();
        assertTrue(solution.old35(5));
    }

    @Test
    public void old35_9(){
        Solution solution = new Solution();
        assertTrue(solution.old35(9));
    }

    @Test
    public void old35_8(){
        Solution solution = new Solution();
        assertFalse(solution.old35(8));
    }

    @Test
    public void old35_7(){
        Solution solution = new Solution();
        assertFalse(solution.old35(7));
    }

    @Test
    public void old35_6(){
        Solution solution = new Solution();
        assertTrue(solution.old35(6));
    }

    @Test
    public void old35_17(){
        Solution solution = new Solution();
        assertFalse(solution.old35(17));
    }

    @Test
    public void old35_18(){
        Solution solution = new Solution();
        assertTrue(solution.old35(18));
    }

    @Test
    public void old35_29(){
        Solution solution = new Solution();
        assertFalse(solution.old35(29));
    }

    @Test
    public void old35_20(){
        Solution solution = new Solution();
        assertTrue(solution.old35(20));
    }

    @Test
    public void old35_21(){
        Solution solution = new Solution();
        assertTrue(solution.old35(21));
    }

    @Test
    public void old35_22(){
        Solution solution = new Solution();
        assertFalse(solution.old35(22));
    }

    @Test
    public void old35_45(){
        Solution solution = new Solution();
        assertFalse(solution.old35(45));
    }

    @Test
    public void old35_99(){
        Solution solution = new Solution();
        assertTrue(solution.old35(99));
    }
}
