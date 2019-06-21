package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NTwice {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void n_twice_v01() {
        assertEquals("Helo", solution.nTwice("Hello", 2));
    }

    @Test
    public void n_twice_v02() {
        assertEquals("Choate", solution.nTwice("Chocolate", 3));
    }

    @Test
    public void n_twice_v03() {
        assertEquals("Ce", solution.nTwice("Chocolate", 1));
    }

    @Test
    public void n_twice_v04() {
        assertEquals("", solution.nTwice("Chocolate", 0));
    }

    @Test
    public void n_twice_v05() {
        assertEquals("Hellello", solution.nTwice("Hello", 4));
    }

    @Test
    public void n_twice_v06() {
        assertEquals("CodeCode", solution.nTwice("Code", 4));
    }

    @Test
    public void n_twice_v07() {
        assertEquals("Code", solution.nTwice("Code", 2));
    }

}
