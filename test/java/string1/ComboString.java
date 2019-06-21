package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComboString {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void combo_string_v01() {
        assertEquals("hiHellohi", solution.comboString("Hello", "hi"));
    }

    @Test
    public void combo_string_v02() {
        assertEquals("hiHellohi", solution.comboString("hi", "Hello"));
    }

    @Test
    public void combo_string_v03() {
        assertEquals("baaab", solution.comboString("aaa", "b"));
    }

    @Test
    public void combo_string_v04() {
        assertEquals("baaab", solution.comboString("b", "aaa"));
    }

    @Test
    public void combo_string_v05() {
        assertEquals("aaa", solution.comboString("aaa", ""));
    }

    @Test
    public void combo_string_v06() {
        assertEquals("bb", solution.comboString("", "bb"));
    }

    @Test
    public void combo_string_v07() {
        assertEquals("aaa1234aaa", solution.comboString("aaa", "1234"));
    }

    @Test
    public void combo_string_v08() {
        assertEquals("bbaaabb", solution.comboString("aaa", "bb"));
    }

    @Test
    public void combo_string_v09() {
        assertEquals("abba", solution.comboString("a", "bb"));
    }

    @Test
    public void combo_string_v10() {
        assertEquals("abba", solution.comboString("bb", "a"));
    }

    @Test
    public void combo_string_v11() {
        assertEquals("abxyzab", solution.comboString("xyz", "ab"));
    }
}
