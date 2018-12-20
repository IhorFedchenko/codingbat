package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoubleX {

    @Test
    public void double_x_axxbb(){
        Solution solution = new Solution();
        assertTrue(solution.doubleX("axxbb"));
    }

    @Test
    public void double_x_axaxax(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("axaxax"));
    }

    @Test
    public void double_x_xxxxx(){
        Solution solution = new Solution();
        assertTrue(solution.doubleX("xxxxx"));
    }

    @Test
    public void double_x_xaxxx(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("xaxxx"));
    }

    @Test
    public void double_x_aaaax(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("aaaax"));
    }

    @Test
    public void double_x__(){
        Solution solution = new Solution();
        assertTrue(solution.doubleX("axxbb"));
    }

    @Test
    public void double_x_abc(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("abc"));
    }

    @Test
    public void double_x(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("x"));
    }

    @Test
    public void double_x_xx(){
        Solution solution = new Solution();
        assertTrue(solution.doubleX("xx"));
    }

    @Test
    public void double_x_xax(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("xax"));
    }

    @Test
    public void double_x_xaxx(){
        Solution solution = new Solution();
        assertFalse(solution.doubleX("xaxx"));
    }
}
