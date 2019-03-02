package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndUp {

    @Test
    public void end_up_Hello(){
        Solution solution = new Solution();
        assertEquals("HeLLO", solution.endUp("Hello"));
    }

    @Test
    public void end_up_hi_there(){
        Solution solution = new Solution();
        assertEquals("hi thERE", solution.endUp("hi there"));
    }

    @Test
    public void end_up_hi(){
        Solution solution = new Solution();
        assertEquals("HI", solution.endUp("hi"));
    }

    @Test
    public void end_up_woo_hoo(){
        Solution solution = new Solution();
        assertEquals("woo HOO", solution.endUp("woo hoo"));
    }

    @Test
    public void end_up_xyz12(){
        Solution solution = new Solution();
        assertEquals("xyZ12", solution.endUp("xyz12"));
    }

    @Test
    public void end_up_x(){
        Solution solution = new Solution();
        assertEquals("X", solution.endUp("x"));
    }

    @Test
    public void end_up__(){
        Solution solution = new Solution();
        assertEquals("", solution.endUp(""));
    }
}
