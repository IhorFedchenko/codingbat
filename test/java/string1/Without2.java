package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Without2 {

    @Test
    public void without2_HelloHe(){
        Solution solution = new Solution();
        assertEquals("lloHe", solution.without2("HelloHe"));
    }

    @Test
    public void without2_HelloHi(){
        Solution solution = new Solution();
        assertEquals("HelloHi", solution.without2("HelloHi"));
    }

    @Test
    public void without2_Hi(){
        Solution solution = new Solution();
        assertEquals("", solution.without2("Hi"));
    }

    @Test
    public void without2_Chocolate(){
        Solution solution = new Solution();
        assertEquals("Chocolate", solution.without2("Chocolate"));
    }

    @Test
    public void without2_xxx(){
        Solution solution = new Solution();
        assertEquals("x", solution.without2("x"));
    }

    @Test
    public void without2_xx(){
        Solution solution = new Solution();
        assertEquals("", solution.without2(""));
    }

    @Test
    public void without2_x(){
        Solution solution = new Solution();
        assertEquals("x", solution.without2("x"));
    }

    @Test
    public void without2___(){
        Solution solution = new Solution();
        assertEquals("", solution.without2(""));
    }

    @Test
    public void without2_Fruits(){
        Solution solution = new Solution();
        assertEquals("Fruits", solution.without2("Fruits"));
    }
}
