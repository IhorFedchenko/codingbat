package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatFront {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void repeat_front_v01() {
        assertEquals("ChocChoChC", solution.repeatFront("Chocolate", 4));
    }

    @Test
    public void repeat_front_v02() {
        assertEquals("ChoChC", solution.repeatFront("Chocolate", 3));
    }

    @Test
    public void repeat_front_v03() {
        assertEquals("IcI", solution.repeatFront("Ice Cream", 2));
    }

    @Test
    public void repeat_front_v04() {
        assertEquals("I", solution.repeatFront("Ice Cream", 1));
    }

    @Test
    public void repeat_front_v05() {
        assertEquals("", solution.repeatFront("Ice Cream", 0));
    }

    @Test
    public void repeat_front_v06() {
        assertEquals("xyzxyx", solution.repeatFront("xyz", 3));
    }

    @Test
    public void repeat_front_v07() {
        assertEquals("", solution.repeatFront("", 0));
    }

    @Test
    public void repeat_front_v08() {
        assertEquals("JavaJavJaJ", solution.repeatFront("Java", 4));
    }

    @Test
    public void repeat_front_v09() {
        assertEquals("J", solution.repeatFront("Java", 1));
    }
}
