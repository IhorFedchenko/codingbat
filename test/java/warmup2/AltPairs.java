package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AltPairs {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void alt_pairs_v01() {
        assertEquals("kien", solution.altPairs("kitten"));
    }

    @Test
    public void alt_pairs_v02() {
        assertEquals("Chole", solution.altPairs("Chocolate"));
    }

    @Test
    public void alt_pairs_v03() {
        assertEquals("Congrr", solution.altPairs("CodingHorror"));
    }

    @Test
    public void alt_pairs_v04() {
        assertEquals("ya", solution.altPairs("yak"));
    }

    @Test
    public void alt_pairs_v05() {
        assertEquals("ya", solution.altPairs("ya"));
    }

    @Test
    public void alt_pairs_v06() {
        assertEquals("y", solution.altPairs("y"));
    }

    @Test
    public void alt_pairs_v07() {
        assertEquals("", solution.altPairs(""));
    }

    @Test
    public void alt_pairs_v08() {
        assertEquals("ThThThth", solution.altPairs("ThisThatTheOther"));
    }
}
