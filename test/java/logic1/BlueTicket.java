package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlueTicket {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void blue_ticket_v01() {
        assertEquals(10, solution.blueTicket(9, 1, 0));
    }

    @Test
    public void blue_ticket_v02() {
        assertEquals(0, solution.blueTicket(9, 2, 0));
    }

    @Test
    public void blue_ticket_v03() {
        assertEquals(10, solution.blueTicket(6, 1, 4));
    }

    @Test
    public void blue_ticket_v04() {
        assertEquals(0, solution.blueTicket(6, 1, 5));
    }

    @Test
    public void blue_ticket_v05() {
        assertEquals(10, solution.blueTicket(10, 0, 0));
    }

    @Test
    public void blue_ticket_v06() {
        assertEquals(5, solution.blueTicket(15, 0, 5));
    }

    @Test
    public void blue_ticket_v07() {
        assertEquals(10, solution.blueTicket(5, 15, 5));
    }

    @Test
    public void blue_ticket_v08() {
        assertEquals(5, solution.blueTicket(4, 11, 1));
    }

    @Test
    public void blue_ticket_v09() {
        assertEquals(5, solution.blueTicket(13, 2, 3));
    }

    @Test
    public void blue_ticket_v10() {
        assertEquals(0, solution.blueTicket(8, 4, 3));
    }

    @Test
    public void blue_ticket_v11() {
        assertEquals(10, solution.blueTicket(8, 4, 2));
    }

    @Test
    public void blue_ticket_v12() {
        assertEquals(0, solution.blueTicket(8, 4, 1));
    }
}
