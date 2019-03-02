package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InOrder {

    @Test
    public void in_order_v01(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(1,2,4,true));
    }

    @Test
    public void in_order_v02(){
        Solution solution = new Solution();
        assertFalse(solution.inOrder(1,2,1,false));
    }

    @Test
    public void in_order_v03(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(1,1,2,true));
    }

    @Test
    public void in_order_v04(){
        Solution solution = new Solution();
        assertFalse(solution.inOrder(3,2,4,false));
    }

    @Test
    public void in_order_v05(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(2,3,4,false));
    }

    @Test
    public void in_order_v06(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(3,2,4,true));
    }

    @Test
    public void in_order_v07(){
        Solution solution = new Solution();
        assertFalse(solution.inOrder(4,2,2,true));
    }

    @Test
    public void in_order_v08(){
        Solution solution = new Solution();
        assertFalse(solution.inOrder(4,5,2,true));
    }

    @Test
    public void in_order_v09(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(2,4,6,true));
    }

    @Test
    public void in_order_v10(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(7,9,10,false));
    }

    @Test
    public void in_order_v11(){
        Solution solution = new Solution();
        assertTrue(solution.inOrder(7,5,6,true));
    }

    @Test
    public void in_order_v12(){
        Solution solution = new Solution();
        assertFalse(solution.inOrder(7,5,4,true));
    }
}
