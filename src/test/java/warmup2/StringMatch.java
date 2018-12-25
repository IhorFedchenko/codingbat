package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatch {

    @Test
    public void string_match_v01(){
        Solution solution = new Solution();
        assertEquals(3, solution.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void string_match_v02(){
        Solution solution = new Solution();
        assertEquals(2, solution.stringMatch("abc", "abc"));
    }

    @Test
    public void string_match_v03(){
        Solution solution = new Solution();
        assertEquals(0, solution.stringMatch("abc", "axc"));
    }

    @Test
    public void string_match_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.stringMatch("hello", "he"));
    }

    @Test
    public void string_match_v05(){
        Solution solution = new Solution();
        assertEquals(1, solution.stringMatch("he", "hello"));
    }

    @Test
    public void string_match_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.stringMatch("h", "xxbaaz"));
    }

    @Test
    public void string_match_v07(){
        Solution solution = new Solution();
        assertEquals(0, solution.stringMatch("", "hello"));
    }

    @Test
    public void string_match_v08(){
        Solution solution = new Solution();
        assertEquals(1, solution.stringMatch("aabbccdd", "abbbxxd"));
    }

    @Test
    public void string_match_v09(){
        Solution solution = new Solution();
        assertEquals(3, solution.stringMatch("aaxxaaxx", "iaxxai"));
    }

    @Test
    public void string_match_v10(){
        Solution solution = new Solution();
        assertEquals(3, solution.stringMatch("iaxxai", "aaxxaaxx"));
    }
}
