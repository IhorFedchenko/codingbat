package logic2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenlySpaced {

    @Test
    public void evenly_spaced_v01(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(2, 4,6));
    }

    @Test
    public void evenly_spaced_v02(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(4, 6,2));
    }

    @Test
    public void evenly_spaced_v03(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(4, 6,3));
    }

    @Test
    public void evenly_spaced_v04(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(6, 2,4));
    }

    @Test
    public void evenly_spaced_v05(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(6, 2,8));
    }

    @Test
    public void evenly_spaced_v06(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(2, 2,2));
    }

    @Test
    public void evenly_spaced_v07(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(2, 2,3));
    }

    @Test
    public void evenly_spaced_v08(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(9, 10,11));
    }

    @Test
    public void evenly_spaced_v09(){
        Solution solution = new Solution();
        assertTrue(solution.evenlySpaced(10, 9,11));
    }

    @Test
    public void evenly_spaced_v10(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(10, 9,9));
    }

    @Test
    public void evenly_spaced_v11(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(2, 4,4));
    }

    @Test
    public void evenly_spaced_v12(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(2, 2,4));
    }

    @Test
    public void evenly_spaced_v13(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(3, 6,12));
    }

    @Test
    public void evenly_spaced_v14(){
        Solution solution = new Solution();
        assertFalse(solution.evenlySpaced(12, 3,6));
    }
}
