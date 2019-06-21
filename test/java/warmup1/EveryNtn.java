package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EveryNtn {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void everyNth_v01() {
        assertEquals("Mrce", solution.everyNth("Miracle", 2));
    }

    @Test
    public void everyNth_v02() {
        assertEquals("aceg", solution.everyNth("abcdefg", 2));
    }

    @Test
    public void everyNth_v03() {
        assertEquals("adg", solution.everyNth("abcdefg", 3));
    }

    @Test
    public void everyNth_v04() {
        assertEquals("Cca", solution.everyNth("Chocolate", 3));
    }

    @Test
    public void everyNth_v05() {
        assertEquals("Ccas", solution.everyNth("Chocolates", 3));
    }

    @Test
    public void everyNth_v06() {
        assertEquals("Coe", solution.everyNth("Chocolates", 4));
    }

    @Test
    public void everyNth_v07() {
        assertEquals("C", solution.everyNth("Chocolates", 1000));
    }
}
