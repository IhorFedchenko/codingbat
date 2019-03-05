package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedTicket {

    @Test
    public void red_tichet_v01(){
        Solution solution = new Solution();
        assertEquals(10, solution.redTicket(2,2,2));
    }

    @Test
    public void red_tichet_v02(){
        Solution solution = new Solution();
        assertEquals(0, solution.redTicket(2,2,1));
    }

    @Test
    public void red_tichet_v03(){
        Solution solution = new Solution();
        assertEquals(5, solution.redTicket(0,0,0));
    }

    @Test
    public void red_tichet_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.redTicket(2,0,0));
    }

    @Test
    public void red_tichet_v05(){
        Solution solution = new Solution();
        assertEquals(5, solution.redTicket(1,1,1));
    }

    @Test
    public void red_tichet_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.redTicket(1,2,1));
    }

    @Test
    public void red_tichet_v07(){
        Solution solution = new Solution();
        assertEquals(1, solution.redTicket(1,2,0));
    }

    @Test
    public void red_tichet_v08(){
        Solution solution = new Solution();
        assertEquals(1, solution.redTicket(0,2,2));
    }

    @Test
    public void red_tichet_v09(){
        Solution solution = new Solution();
        assertEquals(1, solution.redTicket(1,2,2));
    }

    @Test
    public void red_tichet_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.redTicket(0,2,0));
    }

    @Test
    public void red_tichet_v11(){
        Solution solution = new Solution();
        assertEquals(0, solution.redTicket(1,1,2));
    }
}
