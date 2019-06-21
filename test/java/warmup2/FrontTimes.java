package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontTimes {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void front_times_v01() {
        assertEquals("ChoCho", solution.frontTimes("Chocolate", 2));
    }

    @Test
    public void front_times_v02() {
        assertEquals("ChoChoCho", solution.frontTimes("Chocolate", 3));
    }

    @Test
    public void front_times_v03() {
        assertEquals("AbcAbcAbc", solution.frontTimes("Abc", 3));
    }

    @Test
    public void front_times_v04() {
        assertEquals("AbAbAbAb", solution.frontTimes("Ab", 4));
    }

    @Test
    public void front_times_v05() {
        assertEquals("AAAA", solution.frontTimes("A", 4));
    }

    @Test
    public void front_times_v06() {
        assertEquals("", solution.frontTimes("", 4));
    }

    @Test
    public void front_times_v07() {
        assertEquals("", solution.frontTimes("Abc", 0));
    }
}
