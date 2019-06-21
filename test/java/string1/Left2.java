package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Left2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void left2_v01() {
        assertEquals("lloHe", solution.left2("Hello"));
    }

    @Test
    public void left2_v02() {
        assertEquals("vaja", solution.left2("java"));
    }

    @Test
    public void left2_v03() {
        assertEquals("Hi", solution.left2("Hi"));
    }

    @Test
    public void left2_v04() {
        assertEquals("deco", solution.left2("code"));
    }

    @Test
    public void left2_v05() {
        assertEquals("tca", solution.left2("cat"));
    }

    @Test
    public void left2_v06() {
        assertEquals("34512", solution.left2("12345"));
    }

    @Test
    public void left2_v07() {
        assertEquals("ocolateCh", solution.left2("Chocolate"));
    }

    @Test
    public void left2_v08() {
        assertEquals("icksbr", solution.left2("bricks"));
    }


}
