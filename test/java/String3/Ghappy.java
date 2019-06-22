package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Ghappy {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void g_happy_v01(){
        assertTrue(solution.gHappy("xxggxx"));
    }

    @Test
    public void g_happy_v02(){
        assertFalse(solution.gHappy("xxgxx"));
    }

    @Test
    public void g_happy_v03(){
        assertFalse(solution.gHappy("xxggyygxx"));
    }

    @Test
    public void g_happy_v04(){
        assertFalse(solution.gHappy("g"));
    }

    @Test
    public void g_happy_v05(){
        assertTrue(solution.gHappy("gg"));
    }

    @Test
    public void g_happy_v06(){
        assertTrue(solution.gHappy(""));
    }

    @Test
    public void g_happy_v07(){
        assertTrue(solution.gHappy("xxgggxyz"));
    }

    @Test
    public void g_happy_v08(){
        assertFalse(solution.gHappy("xxgggxyg"));
    }

    @Test
    public void g_happy_v09(){
        assertTrue(solution.gHappy("xxgggxygg"));
    }

    @Test
    public void g_happy_v10(){
        assertFalse(solution.gHappy("mgm"));
    }

    @Test
    public void g_happy_v11(){
        assertTrue(solution.gHappy("mggm"));
    }

    @Test
    public void g_happy_v12(){
        assertTrue(solution.gHappy("yyygggxyy"));
    }
}
