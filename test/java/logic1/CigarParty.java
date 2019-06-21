package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CigarParty {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void cigar_party_30_false() {
        assertFalse(solution.cigarParty(30, false));
    }

    @Test
    public void cigar_party_50_false() {
        assertTrue(solution.cigarParty(50, false));
    }

    @Test
    public void cigar_party_70_true() {
        assertTrue(solution.cigarParty(70, true));
    }

    @Test
    public void cigar_party_30_true() {
        assertFalse(solution.cigarParty(30, true));
    }

    @Test
    public void cigar_party_50_true() {
        assertTrue(solution.cigarParty(50, true));
    }

    @Test
    public void cigar_party_60_false() {
        assertTrue(solution.cigarParty(60, false));
    }

    @Test
    public void cigar_party_61_false() {
        assertFalse(solution.cigarParty(61, false));
    }

    @Test
    public void cigar_party_40_false() {
        assertTrue(solution.cigarParty(40, false));
    }

    @Test
    public void cigar_party_39_false() {
        assertFalse(solution.cigarParty(39, false));
    }

    @Test
    public void cigar_party_40_true() {
        assertTrue(solution.cigarParty(40, true));
    }

    @Test
    public void cigar_party_39_true() {
        assertFalse(solution.cigarParty(39, true));
    }
}
