package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheEnd {

    @Test
    public void the_end_v01(){
        Solution solution = new Solution();
        assertEquals("H", solution.theEnd("Hello", true));
    }

    @Test
    public void the_end_v02(){
        Solution solution = new Solution();
        assertEquals("o", solution.theEnd("Hello", false));
    }

    @Test
    public void the_end_v03(){
        Solution solution = new Solution();
        assertEquals("o", solution.theEnd("oh", true));
    }

    @Test
    public void the_end_v04(){
        Solution solution = new Solution();
        assertEquals("h", solution.theEnd("oh", false));
    }

    @Test
    public void the_end_v05(){
        Solution solution = new Solution();
        assertEquals("x", solution.theEnd("x", true));
    }

    @Test
    public void the_end_v06(){
        Solution solution = new Solution();
        assertEquals("x", solution.theEnd("x", false));
    }

    @Test
    public void the_end_v07(){
        Solution solution = new Solution();
        assertEquals("j", solution.theEnd("java", true));
    }

    @Test
    public void the_end_v08(){
        Solution solution = new Solution();
        assertEquals("e", solution.theEnd("chocolate", false));
    }

    @Test
    public void the_end_v09(){
        Solution solution = new Solution();
        assertEquals("1", solution.theEnd("1234", true));
    }

    @Test
    public void the_end_v10(){
        Solution solution = new Solution();
        assertEquals("e", solution.theEnd("code", false));
    }
}
