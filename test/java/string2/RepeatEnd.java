package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatEnd {

    @Test
    public void repeat_end_v01(){
        Solution solution = new Solution();
        assertEquals("llollollo", solution.repeatEnd("Hello", 3));
    }

    @Test
    public void repeat_end_v02(){
        Solution solution = new Solution();
        assertEquals("lolo", solution.repeatEnd("Hello", 2));
    }

    @Test
    public void repeat_end_v03(){
        Solution solution = new Solution();
        assertEquals("o", solution.repeatEnd("Hello", 1));
    }

    @Test
    public void repeat_end_v04(){
        Solution solution = new Solution();
        assertEquals("", solution.repeatEnd("Hello", 0));
    }

    @Test
    public void repeat_end_v05(){
        Solution solution = new Solution();
        assertEquals("abcabcabc", solution.repeatEnd("abc", 3));
    }

    @Test
    public void repeat_end_v06(){
        Solution solution = new Solution();
        assertEquals("3434", solution.repeatEnd("1234", 2));
    }

    @Test
    public void repeat_end_v07(){
        Solution solution = new Solution();
        assertEquals("234234234", solution.repeatEnd("1234", 3));
    }

    @Test
    public void repeat_end_v08(){
        Solution solution = new Solution();
        assertEquals("", solution.repeatEnd("", 0));
    }
}
