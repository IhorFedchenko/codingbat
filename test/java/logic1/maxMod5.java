package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maxMod5 {

    @Test
    public void max_mod_5_v01(){
        Solution solution = new Solution();
        assertEquals(3, solution.maxMod5(2,3));
    }

    @Test
    public void max_mod_5_v02(){
        Solution solution = new Solution();
        assertEquals(6, solution.maxMod5(6,2));
    }

    @Test
    public void max_mod_5_v03(){
        Solution solution = new Solution();
        assertEquals(3, solution.maxMod5(3,2));
    }

    @Test
    public void max_mod_5_v04(){
        Solution solution = new Solution();
        assertEquals(12, solution.maxMod5(8,12));
    }

    @Test
    public void max_mod_5_v05(){
        Solution solution = new Solution();
        assertEquals(7, solution.maxMod5(7,12));
    }

    @Test
    public void max_mod_5_v06(){
        Solution solution = new Solution();
        assertEquals(6, solution.maxMod5(11,6));
    }

    @Test
    public void max_mod_5_v07(){
        Solution solution = new Solution();
        assertEquals(2, solution.maxMod5(2,7));
    }

    @Test
    public void max_mod_5_v08(){
        Solution solution = new Solution();
        assertEquals(0, solution.maxMod5(7,7));
    }

    @Test
    public void max_mod_5_v09(){
        Solution solution = new Solution();
        assertEquals(9, solution.maxMod5(9,1));
    }

    @Test
    public void max_mod_5_v10(){
        Solution solution = new Solution();
        assertEquals(9, solution.maxMod5(9,14));
    }

    @Test
    public void max_mod_5_v11(){
        Solution solution = new Solution();
        assertEquals(2, solution.maxMod5(1,2));
    }
}
