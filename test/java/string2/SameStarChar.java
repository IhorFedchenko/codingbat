package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameStarChar {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void same_star_char_v01() {
        assertTrue(solution.sameStarChar("xy*yzz"));
    }

    @Test
    public void same_star_char_v02() {
        assertFalse(solution.sameStarChar("xy*zzz"));
    }

    @Test
    public void same_star_char_v03() {
        assertTrue(solution.sameStarChar("*xa*az"));
    }

    @Test
    public void same_star_char_v04() {
        assertFalse(solution.sameStarChar("*xa*bz"));
    }

    @Test
    public void same_star_char_v05() {
        assertTrue(solution.sameStarChar("*xa*a*"));
    }

    @Test
    public void same_star_char_v06() {
        assertTrue(solution.sameStarChar("*xa*a*a"));
    }

    @Test
    public void same_star_char_v07() {
        assertTrue(solution.sameStarChar(""));
    }

    @Test
    public void same_star_char_v08() {
        assertFalse(solution.sameStarChar("*xa*a*b"));
    }

    @Test
    public void same_star_char_v09() {
        assertTrue(solution.sameStarChar("*12*2*2"));
    }

    @Test
    public void same_star_char_v10() {
        assertFalse(solution.sameStarChar("12*2*3*"));
    }

    @Test
    public void same_star_char_v11() {
        assertTrue(solution.sameStarChar("abcDEF"));
    }

    @Test
    public void same_star_char_v12() {
        assertFalse(solution.sameStarChar("XY*YYYY*Z*"));
    }

    @Test
    public void same_star_char_v13() {
        assertTrue(solution.sameStarChar("XY*YYYY*Y*"));
    }

    @Test
    public void same_star_char_v14() {
        assertFalse(solution.sameStarChar("12*2*3*"));
    }

    @Test
    public void same_star_char_v15() {
        assertTrue(solution.sameStarChar("*"));
    }

    @Test
    public void same_star_char_v16() {
        assertTrue(solution.sameStarChar("**"));
    }
}
