package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyzThere {

    @Test
    public void xyz_there_v01(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("abcxyz"));
    }

    @Test
    public void xyz_there_v02(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("abc.xyz"));
    }

    @Test
    public void xyz_there_v03(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("xyz.abc"));
    }

    @Test
    public void xyz_there_v04(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("abcxy"));
    }

    @Test
    public void xyz_there_v05(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("xyz"));
    }

    @Test
    public void xyz_there_v06(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("xy"));
    }

    @Test
    public void xyz_there_v07(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("x"));
    }

    @Test
    public void xyz_there_v08(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere(""));
    }

    @Test
    public void xyz_there_v09(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("abc.xyzxyz"));
    }

    @Test
    public void xyz_there_v10(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("abc.xxyz"));
    }

    @Test
    public void xyz_there_v11(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere(".xyz"));
    }

    @Test
    public void xyz_there_v12(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("12.xyz"));
    }

    @Test
    public void xyz_there_v13(){
        Solution solution = new Solution();
        assertTrue(solution.xyzThere("12xyz"));
    }

    @Test
    public void xyz_there_v14(){
        Solution solution = new Solution();
        assertFalse(solution.xyzThere("1.xyz.xyz2.xyz"));
    }
}
