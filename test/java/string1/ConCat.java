package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConCat {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void con_cat_v01() {
        assertEquals("abcat", solution.conCat("abc", "cat"));
    }

    @Test
    public void con_cat_v02() {
        assertEquals("dogcat", solution.conCat("dog", "cat"));
    }

    @Test
    public void con_cat_v03() {
        assertEquals("abc", solution.conCat("abc", ""));
    }

    @Test
    public void con_cat_v04() {
        assertEquals("cat", solution.conCat("", "cat"));
    }

    @Test
    public void con_cat_v05() {
        assertEquals("pig", solution.conCat("pig", "g"));
    }

    @Test
    public void con_cat_v06() {
        assertEquals("pigdoggy", solution.conCat("pig", "doggy"));
    }
}
