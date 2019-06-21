package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyzThere {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void xyz_there_v01() {
        assertTrue(solution.xyzThere("abcxyz"));
    }

    @Test
    public void xyz_there_v02() {
        assertFalse(solution.xyzThere("abc.xyz"));
    }

    @Test
    public void xyz_there_v03() {
        assertTrue(solution.xyzThere("xyz.abc"));
    }

    @Test
    public void xyz_there_v04() {
        assertFalse(solution.xyzThere("abcxy"));
    }

    @Test
    public void xyz_there_v05() {
        assertTrue(solution.xyzThere("xyz"));
    }

    @Test
    public void xyz_there_v06() {
        assertFalse(solution.xyzThere("xy"));
    }

    @Test
    public void xyz_there_v07() {
        assertFalse(solution.xyzThere("x"));
    }

    @Test
    public void xyz_there_v08() {
        assertFalse(solution.xyzThere(""));
    }

    @Test
    public void xyz_there_v09() {
        assertTrue(solution.xyzThere("abc.xyzxyz"));
    }

    @Test
    public void xyz_there_v10() {
        assertTrue(solution.xyzThere("abc.xxyz"));
    }

    @Test
    public void xyz_there_v11() {
        assertFalse(solution.xyzThere(".xyz"));
    }

    @Test
    public void xyz_there_v12() {
        assertFalse(solution.xyzThere("12.xyz"));
    }

    @Test
    public void xyz_there_v13() {
        assertTrue(solution.xyzThere("12xyz"));
    }

    @Test
    public void xyz_there_v14() {
        assertFalse(solution.xyzThere("1.xyz.xyz2.xyz"));
    }
}
