package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutEnd2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without_end_v01() {
        assertEquals("ell", solution.withoutEnd2("Hello"));
    }

    @Test
    public void without_end_v02() {
        assertEquals("b", solution.withoutEnd2("abc"));
    }

    @Test
    public void without_end_v03() {
        assertEquals("", solution.withoutEnd2("ab"));
    }

    @Test
    public void without_end_v04() {
        assertEquals("", solution.withoutEnd2("a"));
    }

    @Test
    public void without_end_v05() {
        assertEquals("", solution.withoutEnd2(""));
    }

    @Test
    public void without_end_v06() {
        assertEquals("old", solution.withoutEnd2("coldy"));
    }

    @Test
    public void without_end_v07() {
        assertEquals("ava cod", solution.withoutEnd2("java code"));
    }
}
