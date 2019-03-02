package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AltPairs {

    @Test
    public void alt_pairs_v01(){
        Solution solution = new Solution();
        assertEquals("kien", solution.altPairs("kitten"));
    }

    @Test
    public void alt_pairs_v02(){
        Solution solution = new Solution();
        assertEquals("Chole", solution.altPairs("Chocolate"));
    }

    @Test
    public void alt_pairs_v03(){
        Solution solution = new Solution();
        assertEquals("Congrr", solution.altPairs("CodingHorror"));
    }

    @Test
    public void alt_pairs_v04(){
        Solution solution = new Solution();
        assertEquals("ya", solution.altPairs("yak"));
    }

    @Test
    public void alt_pairs_v05(){
        Solution solution = new Solution();
        assertEquals("ya", solution.altPairs("ya"));
    }

    @Test
    public void alt_pairs_v06(){
        Solution solution = new Solution();
        assertEquals("y", solution.altPairs("y"));
    }

    @Test
    public void alt_pairs_v07(){
        Solution solution = new Solution();
        assertEquals("", solution.altPairs(""));
    }

    @Test
    public void alt_pairs_v08(){
        Solution solution = new Solution();
        assertEquals("ThThThth", solution.altPairs("ThisThatTheOther"));
    }
}
