package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackAround {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void backAround_cat() {
        assertEquals("tcatt", solution.backAround("cat"));
    }

    @Test
    public void backAround_Hello() {
        assertEquals("oHelloo", solution.backAround("Hello"));
    }

    @Test
    public void backAround_a() {
        assertEquals("aaa", solution.backAround("a"));
    }

    @Test
    public void backAround_abc() {
        assertEquals("cabcc", solution.backAround("abc"));
    }

    @Test
    public void backAround_read() {
        assertEquals("dreadd", solution.backAround("read"));
    }

    @Test
    public void backAround_boo() {
        assertEquals("obooo", solution.backAround("boo"));
    }
}
