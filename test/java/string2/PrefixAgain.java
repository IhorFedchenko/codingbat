package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrefixAgain {

    Solution solution = new Solution();

    @Test
    public void prefix_again_v01() {
        assertTrue(solution.prefixAgain("abXYabc", 1));
    }

    @Test
    public void prefix_again_v02() {
        assertTrue(solution.prefixAgain("abXYabc", 2));
    }

    @Test
    public void prefix_again_v03() {
        assertFalse(solution.prefixAgain("abXYabc", 3));
    }

    @Test
    public void prefix_again_v04() {
        assertTrue(solution.prefixAgain("xyzxyxyxy", 2));
    }

    @Test
    public void prefix_again_v05() {
        assertFalse(solution.prefixAgain("xyzxyxyxy", 3));
    }

    @Test
    public void prefix_again_v06() {
        assertTrue(solution.prefixAgain("Hi12345Hi6789Hi10", 1));
    }

    @Test
    public void prefix_again_v07() {
        assertTrue(solution.prefixAgain("Hi12345Hi6789Hi10", 2));
    }

    @Test
    public void prefix_again_v08() {
        assertTrue(solution.prefixAgain("Hi12345Hi6789Hi10", 3));
    }
    @Test
    public void prefix_again_v09() {
        assertFalse(solution.prefixAgain("Hi12345Hi6789Hi10", 4));
    }

    @Test
    public void prefix_again_v10() {
        assertFalse(solution.prefixAgain("a", 1));
    }

    @Test
    public void prefix_again_v11() {
        assertTrue(solution.prefixAgain("aa", 1));
    }

    @Test
    public void prefix_again_v12() {
        assertFalse(solution.prefixAgain("ab", 1));
    }

}
