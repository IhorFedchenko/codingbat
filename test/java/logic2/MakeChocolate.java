package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MakeChocolate {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_chocolate_v01() {
        assertEquals(4, solution.makeChocolate(4, 1, 9));
    }

    @Test
    public void make_chocolate_v02() {
        assertEquals(-1, solution.makeChocolate(4, 1, 10));
    }

    @Test
    public void make_chocolate_v03() {
        assertEquals(2, solution.makeChocolate(4, 1, 7));
    }

    @Test
    public void make_chocolate_v04() {
        assertEquals(2, solution.makeChocolate(6, 2, 7));
    }

    @Test
    public void make_chocolate_v05() {
        assertEquals(0, solution.makeChocolate(4, 1, 5));
    }

    @Test
    public void make_chocolate_v06() {
        assertEquals(4, solution.makeChocolate(4, 1, 4));
    }

    @Test
    public void make_chocolate_v07() {
        assertEquals(4, solution.makeChocolate(5, 4, 9));
    }

    @Test
    public void make_chocolate_v08() {
        assertEquals(3, solution.makeChocolate(9, 3, 18));
    }

    @Test
    public void make_chocolate_v09() {
        assertEquals(-1, solution.makeChocolate(3, 1, 9));
    }

    @Test
    public void make_chocolate_v10() {
        assertEquals(-1, solution.makeChocolate(1, 2, 7));
    }

    @Test
    public void make_chocolate_v11() {
        assertEquals(1, solution.makeChocolate(1, 2, 6));
    }

    @Test
    public void make_chocolate_v12() {
        assertEquals(0, solution.makeChocolate(1, 2, 5));
    }

    @Test
    public void make_chocolate_v13() {
        assertEquals(5, solution.makeChocolate(6, 1, 10));
    }

    @Test
    public void make_chocolate_v14() {
        assertEquals(6, solution.makeChocolate(6, 1, 11));
    }

    @Test
    public void make_chocolate_v15() {
        assertEquals(-1, solution.makeChocolate(6, 1, 12));
    }

    @Test
    public void make_chocolate_v16() {
        assertEquals(-1, solution.makeChocolate(6, 1, 13));
    }

    @Test
    public void make_chocolate_v17() {
        assertEquals(0, solution.makeChocolate(6, 2, 10));
    }

    @Test
    public void make_chocolate_v18() {
        assertEquals(1, solution.makeChocolate(6, 2, 11));
    }

    @Test
    public void make_chocolate_v19() {
        assertEquals(2, solution.makeChocolate(6, 2, 12));
    }

    @Test
    public void make_chocolate_v20() {
        assertEquals(50, solution.makeChocolate(60, 100, 550));
    }

    @Test
    public void make_chocolate_v21() {
        assertEquals(6, solution.makeChocolate(1000, 1000000, 5000006));
    }

    @Test
    public void make_chocolate_v22() {
        assertEquals(7, solution.makeChocolate(7, 1, 12));
    }

    @Test
    public void make_chocolate_v23() {
        assertEquals(-1, solution.makeChocolate(7, 1, 13));
    }

    @Test
    public void make_chocolate_v24() {
        assertEquals(3, solution.makeChocolate(7, 2, 13));
    }
}
