package logic2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CloseFar {

    @Test
    public void close_far_v01(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(1,2,10));
    }

    @Test
    public void close_far_v02(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(1,2,3));
    }

    @Test
    public void close_far_v03(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(4,1,3));
    }

    @Test
    public void close_far_v04(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(4,5,3));
    }

    @Test
    public void close_far_v05(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(4,3,5));
    }

    @Test
    public void close_far_v06(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(-1,10,0));
    }

    @Test
    public void close_far_v07(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(0,-1,10));
    }

    @Test
    public void close_far_v08(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(10,10,8));
    }

    @Test
    public void close_far_v09(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(10,8,9));
    }

    @Test
    public void close_far_v10(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(8,9,10));
    }

    @Test
    public void close_far_v11(){
        Solution solution = new Solution();
        assertFalse(solution.closeFar(8,9,7));
    }

    @Test
    public void close_far_v12(){
        Solution solution = new Solution();
        assertTrue(solution.closeFar(8,6,9));
    }
}
