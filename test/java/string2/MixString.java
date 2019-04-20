package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MixString {

    @Test
    public void mix_string_v01(){
        Solution solution = new Solution();
        assertEquals("axbycz", solution.mixString("abc", "xyz") );
    }

    @Test
    public void mix_string_v02(){
        Solution solution = new Solution();
        assertEquals("HTihere", solution.mixString("Hi", "There") );
    }

    @Test
    public void mix_string_v03(){
        Solution solution = new Solution();
        assertEquals("xTxhxexre", solution.mixString("xxxx", "There") );
    }

    @Test
    public void mix_string_v04(){
        Solution solution = new Solution();
        assertEquals("xXxx", solution.mixString("xxx", "X") );
    }

    @Test
    public void mix_string_v05(){
        Solution solution = new Solution();
        assertEquals("22/7 around", solution.mixString("2/", "27 around") );
    }

    @Test
    public void mix_string_v06(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.mixString("", "Hello") );
    }

    @Test
    public void mix_string_v07(){
        Solution solution = new Solution();
        assertEquals("Abc", solution.mixString("Abc", "") );
    }

    @Test
    public void mix_string_v08(){
        Solution solution = new Solution();
        assertEquals("", solution.mixString("", "") );
    }

    @Test
    public void mix_string_v09(){
        Solution solution = new Solution();
        assertEquals("ab", solution.mixString("a", "b") );
    }

    @Test
    public void mix_string_v10(){
        Solution solution = new Solution();
        assertEquals("abx", solution.mixString("ax", "b") );
    }

    @Test
    public void mix_string_v11(){
        Solution solution = new Solution();
        assertEquals("abx", solution.mixString("a", "bx") );
    }

    @Test
    public void mix_string_v12(){
        Solution solution = new Solution();
        assertEquals("SLoong", solution.mixString("So", "Long") );
    }

    @Test
    public void mix_string_v13(){
        Solution solution = new Solution();
        assertEquals("LSoong", solution.mixString("Long", "So") );
    }
}
