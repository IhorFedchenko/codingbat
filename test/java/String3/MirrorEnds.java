package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MirrorEnds {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void mirror_ends_v01(){
        assertEquals("ab", solution.mirrorEnds("abXYZba"));
    }

    @Test
    public void mirror_ends_v02(){
        assertEquals("a", solution.mirrorEnds("abca"));
    }

    @Test
    public void mirror_ends_v03(){
        assertEquals("aba", solution.mirrorEnds("aba"));
    }

    @Test
    public void mirror_ends_v04(){
        assertEquals("", solution.mirrorEnds("abab"));
    }

    @Test
    public void mirror_ends_v05(){
        assertEquals("xxx", solution.mirrorEnds("xxx"));
    }

    @Test
    public void mirror_ends_v06(){
        assertEquals("xxYxx", solution.mirrorEnds("xxYxx"));
    }

    @Test
    public void mirror_ends_v07(){
        assertEquals("Hi ", solution.mirrorEnds("Hi and iH"));
    }

    @Test
    public void mirror_ends_v08(){
        assertEquals("x", solution.mirrorEnds("x"));
    }

    @Test
    public void mirror_ends_v09(){
        assertEquals("", solution.mirrorEnds(""));
    }

    @Test
    public void mirror_ends_v10(){
        assertEquals("123", solution.mirrorEnds("123and then 321"));
    }

    @Test
    public void mirror_ends_v11(){
        assertEquals("ba", solution.mirrorEnds("band andab"));
    }
}
