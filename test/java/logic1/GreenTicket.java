package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreenTicket {

    @Test
    public void green_ticket_v01(){
        Solution solution = new Solution();
        assertEquals(0, solution.greenTicket(1,2,3));
    }

    @Test
    public void green_ticket_v02(){
        Solution solution = new Solution();
        assertEquals(20, solution.greenTicket(2,2,2));
    }

    @Test
    public void green_ticket_v03(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(1,1,2));
    }

    @Test
    public void green_ticket_v04(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(2,1,1));
    }

    @Test
    public void green_ticket_v05(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(1,2,1));
    }

    @Test
    public void green_ticket_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.greenTicket(3,2,1));
    }

    @Test
    public void green_ticket_v07(){
        Solution solution = new Solution();
        assertEquals(20, solution.greenTicket(0,0,0));
    }

    @Test
    public void green_ticket_v08(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(2,0,0));
    }

    @Test
    public void green_ticket_v09(){
        Solution solution = new Solution();
        assertEquals(0, solution.greenTicket(0,9,10));
    }

    @Test
    public void green_ticket_v10(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(0,10,0));
    }

    @Test
    public void green_ticket_v11(){
        Solution solution = new Solution();
        assertEquals(20, solution.greenTicket(9,9,9));
    }

    @Test
    public void green_ticket_v12(){
        Solution solution = new Solution();
        assertEquals(10, solution.greenTicket(9,0,9));
    }
}
