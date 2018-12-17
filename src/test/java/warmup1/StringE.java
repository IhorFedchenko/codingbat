package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringE {

    @Test
    public void stringE_Hello(){
        Solution solution = new Solution();
        assertTrue(solution.stringE("Hello"));
    }

    @Test
    public void stringE_Heelle(){
        Solution solution = new Solution();
        assertTrue(solution.stringE("Heelle"));
    }

    @Test
    public void stringE_Heelele(){
        Solution solution = new Solution();
        assertFalse(solution.stringE("Heelele"));
    }

    @Test
    public void stringE_Hll(){
        Solution solution = new Solution();
        assertFalse(solution.stringE("Hll"));
    }

    @Test
    public void stringE_e(){
        Solution solution = new Solution();
        assertTrue(solution.stringE("e"));
    }

    @Test
    public void stringE__(){
        Solution solution = new Solution();
        assertFalse(solution.stringE(""));
    }
}
