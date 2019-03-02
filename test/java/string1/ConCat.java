package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConCat {

    @Test
    public void con_cat_v01(){
        Solution solution = new Solution();
        assertEquals("abcat", solution.conCat("abc", "cat"));
    }

    @Test
    public void con_cat_v02(){
        Solution solution = new Solution();
        assertEquals("dogcat", solution.conCat("dog", "cat"));
    }

    @Test
    public void con_cat_v03(){
        Solution solution = new Solution();
        assertEquals("abc", solution.conCat("abc", ""));
    }

    @Test
    public void con_cat_v04(){
        Solution solution = new Solution();
        assertEquals("cat", solution.conCat("", "cat"));
    }

    @Test
    public void con_cat_v05(){
        Solution solution = new Solution();
        assertEquals("pig", solution.conCat("pig", "g"));
    }

    @Test
    public void con_cat_v06(){
        Solution solution = new Solution();
        assertEquals("pigdoggy", solution.conCat("pig", "doggy"));
    }
}
