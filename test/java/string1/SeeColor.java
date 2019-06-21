package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeeColor {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void see_color_redxx() {
        assertEquals("red", solution.seeColor("redxx"));
    }

    @Test
    public void see_color_xxred() {
        assertEquals("", solution.seeColor("xxred"));
    }

    @Test
    public void see_color_blueTimes() {
        assertEquals("blue", solution.seeColor("blueTimes"));
    }

    @Test
    public void see_color_NoColor() {
        assertEquals("", solution.seeColor("NoColor"));
    }

    @Test
    public void see_color_red() {
        assertEquals("red", solution.seeColor("red"));
    }

    @Test
    public void see_color_re() {
        assertEquals("", solution.seeColor("re"));
    }

    @Test
    public void see_color_blu() {
        assertEquals("", solution.seeColor("blu"));
    }

    @Test
    public void see_color_blue() {
        assertEquals("blue", solution.seeColor("blue"));
    }

    @Test
    public void see_color_a() {
        assertEquals("", solution.seeColor("a"));
    }

    @Test
    public void see_color__() {
        assertEquals("", solution.seeColor(""));
    }

    @Test
    public void see_color_xyzred() {
        assertEquals("", solution.seeColor("xyzred"));
    }
}
