package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaughtSpeeding {

    @Test
    public void caught_speeding_v01(){
        Solution solution = new Solution();
        assertEquals(0, solution.caughtSpeeding(60, false));
    }

    @Test
    public void caught_speeding_v02(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(65, false));
    }

    @Test
    public void caught_speeding_v03(){
        Solution solution = new Solution();
        assertEquals(0, solution.caughtSpeeding(65, true));
    }

    @Test
    public void caught_speeding_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(80, false));
    }

    @Test
    public void caught_speeding_v05(){
        Solution solution = new Solution();
        assertEquals(2, solution.caughtSpeeding(85, false));
    }

    @Test
    public void caught_speeding_v06(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(85, true));
    }

    @Test
    public void caught_speeding_v07(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(70, false));
    }

    @Test
    public void caught_speeding_v08(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(75, false));
    }

    @Test
    public void caught_speeding_v09(){
        Solution solution = new Solution();
        assertEquals(1, solution.caughtSpeeding(75, true));
    }

    @Test
    public void caught_speeding_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.caughtSpeeding(40, false));
    }

    @Test
    public void caught_speeding_v11(){
        Solution solution = new Solution();
        assertEquals(0, solution.caughtSpeeding(40, true));
    }

    @Test
    public void caught_speeding_v12(){
        Solution solution = new Solution();
        assertEquals(2, solution.caughtSpeeding(90, false));
    }
}
