package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Last2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void last2_v01() {
        assertEquals(1, solution.last2("hixxhi"));
    }

    @Test
    public void last2_v02() {
        assertEquals(1, solution.last2("xaxxaxaxx"));
    }

    @Test
    public void last2_v03() {
        assertEquals(2, solution.last2("axxxaaxx"));
    }

    @Test
    public void last2_v04() {
        assertEquals(3, solution.last2("xxaxxaxxaxx"));
    }

    @Test
    public void last2_v05() {
        assertEquals(0, solution.last2("xaxaxaxx"));
    }

    @Test
    public void last2_v06() {
        assertEquals(2, solution.last2("xxxx"));
    }

    @Test
    public void last2_v07() {
        assertEquals(1, solution.last2("13121312"));
    }

    @Test
    public void last2_v08() {
        assertEquals(1, solution.last2("11212"));
    }

    @Test
    public void last2_v09() {
        assertEquals(0, solution.last2("13121311"));
    }

    @Test
    public void last2_v10() {
        assertEquals(2, solution.last2("1717171"));
    }

    @Test
    public void last2_v11() {
        assertEquals(0, solution.last2("hi"));
    }

    @Test
    public void last2_v12() {
        assertEquals(0, solution.last2("h"));
    }

    @Test
    public void last2_v13() {
        assertEquals(0, solution.last2(""));
    }
}
