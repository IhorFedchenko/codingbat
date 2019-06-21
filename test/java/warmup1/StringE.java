package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringE {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void stringE_Hello() {
        assertTrue(solution.stringE("Hello"));
    }

    @Test
    public void stringE_Heelle() {
        assertTrue(solution.stringE("Heelle"));
    }

    @Test
    public void stringE_Heelele() {
        assertFalse(solution.stringE("Heelele"));
    }

    @Test
    public void stringE_Hll() {
        assertFalse(solution.stringE("Hll"));
    }

    @Test
    public void stringE_e() {
        assertTrue(solution.stringE("e"));
    }

    @Test
    public void stringE__() {
        assertFalse(solution.stringE(""));
    }
}
