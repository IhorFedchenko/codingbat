package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastChars {

    @Test
    public void last_chars_v01(){
        Solution solution = new Solution();
        assertEquals("ls", solution.lastChars("last", "chars"));
    }

    @Test
    public void last_chars_v02(){
        Solution solution = new Solution();
        assertEquals("ya", solution.lastChars("yo", "yava"));
    }

    @Test
    public void last_chars_v03(){
        Solution solution = new Solution();
        assertEquals("h@", solution.lastChars("hi", ""));
    }

    @Test
    public void last_chars_v04(){
        Solution solution = new Solution();
        assertEquals("@o", solution.lastChars("", "hello"));
    }

    @Test
    public void last_chars_v05(){
        Solution solution = new Solution();
        assertEquals("@@", solution.lastChars("", ""));
    }

    @Test
    public void last_chars_v06(){
        Solution solution = new Solution();
        assertEquals("ki", solution.lastChars("kitten", "hi"));
    }

    @Test
    public void last_chars_v07(){
        Solution solution = new Solution();
        assertEquals("kp", solution.lastChars("k", "zip"));
    }

    @Test
    public void last_chars_v08(){
        Solution solution = new Solution();
        assertEquals("k@", solution.lastChars("kitten", ""));
    }

    @Test
    public void last_chars_v09(){
        Solution solution = new Solution();
        assertEquals("kp", solution.lastChars("kitten", "zip"));
    }
}
