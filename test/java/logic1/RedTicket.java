package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedTicket {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void red_tichet_v01() {
        assertEquals(10, solution.redTicket(2, 2, 2));
    }

    @Test
    public void red_tichet_v02() {
        assertEquals(0, solution.redTicket(2, 2, 1));
    }

    @Test
    public void red_tichet_v03() {
        assertEquals(5, solution.redTicket(0, 0, 0));
    }

    @Test
    public void red_tichet_v04() {
        assertEquals(1, solution.redTicket(2, 0, 0));
    }

    @Test
    public void red_tichet_v05() {
        assertEquals(5, solution.redTicket(1, 1, 1));
    }

    @Test
    public void red_tichet_v06() {
        assertEquals(0, solution.redTicket(1, 2, 1));
    }

    @Test
    public void red_tichet_v07() {
        assertEquals(1, solution.redTicket(1, 2, 0));
    }

    @Test
    public void red_tichet_v08() {
        assertEquals(1, solution.redTicket(0, 2, 2));
    }

    @Test
    public void red_tichet_v09() {
        assertEquals(1, solution.redTicket(1, 2, 2));
    }

    @Test
    public void red_tichet_v10() {
        assertEquals(0, solution.redTicket(0, 2, 0));
    }

    @Test
    public void red_tichet_v11() {
        assertEquals(0, solution.redTicket(1, 1, 2));
    }
}
