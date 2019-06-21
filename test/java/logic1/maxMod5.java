package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maxMod5 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void max_mod_5_v01() {
        assertEquals(3, solution.maxMod5(2, 3));
    }

    @Test
    public void max_mod_5_v02() {
        assertEquals(6, solution.maxMod5(6, 2));
    }

    @Test
    public void max_mod_5_v03() {
        assertEquals(3, solution.maxMod5(3, 2));
    }

    @Test
    public void max_mod_5_v04() {
        assertEquals(12, solution.maxMod5(8, 12));
    }

    @Test
    public void max_mod_5_v05() {
        assertEquals(7, solution.maxMod5(7, 12));
    }

    @Test
    public void max_mod_5_v06() {
        assertEquals(6, solution.maxMod5(11, 6));
    }

    @Test
    public void max_mod_5_v07() {
        assertEquals(2, solution.maxMod5(2, 7));
    }

    @Test
    public void max_mod_5_v08() {
        assertEquals(0, solution.maxMod5(7, 7));
    }

    @Test
    public void max_mod_5_v09() {
        assertEquals(9, solution.maxMod5(9, 1));
    }

    @Test
    public void max_mod_5_v10() {
        assertEquals(9, solution.maxMod5(9, 14));
    }

    @Test
    public void max_mod_5_v11() {
        assertEquals(2, solution.maxMod5(1, 2));
    }
}
