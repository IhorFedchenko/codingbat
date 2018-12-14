package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MixStart {

    @Test
    public void mixStart_mix_snacks(){
        Solution solution = new Solution();
        assertTrue(solution.mixStart("mix snacks"));
    }

    @Test
    public void mixStart_pix_snacks(){
        Solution solution = new Solution();
        assertTrue(solution.mixStart("pix snacks"));
    }

    @Test
    public void mixStart_piz_snacks(){
        Solution solution = new Solution();
        assertFalse(solution.mixStart("piz snacks"));
    }

    @Test
    public void mixStart_nix(){
        Solution solution = new Solution();
        assertTrue(solution.mixStart("nix"));
    }

    @Test
    public void mixStart_ni(){
        Solution solution = new Solution();
        assertFalse(solution.mixStart("ni"));
    }

    @Test
    public void mixStart_mix_n(){
        Solution solution = new Solution();
        assertFalse(solution.mixStart("n"));
    }

    @Test
    public void mixStart_mix___(){
        Solution solution = new Solution();
        assertFalse(solution.mixStart(""));
    }
}
