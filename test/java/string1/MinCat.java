package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCat {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void min_cat_v01() {
        assertEquals("loHi", solution.minCat("Hello", "Hi"));
    }

    @Test
    public void min_cat_v02() {
        assertEquals("ellojava", solution.minCat("Hello", "java"));
    }

    @Test
    public void min_cat_v03() {
        assertEquals("javaello", solution.minCat("java", "Hello"));
    }

    @Test
    public void min_cat_v04() {
        assertEquals("cx", solution.minCat("abc", "x"));
    }

    @Test
    public void min_cat_v05() {
        assertEquals("xc", solution.minCat("x", "abc"));
    }

    @Test
    public void min_cat_v06() {
        assertEquals("", solution.minCat("abc", ""));
    }
}
