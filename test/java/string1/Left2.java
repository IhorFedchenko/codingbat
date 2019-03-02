package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Left2 {

    @Test
    public void left2_v01(){
        Solution solution = new Solution();
        assertEquals("lloHe", solution.left2("Hello"));
    }

    @Test
    public void left2_v02(){
        Solution solution = new Solution();
        assertEquals("vaja", solution.left2("java"));
    }

    @Test
    public void left2_v03(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.left2("Hi"));
    }

    @Test
    public void left2_v04(){
        Solution solution = new Solution();
        assertEquals("deco", solution.left2("code"));
    }
    @Test
    public void left2_v05(){
        Solution solution = new Solution();
        assertEquals("tca", solution.left2("cat"));
    }

    @Test
    public void left2_v06(){
        Solution solution = new Solution();
        assertEquals("34512", solution.left2("12345"));
    }

    @Test
    public void left2_v07(){
        Solution solution = new Solution();
        assertEquals("ocolateCh", solution.left2("Chocolate"));
    }
    @Test
    public void left2_v08(){
        Solution solution = new Solution();
        assertEquals("icksbr", solution.left2("bricks"));
    }


}
