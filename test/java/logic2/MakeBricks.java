package logic2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MakeBricks {

    @Test
    public void make_bricks_v01(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(3,1,8));
    }

    @Test
    public void make_bricks_v02(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(3,1,9));
    }

    @Test
    public void make_bricks_v03(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(3,2,10));
    }

    @Test
    public void make_bricks_v04(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(3,2,8));
    }

    @Test
    public void make_bricks_v05(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(3,2,9));
    }

    @Test
    public void make_bricks_v06(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(6,1,11));
    }

    @Test
    public void make_bricks_v07(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(6,0,11));
    }

    @Test
    public void make_bricks_v08(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(1,4,11));
    }

    @Test
    public void make_bricks_v09(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(0,3,10));
    }

    @Test
    public void make_bricks_v10(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(1,4,12));
    }

    @Test
    public void make_bricks_v11(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(3,1,7));
    }

    @Test
    public void make_bricks_v12(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(1,1,7));
    }

    @Test
    public void make_bricks_v13(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(2,1,7));
    }

    @Test
    public void make_bricks_v14(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(7,1,11));
    }

    @Test
    public void make_bricks_v15(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(7,1,8));
    }

    @Test
    public void make_bricks_v16(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(43,1,46));
    }

    @Test
    public void make_bricks_v17(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(40,1,46));
    }

    @Test
    public void make_bricks_v18(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(40,2,47));
    }

    @Test
    public void make_bricks_v19(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(40,2,50));
    }

    @Test
    public void make_bricks_v20(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(40,2,50));
    }

    @Test
    public void make_bricks_v21(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(40,2,52));
    }

    @Test
    public void make_bricks_v22(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(22,2,33));
    }

    @Test
    public void make_bricks_v23(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(0,2,10));
    }

    @Test
    public void make_bricks_v24(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(1000000, 1000, 1000100));
    }

    @Test
    public void make_bricks_v25(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(2, 1000000, 100003));
    }

    @Test
    public void make_bricks_v26(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(20, 0, 19));
    }

    @Test
    public void make_bricks_v27(){
        Solution solution = new Solution();
        assertFalse(solution.makeBricks(20, 0, 21));
    }

    @Test
    public void make_bricks_v28(){
        Solution solution = new Solution();
        assertTrue(solution.makeBricks(3,1,8));
    }
}
