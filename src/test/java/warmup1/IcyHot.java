package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IcyHot {

    @Test
    public void icy_hot_v1(){
        Solution solution = new Solution();
        assertTrue(solution.icyHot(120, -1));
    }

    @Test
    public void icy_hot_v2(){
        Solution solution = new Solution();
        assertTrue(solution.icyHot(-1, 120));
    }

    @Test
    public void icy_hot_v3(){
        Solution solution = new Solution();
        assertFalse(solution.icyHot(2, -120));
    }

    @Test
    public void icy_hot_v4(){
        Solution solution = new Solution();
        assertFalse(solution.icyHot(-1, 100));
    }

    @Test
    public void icy_hot_v5(){
        Solution solution = new Solution();
        assertFalse(solution.icyHot(-2, -2));
    }

    @Test
    public void icy_hot_v6(){
        Solution solution = new Solution();
        assertFalse(solution.icyHot(120, 120));
    }
}
