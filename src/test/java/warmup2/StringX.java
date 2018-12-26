package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringX {

    @Test
    public void string_x_xHix(){
        Solution solution = new Solution();
        assertEquals("xHix", solution.stringX("xHix"));
    }

    @Test
    public void string_x_abxxxcd(){
        Solution solution = new Solution();
        assertEquals("abcd", solution.stringX("abxxxcd"));
    }

    @Test
    public void string_x_xabxxxcdx(){
        Solution solution = new Solution();
        assertEquals("xabcdx", solution.stringX("xabxxxcdx"));
    }

    @Test
    public void string_x_xKittenx(){
        Solution solution = new Solution();
        assertEquals("xKittenx", solution.stringX("xKittenx"));
    }

    @Test
    public void string_x_Hello(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.stringX("Hello"));
    }

    @Test
    public void string_x_xx(){
        Solution solution = new Solution();
        assertEquals("xx", solution.stringX("xx"));
    }

    @Test
    public void string_x(){
        Solution solution = new Solution();
        assertEquals("x", solution.stringX("x"));
    }

    @Test
    public void string_x__(){
        Solution solution = new Solution();
        assertEquals("", solution.stringX(""));
    }
}
