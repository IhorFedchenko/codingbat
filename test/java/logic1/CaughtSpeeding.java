package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaughtSpeeding {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void caught_speeding_v01() {
        assertEquals(0, solution.caughtSpeeding(60, false));
    }

    @Test
    public void caught_speeding_v02() {
        assertEquals(1, solution.caughtSpeeding(65, false));
    }

    @Test
    public void caught_speeding_v03() {
        assertEquals(0, solution.caughtSpeeding(65, true));
    }

    @Test
    public void caught_speeding_v04() {
        assertEquals(1, solution.caughtSpeeding(80, false));
    }

    @Test
    public void caught_speeding_v05() {
        assertEquals(2, solution.caughtSpeeding(85, false));
    }

    @Test
    public void caught_speeding_v06() {
        assertEquals(1, solution.caughtSpeeding(85, true));
    }

    @Test
    public void caught_speeding_v07() {
        assertEquals(1, solution.caughtSpeeding(70, false));
    }

    @Test
    public void caught_speeding_v08() {
        assertEquals(1, solution.caughtSpeeding(75, false));
    }

    @Test
    public void caught_speeding_v09() {
        assertEquals(1, solution.caughtSpeeding(75, true));
    }

    @Test
    public void caught_speeding_v10() {
        assertEquals(0, solution.caughtSpeeding(40, false));
    }

    @Test
    public void caught_speeding_v11() {
        assertEquals(0, solution.caughtSpeeding(40, true));
    }

    @Test
    public void caught_speeding_v12() {
        assertEquals(2, solution.caughtSpeeding(90, false));
    }
}
