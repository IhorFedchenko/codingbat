package string2;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatSeparator {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void repeat_separator_v01() {
        assertEquals("WordXWordXWord", solution.repeatSeparator("Word", "X", 3));
    }

    @Test
    public void repeat_separator_v02() {
        assertEquals("ThisAndThis", solution.repeatSeparator("This", "And", 2));
    }

    @Test
    public void repeat_separator_v03() {
        assertEquals("This", solution.repeatSeparator("This", "And", 1));
    }

    @Test
    public void repeat_separator_v04() {
        assertEquals("Hi-n-Hi", solution.repeatSeparator("Hi", "-n-", 2));
    }

    @Test
    public void repeat_separator_v05() {
        assertEquals("AAA", solution.repeatSeparator("AAA", "", 1));
    }

    @Test
    public void repeat_separator_v06() {
        assertEquals("", solution.repeatSeparator("AAA", "", 0));
    }

    @Test
    public void repeat_separator_v07() {
        assertEquals("ABABABABA", solution.repeatSeparator("A", "B", 5));
    }

    @Test
    public void repeat_separator_v08() {
        assertEquals("abcXXabcXXabc", solution.repeatSeparator("abc", "XX", 3));
    }

    @Test
    public void repeat_separator_v09() {
        assertEquals("abcXXabc", solution.repeatSeparator("abc", "XX", 2));
    }

    @Test
    public void repeat_separator_v10() {
        assertEquals("abc", solution.repeatSeparator("abc", "XX", 1));
    }

    @Test
    public void repeat_separator_v11() {
        assertEquals("XYZaXYZ", solution.repeatSeparator("XYZ", "a", 2));
    }
}
