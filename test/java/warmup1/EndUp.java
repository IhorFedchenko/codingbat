package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndUp {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void end_up_Hello() {
        assertEquals("HeLLO", solution.endUp("Hello"));
    }

    @Test
    public void end_up_hi_there() {
        assertEquals("hi thERE", solution.endUp("hi there"));
    }

    @Test
    public void end_up_hi() {
        assertEquals("HI", solution.endUp("hi"));
    }

    @Test
    public void end_up_woo_hoo() {
        assertEquals("woo HOO", solution.endUp("woo hoo"));
    }

    @Test
    public void end_up_xyz12() {
        assertEquals("xyZ12", solution.endUp("xyz12"));
    }

    @Test
    public void end_up_x() {
        assertEquals("X", solution.endUp("x"));
    }

    @Test
    public void end_up__() {
        assertEquals("", solution.endUp(""));
    }
}
