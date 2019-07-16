package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameEnds {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void same_ends_v01(){
        assertEquals("ab", solution.sameEnds("abXYab"));
    }

    @Test
    public void same_ends_v02(){
        assertEquals("x", solution.sameEnds("xx"));
    }

    @Test
    public void same_ends_v03(){
        assertEquals("x", solution.sameEnds("xxx"));
    }

    @Test
    public void same_ends_v04(){
        assertEquals("xx", solution.sameEnds("xxxx"));
    }

    @Test
    public void same_ends_v05(){
        assertEquals("java", solution.sameEnds("javaXYZjava"));
    }

    @Test
    public void same_ends_v06(){
        assertEquals("java", solution.sameEnds("javajava"));
    }

    @Test
    public void same_ends_v07(){
        assertEquals("", solution.sameEnds("xavaXYZjava"));
    }

    @Test
    public void same_ends_v08(){
        assertEquals("Hello!", solution.sameEnds("Hello! and Hello!"));
    }

    @Test
    public void same_ends_v09(){
        assertEquals("", solution.sameEnds("x"));
    }

    @Test
    public void same_ends_v10(){
        assertEquals("", solution.sameEnds(""));
    }

    @Test
    public void same_ends_v11(){
        assertEquals("", solution.sameEnds("abcd"));
    }

    @Test
    public void same_ends_v12(){
        assertEquals("my", solution.sameEnds("mymmy"));
    }
}
