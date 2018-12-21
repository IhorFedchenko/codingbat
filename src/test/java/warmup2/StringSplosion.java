package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSplosion {

    @Test
    public void string_splosion_v01(){
        Solution solution = new Solution();
        assertEquals("CCoCodCode", solution.stringSplosion("Code"));
    }

    @Test
    public void string_splosion_v02(){
        Solution solution = new Solution();
        assertEquals("aababc", solution.stringSplosion("abc"));
    }

    @Test
    public void string_splosion_v03(){
        Solution solution = new Solution();
        assertEquals("aab", solution.stringSplosion("ab"));
    }

    @Test
    public void string_splosion_v04(){
        Solution solution = new Solution();
        assertEquals("x", solution.stringSplosion("x"));
    }

    @Test
    public void string_splosion_v05(){
        Solution solution = new Solution();
        assertEquals("ffafadfade", solution.stringSplosion("fade"));
    }

    @Test
    public void string_splosion_v06(){
        Solution solution = new Solution();
        assertEquals("TThTheTherThere", solution.stringSplosion("There"));
    }

    @Test
    public void string_splosion_v07(){
        Solution solution = new Solution();
        assertEquals("KKiKitKittKitteKitten", solution.stringSplosion("Kitten"));
    }

    @Test
    public void string_splosion_v08(){
        Solution solution = new Solution();
        assertEquals("BByBye", solution.stringSplosion("Bye"));
    }

    @Test
    public void string_splosion_v09(){
        Solution solution = new Solution();
        assertEquals("GGoGooGood", solution.stringSplosion("Good"));
    }

    @Test
    public void string_splosion_v10(){
        Solution solution = new Solution();
        assertEquals("BBaBad", solution.stringSplosion("Bad"));
    }
}
