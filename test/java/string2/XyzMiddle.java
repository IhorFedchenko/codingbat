package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyzMiddle {

    Solution solution = new Solution();

    @Test
    public void xyz_middle_v01(){
        assertTrue(solution.xyzMiddle("AAxyzBB"));
    }

    @Test
    public void xyz_middle_v02(){
        assertTrue(solution.xyzMiddle("AxyzBB"));
    }

    @Test
    public void xyz_middle_v03(){
        assertFalse(solution.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void xyz_middle_v04(){
        assertFalse(solution.xyzMiddle("AxyzBBBB"));
    }

    @Test
    public void xyz_middle_v05(){
        assertFalse(solution.xyzMiddle("AAAxyzB"));
    }

    @Test
    public void xyz_middle_v06(){
        assertTrue(solution.xyzMiddle("AAAxyzBB"));
    }

    @Test
    public void xyz_middle_v07(){
        assertFalse(solution.xyzMiddle("AAAAxyzBB"));
    }

    @Test
    public void xyz_middle_v08(){
        assertFalse(solution.xyzMiddle("AAAAAxyzBBB"));
    }

    @Test
    public void xyz_middle_v09(){
        assertTrue(solution.xyzMiddle("1x345xyz12x4"));
    }

    @Test
    public void xyz_middle_v10(){
        assertTrue(solution.xyzMiddle("xyzAxyzBBB"));
    }

    @Test
    public void xyz_middle_v11(){
        assertTrue(solution.xyzMiddle("xyzAxyzBxyz"));
    }

    @Test
    public void xyz_middle_v12(){
        assertTrue(solution.xyzMiddle("xyzxyzAxyzBxyzxyz"));
    }

    @Test
    public void xyz_middle_v13(){
        assertTrue(solution.xyzMiddle("xyzxyzxyzBxyzxyz"));
    }

    @Test
    public void xyz_middle_v14(){
        assertTrue(solution.xyzMiddle("xyzxyzAxyzxyzxyz"));
    }

    @Test
    public void xyz_middle_v15(){
        assertFalse(solution.xyzMiddle("xyzxyzAxyzxyzxy"));
    }

    @Test
    public void xyz_middle_v16(){
        assertFalse(solution.xyzMiddle("AxyzxyzBB"));
    }

    @Test
    public void xyz_middle_v17(){
        assertFalse(solution.xyzMiddle(""));
    }

    @Test
    public void xyz_middle_v18(){
        assertFalse(solution.xyzMiddle("x"));
    }

    @Test
    public void xyz_middle_v19(){
        assertFalse(solution.xyzMiddle("xy"));
    }

    @Test
    public void xyz_middle_v20(){
        assertTrue(solution.xyzMiddle("xyz"));
    }

    @Test
    public void xyz_middle_v21(){
        assertTrue(solution.xyzMiddle("xyzz"));
    }
}
