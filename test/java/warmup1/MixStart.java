package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MixStart {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void mixStart_mix_snacks() {
        assertTrue(solution.mixStart("mix snacks"));
    }

    @Test
    public void mixStart_pix_snacks() {
        assertTrue(solution.mixStart("pix snacks"));
    }

    @Test
    public void mixStart_piz_snacks() {
        assertFalse(solution.mixStart("piz snacks"));
    }

    @Test
    public void mixStart_nix() {
        assertTrue(solution.mixStart("nix"));
    }

    @Test
    public void mixStart_ni() {
        assertFalse(solution.mixStart("ni"));
    }

    @Test
    public void mixStart_mix_n() {
        assertFalse(solution.mixStart("n"));
    }

    @Test
    public void mixStart_mix___() {
        assertFalse(solution.mixStart(""));
    }
}
