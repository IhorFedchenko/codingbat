package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutEnd2 {

    @Test
    public void without_end_v01(){
        Solution solution = new Solution();
        assertEquals("ell", solution.withouEnd2("Hello"));
    }

    @Test
    public void without_end_v02(){
        Solution solution = new Solution();
        assertEquals("b", solution.withouEnd2("abc"));
    }

    @Test
    public void without_end_v03(){
        Solution solution = new Solution();
        assertEquals("", solution.withouEnd2("ab"));
    }

    @Test
    public void without_end_v04(){
        Solution solution = new Solution();
        assertEquals("", solution.withouEnd2("a"));
    }

    @Test
    public void without_end_v05(){
        Solution solution = new Solution();
        assertEquals("", solution.withouEnd2(""));
    }

    @Test
    public void without_end_v06(){
        Solution solution = new Solution();
        assertEquals("old", solution.withouEnd2("coldy"));
    }

    @Test
    public void without_end_v07(){
        Solution solution = new Solution();
        assertEquals("ava cod", solution.withouEnd2("java code"));
    }
}
