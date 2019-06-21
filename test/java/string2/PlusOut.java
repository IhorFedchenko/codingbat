package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusOut {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void plus_out_v01() {
        assertEquals("++xy++", solution.plusOut("12xy34", "xy"));
    }

    @Test
    public void plus_out_v02() {
        assertEquals("1+++++", solution.plusOut("12xy34", "1"));
    }

    @Test
    public void plus_out_v03() {
        assertEquals("++xy++xy+++xy", solution.plusOut("12xy34xyabcxy", "xy"));
    }

    @Test
    public void plus_out_v04() {
        assertEquals("ab++ab++++", solution.plusOut("abXYabcXYZ", "ab"));
    }

    @Test
    public void plus_out_v05() {
        assertEquals("++++abc+++", solution.plusOut("abXYabcXYZ", "abc"));
    }

    @Test
    public void plus_out_v06() {
        assertEquals("++XY+++XY+", solution.plusOut("abXYabcXYZ", "XY"));
    }

    @Test
    public void plus_out_v07() {
        assertEquals("+++++++XYZ", solution.plusOut("abXYxyzXYZ", "XYZ"));
    }

    @Test
    public void plus_out_v08() {
        assertEquals("++++++", solution.plusOut("--++ab", "++"));
    }

    @Test
    public void plus_out_v09() {
        assertEquals("++xxxx++", solution.plusOut("aaxxxxbb", "xx"));
    }

    @Test
    public void plus_out_v10() {
        assertEquals("++3++3", solution.plusOut("123123", "3"));
    }
}
