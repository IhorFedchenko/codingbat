package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutString {

    Solution solution = new Solution();

    @Test
    public void without_string_v01() {
        assertEquals("He there", solution.withoutString("Hello there", "llo"));
    }

    @Test
    public void without_string_v02() {
        assertEquals("Hllo thr", solution.withoutString("Hello there", "e"));
    }

    @Test
    public void without_string_v03() {
        assertEquals("Hello there", solution.withoutString("Hello there", "x"));
    }

    @Test
    public void without_string_v04() {
        assertEquals("Th  a FH", solution.withoutString("This is a FISH", "IS"));
    }

    @Test
    public void without_string_v05() {
        assertEquals("TH  a FH", solution.withoutString("THIS is a FISH", "is"));
    }

    @Test
    public void without_string_v06() {
        assertEquals("TH  a FH", solution.withoutString("THIS is a FISH", "iS"));
    }

    @Test
    public void without_string_v07() {
        assertEquals("abab", solution.withoutString("abxxxxab", "xx"));
    }

    @Test
    public void without_string_v08() {
        assertEquals("abxab", solution.withoutString("abxxxab", "xx"));
    }

    @Test
    public void without_string_v09() {
        assertEquals("abab", solution.withoutString("abxxxab", "x"));
    }

    @Test
    public void without_string_v10() {
        assertEquals("", solution.withoutString("xxx", "x"));
    }

    @Test
    public void without_string_v11() {
        assertEquals("x", solution.withoutString("xxx", "xx"));
    }

    @Test
    public void without_string_v12() {
        assertEquals("xzz", solution.withoutString("xyzzy", "Y"));
    }

    @Test
    public void without_string_v13() {
        assertEquals("", solution.withoutString("", "x"));
    }

    @Test
    public void without_string_v14() {
        assertEquals("acac", solution.withoutString("abcabc", "b"));
    }

    @Test
    public void without_string_v15() {
        assertEquals("AAbb", solution.withoutString("AA22bb", "2"));
    }

    @Test
    public void without_string_v16() {
        assertEquals("", solution.withoutString("1111", "1"));
    }

    @Test
    public void without_string_v17() {
        assertEquals("", solution.withoutString("1111", "11"));
    }

    @Test
    public void without_string_v18() {
        assertEquals("jtx", solution.withoutString("MkjtMkx", "Mk"));
    }

    @Test
    public void without_string_v19() {
        assertEquals("Hi ", solution.withoutString("Hi HoHo", "Ho"));
    }
}
