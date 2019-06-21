package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountHi {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void count_hi_v01() {
        assertEquals(1, solution.countHi("abc hi ho"));
    }

    @Test
    public void count_hi_v02() {
        assertEquals(2, solution.countHi("ABChi hi"));
    }

    @Test
    public void count_hi_v03() {
        assertEquals(2, solution.countHi("hihi"));
    }

    @Test
    public void count_hi_v04() {
        assertEquals(2, solution.countHi("hiHIhi"));
    }

    @Test
    public void count_hi_v05() {
        assertEquals(0, solution.countHi(""));
    }

    @Test
    public void count_hi_v06() {
        assertEquals(0, solution.countHi("h"));
    }

    @Test
    public void count_hi_v07() {
        assertEquals(1, solution.countHi("hi"));
    }

    @Test
    public void count_hi_v08() {
        assertEquals(0, solution.countHi("Hi is no HI on ahI"));
    }

    @Test
    public void count_hi_v09() {
        assertEquals(2, solution.countHi("hiho not HOHIhi"));
    }
}
