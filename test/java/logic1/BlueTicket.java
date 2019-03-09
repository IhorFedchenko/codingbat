package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlueTicket {

    @Test
    public void blue_ticket_v01(){
        Solution solution = new Solution();
        assertEquals(10, solution.blueTicket(9,1,0));
    }

    @Test
    public void blue_ticket_v02(){
        Solution solution = new Solution();
        assertEquals(0, solution.blueTicket(9,2,0));
    }

    @Test
    public void blue_ticket_v03(){
        Solution solution = new Solution();
        assertEquals(10, solution.blueTicket(6,1,4));
    }

    @Test
    public void blue_ticket_v04(){
        Solution solution = new Solution();
        assertEquals(0, solution.blueTicket(6,1,5));
    }

    @Test
    public void blue_ticket_v05(){
        Solution solution = new Solution();
        assertEquals(10, solution.blueTicket(10,0,0));
    }

    @Test
    public void blue_ticket_v06(){
        Solution solution = new Solution();
        assertEquals(5, solution.blueTicket(15,0,5));
    }

    @Test
    public void blue_ticket_v07(){
        Solution solution = new Solution();
        assertEquals(10, solution.blueTicket(5,15,5));
    }

    @Test
    public void blue_ticket_v08(){
        Solution solution = new Solution();
        assertEquals(5, solution.blueTicket(4,11,1));
    }

    @Test
    public void blue_ticket_v09(){
        Solution solution = new Solution();
        assertEquals(5, solution.blueTicket(13,2,3));
    }

    @Test
    public void blue_ticket_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.blueTicket(8,4,3));
    }

    @Test
    public void blue_ticket_v11(){
        Solution solution = new Solution();
        assertEquals(10, solution.blueTicket(8,4,2));
    }

    @Test
    public void blue_ticket_v12(){
        Solution solution = new Solution();
        assertEquals(0, solution.blueTicket(8,4,1));
    }
}
