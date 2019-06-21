package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsIsNot {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void equals_is_not_v01() {
        assertFalse(solution.equalIsNot("This is not"));
    }

    @Test
    public void equals_is_not_v02() {
        assertTrue(solution.equalIsNot("This is notnot"));
    }

    @Test
    public void equals_is_not_v03() {
        assertTrue(solution.equalIsNot("noisxxnotyynotxisi"));
    }

    @Test
    public void equals_is_not_v04() {
        assertFalse(solution.equalIsNot("noisxxnotyynotxsi"));
    }

    @Test
    public void equals_is_not_v05() {
        assertTrue(solution.equalIsNot("xxxyyyzzzintint"));
    }

    @Test
    public void equals_is_not_v06() {
        assertTrue(solution.equalIsNot(""));
    }

    @Test
    public void equals_is_not_v07() {
        assertTrue(solution.equalIsNot("isisnotnot"));
    }

    @Test
    public void equals_is_not_v08() {
        assertFalse(solution.equalIsNot("isisnotno7Not"));
    }

    @Test
    public void equals_is_not_v09() {
        assertFalse(solution.equalIsNot("isnotis"));
    }

    @Test
    public void equals_is_not_v10() {
        assertFalse(solution.equalIsNot("mis3notpotbotis"));
    }
}
