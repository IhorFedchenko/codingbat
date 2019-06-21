package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreenTicket {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void green_ticket_v01() {
        assertEquals(0, solution.greenTicket(1, 2, 3));
    }

    @Test
    public void green_ticket_v02() {
        assertEquals(20, solution.greenTicket(2, 2, 2));
    }

    @Test
    public void green_ticket_v03() {
        assertEquals(10, solution.greenTicket(1, 1, 2));
    }

    @Test
    public void green_ticket_v04() {
        assertEquals(10, solution.greenTicket(2, 1, 1));
    }

    @Test
    public void green_ticket_v05() {
        assertEquals(10, solution.greenTicket(1, 2, 1));
    }

    @Test
    public void green_ticket_v06() {
        assertEquals(0, solution.greenTicket(3, 2, 1));
    }

    @Test
    public void green_ticket_v07() {
        assertEquals(20, solution.greenTicket(0, 0, 0));
    }

    @Test
    public void green_ticket_v08() {
        assertEquals(10, solution.greenTicket(2, 0, 0));
    }

    @Test
    public void green_ticket_v09() {
        assertEquals(0, solution.greenTicket(0, 9, 10));
    }

    @Test
    public void green_ticket_v10() {
        assertEquals(10, solution.greenTicket(0, 10, 0));
    }

    @Test
    public void green_ticket_v11() {
        assertEquals(20, solution.greenTicket(9, 9, 9));
    }

    @Test
    public void green_ticket_v12() {
        assertEquals(10, solution.greenTicket(9, 0, 9));
    }
}
