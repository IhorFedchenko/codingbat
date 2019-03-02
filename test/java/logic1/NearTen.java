package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NearTen {

    @Test
    public void near_ten_12(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(12));
    }

    @Test
    public void near_ten_17(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(17));
    }

    @Test
    public void near_ten_19(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(19));
    }

    @Test
    public void near_ten_31(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(31));
    }

    @Test
    public void near_ten_6(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(6));
    }

    @Test
    public void near_ten_10(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(10));
    }

    @Test
    public void near_ten_11(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(11));
    }

    @Test
    public void near_ten_21(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(21));
    }

    @Test
    public void near_ten_22(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(22));
    }

    @Test
    public void near_ten_23(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(23));
    }

    @Test
    public void near_ten_54(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(54));
    }

    @Test
    public void near_ten_155(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(155));
    }

    @Test
    public void near_ten_158(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(158));
    }

    @Test
    public void near_ten_3(){
        Solution solution = new Solution();
        assertFalse(solution.nearTen(3));
    }
    @Test
    public void near_ten_1(){
        Solution solution = new Solution();
        assertTrue(solution.nearTen(1));
    }

}
