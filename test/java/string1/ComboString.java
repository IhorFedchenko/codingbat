package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComboString {

    @Test
    public void combo_string_v01(){
        Solution solution = new Solution();
        assertEquals("hiHellohi", solution.comboString("Hello", "hi"));
    }

    @Test
    public void combo_string_v02(){
        Solution solution = new Solution();
        assertEquals("hiHellohi", solution.comboString("hi", "Hello"));
    }

    @Test
    public void combo_string_v03(){
        Solution solution = new Solution();
        assertEquals("baaab", solution.comboString("aaa", "b"));
    }

    @Test
    public void combo_string_v04(){
        Solution solution = new Solution();
        assertEquals("baaab", solution.comboString("b", "aaa"));
    }

    @Test
    public void combo_string_v05(){
        Solution solution = new Solution();
        assertEquals("aaa", solution.comboString("aaa", ""));
    }

    @Test
    public void combo_string_v06(){
        Solution solution = new Solution();
        assertEquals("bb", solution.comboString("", "bb"));
    }

    @Test
    public void combo_string_v07(){
        Solution solution = new Solution();
        assertEquals("aaa1234aaa", solution.comboString("aaa", "1234"));
    }

    @Test
    public void combo_string_v08(){
        Solution solution = new Solution();
        assertEquals("bbaaabb", solution.comboString("aaa", "bb"));
    }

    @Test
    public void combo_string_v09(){
        Solution solution = new Solution();
        assertEquals("abba", solution.comboString("a", "bb"));
    }

    @Test
    public void combo_string_v10(){
        Solution solution = new Solution();
        assertEquals("abba", solution.comboString("bb", "a"));
    }
    @Test
    public void combo_string_v11(){
        Solution solution = new Solution();
        assertEquals("abxyzab", solution.comboString("xyz", "ab"));
    }
}
