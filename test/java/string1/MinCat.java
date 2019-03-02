package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCat {

    @Test
    public void min_cat_v01(){
        Solution solution = new Solution();
        assertEquals("loHi", solution.minCat("Hello", "Hi"));
    }

    @Test
    public void min_cat_v02(){
        Solution solution = new Solution();
        assertEquals("ellojava", solution.minCat("Hello", "java"));
    }

    @Test
    public void min_cat_v03(){
        Solution solution = new Solution();
        assertEquals("javaello", solution.minCat("java", "Hello"));
    }

    @Test
    public void min_cat_v04(){
        Solution solution = new Solution();
        assertEquals("cx", solution.minCat("abc", "x"));
    }

    @Test
    public void min_cat_v05(){
        Solution solution = new Solution();
        assertEquals("xc", solution.minCat("x", "abc"));
    }

    @Test
    public void min_cat_v06(){
        Solution solution = new Solution();
        assertEquals("", solution.minCat("abc", ""));
    }
}
