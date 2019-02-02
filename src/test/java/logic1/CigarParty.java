package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CigarParty {

    @Test
    public void cigar_party_30_false(){
        Solution solution = new Solution();
        assertFalse(solution.cigarParty(30, false));
    }

    @Test
    public void cigar_party_50_false(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(50, false));
    }

    @Test
    public void cigar_party_70_true(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(70, true));
    }

    @Test
    public void cigar_party_30_true(){
        Solution solution = new Solution();
        assertFalse(solution.cigarParty(30, true));
    }

    @Test
    public void cigar_party_50_true(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(50, true));
    }

    @Test
    public void cigar_party_60_false(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(60, false));
    }

    @Test
    public void cigar_party_61_false(){
        Solution solution = new Solution();
        assertFalse(solution.cigarParty(61, false));
    }

    @Test
    public void cigar_party_40_false(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(40, false));
    }

    @Test
    public void cigar_party_39_false(){
        Solution solution = new Solution();
        assertFalse(solution.cigarParty(39, false));
    }

    @Test
    public void cigar_party_40_true(){
        Solution solution = new Solution();
        assertTrue(solution.cigarParty(40, true));
    }

    @Test
    public void cigar_party_39_true(){
        Solution solution = new Solution();
        assertFalse(solution.cigarParty(39, true));
    }
}
