package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndOther {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void end_other_v01() {
        assertTrue(solution.endOther("Hiabc", "abc"));
    }

    @Test
    public void end_other_v02() {
        assertTrue(solution.endOther("AbC", "HiaBc"));
    }

    @Test
    public void end_other_v03() {
        assertTrue(solution.endOther("abc", "abXabc"));
    }

    @Test
    public void end_other_v04() {
        assertFalse(solution.endOther("Hiabc", "abcd"));
    }

    @Test
    public void end_other_v05() {
        assertTrue(solution.endOther("Hiabc", "bc"));
    }

    @Test
    public void end_other_v06() {
        assertFalse(solution.endOther("Hiabcx", "bc"));
    }

    @Test
    public void end_other_v07() {
        assertTrue(solution.endOther("abc", "abc"));
    }

    @Test
    public void end_other_v08() {
        assertTrue(solution.endOther("xyz", "12xyz"));
    }

    @Test
    public void end_other_v09() {
        assertFalse(solution.endOther("yz", "12xz"));
    }

    @Test
    public void end_other_v10() {
        assertTrue(solution.endOther("Z", "12xz"));
    }

    @Test
    public void end_other_v11() {
        assertTrue(solution.endOther("12", "12"));
    }

    @Test
    public void end_other_v12() {
        assertFalse(solution.endOther("abcXYZ", "abcDEF"));
    }

    @Test
    public void end_other_v13() {
        assertFalse(solution.endOther("abcXYZ", "abcDEF"));
    }

    @Test
    public void end_other_v14() {
        assertTrue(solution.endOther("Hiabc", "abc"));
    }
}
