package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Front22 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void front22_kitten() {
        assertEquals("kikittenki", solution.front22("kitten"));
    }

    @Test
    public void front22_Ha() {
        assertEquals("HaHaHa", solution.front22("Ha"));
    }

    @Test
    public void front22_abc() {
        assertEquals("ababcab", solution.front22("abc"));
    }

    @Test
    public void front22_ab() {
        assertEquals("ababab", solution.front22("ab"));
    }

    @Test
    public void front22_a() {
        assertEquals("aaa", solution.front22("a"));
    }

    @Test
    public void front22_() {
        assertEquals("", solution.front22(""));
    }

    @Test
    public void front22_Logic() {
        assertEquals("LoLogicLo", solution.front22("Logic"));
    }
}
