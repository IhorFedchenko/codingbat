package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Has271 {

    @Test
    public void has_271_v01(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{1,2,7,1}));
    }

    @Test
    public void has_271_v02(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{1,2,8,1}));
    }

    @Test
    public void has_271_v03(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{2,7,1}));
    }

    @Test
    public void has_271_v04(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{3,8,2}));
    }

    @Test
    public void has_271_v05(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{2,7,3}));
    }

    @Test
    public void has_271_v06(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{2,7,4}));
    }

    @Test
    public void has_271_v07(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{2,7,-1}));
    }

    @Test
    public void has_271_v08(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{2,7,-2}));
    }

    @Test
    public void has_271_v09(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{4,5,3,8,0}));
    }

    @Test
    public void has_271_v10(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{2,7,5,10,4}));
    }

    @Test
    public void has_271_v11(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{2,7,-2,4,9,3}));
    }

    @Test
    public void has_271_v12(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{2,7,5,10,1}));
    }

    @Test
    public void has_271_v13(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{2,7,-2,4,10,2}));
    }

    @Test
    public void has_271_v14(){
        Solution solution = new Solution();
        assertFalse(solution.has271(new int[]{1,1,4,9,0}));
    }

    @Test
    public void has_271_v15(){
        Solution solution = new Solution();
        assertTrue(solution.has271(new int[]{1,1,4,9,4,9,2}));
    }
}
