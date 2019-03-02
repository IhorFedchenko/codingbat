package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeeColor {

    @Test
    public void see_color_redxx(){
        Solution solution = new Solution();
        assertEquals("red", solution.seeColor("redxx"));
    }

    @Test
    public void see_color_xxred(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("xxred"));
    }

    @Test
    public void see_color_blueTimes(){
        Solution solution = new Solution();
        assertEquals("blue", solution.seeColor("blueTimes"));
    }

    @Test
    public void see_color_NoColor(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("NoColor"));
    }

    @Test
    public void see_color_red(){
        Solution solution = new Solution();
        assertEquals("red", solution.seeColor("red"));
    }

    @Test
    public void see_color_re(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("re"));
    }

    @Test
    public void see_color_blu(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("blu"));
    }

    @Test
    public void see_color_blue(){
        Solution solution = new Solution();
        assertEquals("blue", solution.seeColor("blue"));
    }

    @Test
    public void see_color_a(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("a"));
    }

    @Test
    public void see_color__(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor(""));
    }

    @Test
    public void see_color_xyzred(){
        Solution solution = new Solution();
        assertEquals("", solution.seeColor("xyzred"));
    }
}
