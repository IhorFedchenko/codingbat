package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontBack {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void frontBack_code() {
        assertEquals("eodc", solution.frontBack("code"));
    }

    @Test
    public void frontBack_a() {
        assertEquals("a", solution.frontBack("a"));
    }

    @Test
    public void frontBack_ab() {
        assertEquals("ba", solution.frontBack("ab"));
    }

    @Test
    public void frontBack_abc() {
        assertEquals("cba", solution.frontBack("abc"));
    }

    @Test
    public void frontBack_() {
        assertEquals("", solution.frontBack(""));
    }

    @Test
    public void frontBack_Chocolate() {
        assertEquals("ehocolatC", solution.frontBack("Chocolate"));
    }

    @Test
    public void frontBack_aavJ() {
        assertEquals("Java", solution.frontBack("aavJ"));
    }

    @Test
    public void frontBack_hello() {
        assertEquals("oellh", solution.frontBack("hello"));
    }
}
