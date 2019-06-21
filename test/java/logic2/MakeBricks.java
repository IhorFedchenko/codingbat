package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MakeBricks {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_bricks_v01() {
        assertTrue(solution.makeBricks(3, 1, 8));
    }

    @Test
    public void make_bricks_v02() {
        assertFalse(solution.makeBricks(3, 1, 9));
    }

    @Test
    public void make_bricks_v03() {
        assertTrue(solution.makeBricks(3, 2, 10));
    }

    @Test
    public void make_bricks_v04() {
        assertTrue(solution.makeBricks(3, 2, 8));
    }

    @Test
    public void make_bricks_v05() {
        assertFalse(solution.makeBricks(3, 2, 9));
    }

    @Test
    public void make_bricks_v06() {
        assertTrue(solution.makeBricks(6, 1, 11));
    }

    @Test
    public void make_bricks_v07() {
        assertFalse(solution.makeBricks(6, 0, 11));
    }

    @Test
    public void make_bricks_v08() {
        assertTrue(solution.makeBricks(1, 4, 11));
    }

    @Test
    public void make_bricks_v09() {
        assertTrue(solution.makeBricks(0, 3, 10));
    }

    @Test
    public void make_bricks_v10() {
        assertFalse(solution.makeBricks(1, 4, 12));
    }

    @Test
    public void make_bricks_v11() {
        assertTrue(solution.makeBricks(3, 1, 7));
    }

    @Test
    public void make_bricks_v12() {
        assertFalse(solution.makeBricks(1, 1, 7));
    }

    @Test
    public void make_bricks_v13() {
        assertTrue(solution.makeBricks(2, 1, 7));
    }

    @Test
    public void make_bricks_v14() {
        assertTrue(solution.makeBricks(7, 1, 11));
    }

    @Test
    public void make_bricks_v15() {
        assertTrue(solution.makeBricks(7, 1, 8));
    }

    @Test
    public void make_bricks_v16() {
        assertTrue(solution.makeBricks(43, 1, 46));
    }

    @Test
    public void make_bricks_v17() {
        assertFalse(solution.makeBricks(40, 1, 46));
    }

    @Test
    public void make_bricks_v18() {
        assertTrue(solution.makeBricks(40, 2, 47));
    }

    @Test
    public void make_bricks_v19() {
        assertTrue(solution.makeBricks(40, 2, 50));
    }

    @Test
    public void make_bricks_v20() {
        assertTrue(solution.makeBricks(40, 2, 50));
    }

    @Test
    public void make_bricks_v21() {
        assertFalse(solution.makeBricks(40, 2, 52));
    }

    @Test
    public void make_bricks_v22() {
        assertFalse(solution.makeBricks(22, 2, 33));
    }

    @Test
    public void make_bricks_v23() {
        assertTrue(solution.makeBricks(0, 2, 10));
    }

    @Test
    public void make_bricks_v24() {
        assertTrue(solution.makeBricks(1000000, 1000, 1000100));
    }

    @Test
    public void make_bricks_v25() {
        assertFalse(solution.makeBricks(2, 1000000, 100003));
    }

    @Test
    public void make_bricks_v26() {
        assertTrue(solution.makeBricks(20, 0, 19));
    }

    @Test
    public void make_bricks_v27() {
        assertFalse(solution.makeBricks(20, 0, 21));
    }

    @Test
    public void make_bricks_v28() {
        assertTrue(solution.makeBricks(3, 1, 8));
    }
}
