package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatch {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_match_v01() {
        assertEquals(3, solution.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void string_match_v02() {
        assertEquals(2, solution.stringMatch("abc", "abc"));
    }

    @Test
    public void string_match_v03() {
        assertEquals(0, solution.stringMatch("abc", "axc"));
    }

    @Test
    public void string_match_v04() {
        assertEquals(1, solution.stringMatch("hello", "he"));
    }

    @Test
    public void string_match_v05() {
        assertEquals(1, solution.stringMatch("he", "hello"));
    }

    @Test
    public void string_match_v06() {
        assertEquals(0, solution.stringMatch("h", "xxbaaz"));
    }

    @Test
    public void string_match_v07() {
        assertEquals(0, solution.stringMatch("", "hello"));
    }

    @Test
    public void string_match_v08() {
        assertEquals(1, solution.stringMatch("aabbccdd", "abbbxxd"));
    }

    @Test
    public void string_match_v09() {
        assertEquals(3, solution.stringMatch("aaxxaaxx", "iaxxai"));
    }

    @Test
    public void string_match_v10() {
        assertEquals(3, solution.stringMatch("iaxxai", "aaxxaaxx"));
    }
}
