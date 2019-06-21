package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSplosion {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_splosion_v01() {
        assertEquals("CCoCodCode", solution.stringSplosion("Code"));
    }

    @Test
    public void string_splosion_v02() {
        assertEquals("aababc", solution.stringSplosion("abc"));
    }

    @Test
    public void string_splosion_v03() {
        assertEquals("aab", solution.stringSplosion("ab"));
    }

    @Test
    public void string_splosion_v04() {
        assertEquals("x", solution.stringSplosion("x"));
    }

    @Test
    public void string_splosion_v05() {
        assertEquals("ffafadfade", solution.stringSplosion("fade"));
    }

    @Test
    public void string_splosion_v06() {
        assertEquals("TThTheTherThere", solution.stringSplosion("There"));
    }

    @Test
    public void string_splosion_v07() {
        assertEquals("KKiKitKittKitteKitten", solution.stringSplosion("Kitten"));
    }

    @Test
    public void string_splosion_v08() {
        assertEquals("BByBye", solution.stringSplosion("Bye"));
    }

    @Test
    public void string_splosion_v09() {
        assertEquals("GGoGooGood", solution.stringSplosion("Good"));
    }

    @Test
    public void string_splosion_v10() {
        assertEquals("BBaBad", solution.stringSplosion("Bad"));
    }
}
