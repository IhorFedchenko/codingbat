package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTimes {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_times_v01() {
        assertEquals("HiHi", solution.stringTimes("Hi", 2));
    }

    @Test
    public void string_times_v02() {
        assertEquals("HiHiHi", solution.stringTimes("Hi", 3));
    }

    @Test
    public void string_times_v03() {
        assertEquals("Hi", solution.stringTimes("Hi", 1));
    }

    @Test
    public void string_times_v04() {
        assertEquals("", solution.stringTimes("Hi", 0));
    }

    @Test
    public void string_times_v05() {
        assertEquals("HiHiHiHiHi", solution.stringTimes("Hi", 5));
    }

    @Test
    public void string_times_v06() {
        assertEquals("Oh Boy!Oh Boy!", solution.stringTimes("Oh Boy!", 2));
    }

    @Test
    public void string_times_v07() {
        assertEquals("xxxx", solution.stringTimes("x", 4));
    }

    @Test
    public void string_times_v08() {
        assertEquals("", solution.stringTimes("", 4));
    }

    @Test
    public void string_times_v09() {
        assertEquals("codecode", solution.stringTimes("code", 2));
    }

    @Test
    public void string_times_v10() {
        assertEquals("codecodecode", solution.stringTimes("code", 3));
    }
}
