package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SpecialEleven {

    @Test
    public void specialEleven_22(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(22));
    }

    @Test
    public void specialEleven_23(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(23));
    }

    @Test
    public void specialEleven_24(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(24));
    }

    @Test
    public void specialEleven_21(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(21));
    }

    @Test
    public void specialEleven_11(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(11));
    }

    @Test
    public void specialEleven_12(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(12));
    }

    @Test
    public void specialEleven_10(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(10));
    }

    @Test
    public void specialEleven_9(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(9));
    }

    @Test
    public void specialEleven_8(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(8));
    }

    @Test
    public void specialEleven_0(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(0));
    }

    @Test
    public void specialEleven_1(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(1));
    }

    @Test
    public void specialEleven_2(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(2));
    }

    @Test
    public void specialEleven_121(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(121));
    }

    @Test
    public void specialEleven_122(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(122));
    }

    @Test
    public void specialEleven_123(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(123));
    }

    @Test
    public void specialEleven_46(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(46));
    }

    @Test
    public void specialEleven_49(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(49));
    }

    @Test
    public void specialEleven_52(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(52));
    }

    @Test
    public void specialEleven_54(){
        Solution solution = new Solution();
        assertFalse(solution.specialEleven(54));
    }

    @Test
    public void specialEleven_55(){
        Solution solution = new Solution();
        assertTrue(solution.specialEleven(55));
    }
}
