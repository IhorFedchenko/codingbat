package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndsLy {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void ends_ly_v01() {
        assertTrue(solution.endsLy("oddly"));
    }

    @Test
    public void ends_ly_v02() {
        assertFalse(solution.endsLy("y"));
    }

    @Test
    public void ends_ly_v03() {
        assertFalse(solution.endsLy("oddy"));
    }

    @Test
    public void ends_ly_v04() {
        assertFalse(solution.endsLy("oddl"));
    }

    @Test
    public void ends_ly_v05() {
        assertFalse(solution.endsLy("olydd"));
    }

    @Test
    public void ends_ly_v06() {
        assertTrue(solution.endsLy("ly"));
    }

    @Test
    public void ends_ly_v07() {
        assertFalse(solution.endsLy(""));
    }

    @Test
    public void ends_ly_v08() {
        assertFalse(solution.endsLy("falsey"));
    }

    @Test
    public void ends_ly_v09() {
        assertTrue(solution.endsLy("enenly"));
    }
}
