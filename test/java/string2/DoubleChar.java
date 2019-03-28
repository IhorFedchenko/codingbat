package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleChar {

    @Test
    public void double_char_v01(){
        Solution solution = new Solution();
        assertEquals("TThhee", solution.doubleChar("The"));
    }

    @Test
    public void double_char_v02(){
        Solution solution = new Solution();
        assertEquals("AAAAbbbb", solution.doubleChar("AAbb"));
    }

    @Test
    public void double_char_v03(){
        Solution solution = new Solution();
        assertEquals("HHii--TThheerree", solution.doubleChar("Hi-There"));
    }

    @Test
    public void double_char_v04(){
        Solution solution = new Solution();
        assertEquals("WWoorrdd!!", solution.doubleChar("Word!"));
    }

    @Test
    public void double_char_v05(){
        Solution solution = new Solution();
        assertEquals("!!!!", solution.doubleChar("!!"));
    }

    @Test
    public void double_char_v06(){
        Solution solution = new Solution();
        assertEquals("", solution.doubleChar(""));
    }

    @Test
    public void double_char_v07(){
        Solution solution = new Solution();
        assertEquals("aa", solution.doubleChar("a"));
    }

    @Test
    public void double_char_v08(){
        Solution solution = new Solution();
        assertEquals("..", solution.doubleChar("."));
    }

    @Test
    public void double_char_v09(){
        Solution solution = new Solution();
        assertEquals("aaaa", solution.doubleChar("aa"));
    }
}
