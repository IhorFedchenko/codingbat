package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatEnd {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void repeat_end_v01() {
        assertEquals("llollollo", solution.repeatEnd("Hello", 3));
    }

    @Test
    public void repeat_end_v02() {
        assertEquals("lolo", solution.repeatEnd("Hello", 2));
    }

    @Test
    public void repeat_end_v03() {
        assertEquals("o", solution.repeatEnd("Hello", 1));
    }

    @Test
    public void repeat_end_v04() {
        assertEquals("", solution.repeatEnd("Hello", 0));
    }

    @Test
    public void repeat_end_v05() {
        assertEquals("abcabcabc", solution.repeatEnd("abc", 3));
    }

    @Test
    public void repeat_end_v06() {
        assertEquals("3434", solution.repeatEnd("1234", 2));
    }

    @Test
    public void repeat_end_v07() {
        assertEquals("234234234", solution.repeatEnd("1234", 3));
    }

    @Test
    public void repeat_end_v08() {
        assertEquals("", solution.repeatEnd("", 0));
    }
}
