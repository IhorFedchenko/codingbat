package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStart {

    @Test
    public void non_start_v01(){
        Solution solution = new Solution();
        assertEquals("ellohere", solution.nonStart("Hello", "There"));
    }

    @Test
    public void non_start_v02(){
        Solution solution = new Solution();
        assertEquals("avaode", solution.nonStart("java", "code"));
    }

    @Test
    public void non_start_v03(){
        Solution solution = new Solution();
        assertEquals("hotlava", solution.nonStart("shotl", "java"));
    }

    @Test
    public void non_start_v04(){
        Solution solution = new Solution();
        assertEquals("by", solution.nonStart("ab", "xy"));
    }

    @Test
    public void non_start_v05(){
        Solution solution = new Solution();
        assertEquals("b", solution.nonStart("ab", "x"));
    }

    @Test
    public void non_start_v06(){
        Solution solution = new Solution();
        assertEquals("c", solution.nonStart("x", "ac"));
    }

    @Test
    public void non_start_v07(){
        Solution solution = new Solution();
        assertEquals("", solution.nonStart("a", "x"));
    }

    @Test
    public void non_start_v08(){
        Solution solution = new Solution();
        assertEquals("itat", solution.nonStart("kit", "kat"));
    }

    @Test
    public void non_start_v09(){
        Solution solution = new Solution();
        assertEquals("artart", solution.nonStart("mart", "dart"));
    }
}
