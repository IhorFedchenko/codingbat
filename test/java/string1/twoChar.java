package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class twoChar {

    @Test
    public void two_char_v01(){
        Solution solution = new Solution();
        assertEquals("ja", solution.twoChar("java", 0));
    }

    @Test
    public void two_char_v02(){
        Solution solution = new Solution();
        assertEquals("va", solution.twoChar("java", 2));
    }

    @Test
    public void two_char_v03(){
        Solution solution = new Solution();
        assertEquals("ja", solution.twoChar("java", 3));
    }

    @Test
    public void two_char_v04(){
        Solution solution = new Solution();
        assertEquals("ja", solution.twoChar("java", 4));
    }

    @Test
    public void two_char_v05(){
        Solution solution = new Solution();
        assertEquals("ja", solution.twoChar("java", -1));
    }

    @Test
    public void two_char_v06(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", 0));
    }

    @Test
    public void two_char_v07(){
        Solution solution = new Solution();
        assertEquals("el", solution.twoChar("Hello", 1));
    }

    @Test
    public void two_char_v08(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", 99));
    }

    @Test
    public void two_char_v09(){
        Solution solution = new Solution();
        assertEquals("lo", solution.twoChar("Hello", 3));
    }

    @Test
    public void two_char_v10(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", 4));
    }

    @Test
    public void two_char_v11(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", 5));
    }

    @Test
    public void two_char_v12(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", -7));
    }

    @Test
    public void two_char_v13(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", 6));
    }
    @Test
    public void two_char_v14(){
        Solution solution = new Solution();
        assertEquals("He", solution.twoChar("Hello", -1));
    }

    @Test
    public void two_char_v15(){
        Solution solution = new Solution();
        assertEquals("ya", solution.twoChar("yay", 0));
    }

}
