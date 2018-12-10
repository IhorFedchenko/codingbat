package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Front22 {

    @Test
    public void front22_kitten(){
        Solution solution = new Solution();
        assertEquals("kikittenki", solution.front22("kitten"));
    }

    @Test
    public void front22_Ha(){
        Solution solution = new Solution();
        assertEquals("HaHaHa", solution.front22("Ha"));
    }

    @Test
    public void front22_abc(){
        Solution solution = new Solution();
        assertEquals("ababcab", solution.front22("abc"));
    }

    @Test
    public void front22_ab(){
        Solution solution = new Solution();
        assertEquals("ababab", solution.front22("ab"));
    }

    @Test
    public void front22_a(){
        Solution solution = new Solution();
        assertEquals("aaa", solution.front22("a"));
    }

    @Test
    public void front22_(){
        Solution solution = new Solution();
        assertEquals("", solution.front22(""));
    }

    @Test
    public void front22_Logic(){
        Solution solution = new Solution();
        assertEquals("LoLogicLo", solution.front22("Logic"));
    }
}
