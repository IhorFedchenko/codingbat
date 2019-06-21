package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutDoubles {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without_doubles_v01() {
        assertEquals(5, solution.withoutDoubles(2, 3, true));
    }

    @Test
    public void without_doubles_v02() {
        assertEquals(7, solution.withoutDoubles(3, 3, true));
    }

    @Test
    public void without_doubles_v03() {
        assertEquals(6, solution.withoutDoubles(3, 3, false));
    }

    @Test
    public void without_doubles_v04() {
        assertEquals(5, solution.withoutDoubles(2, 3, false));
    }

    @Test
    public void without_doubles_v05() {
        assertEquals(9, solution.withoutDoubles(5, 4, true));
    }

    @Test
    public void without_doubles_v06() {
        assertEquals(9, solution.withoutDoubles(5, 4, false));
    }

    @Test
    public void without_doubles_v07() {
        assertEquals(11, solution.withoutDoubles(5, 5, true));
    }

    @Test
    public void without_doubles_v08() {
        assertEquals(10, solution.withoutDoubles(5, 5, false));
    }

    @Test
    public void without_doubles_v09() {
        assertEquals(7, solution.withoutDoubles(6, 6, true));
    }

    @Test
    public void without_doubles_v10() {
        assertEquals(12, solution.withoutDoubles(6, 6, false));
    }

    @Test
    public void without_doubles_v11() {
        assertEquals(7, solution.withoutDoubles(1, 6, true));
    }

    @Test
    public void without_doubles_v12() {
        assertEquals(7, solution.withoutDoubles(6, 1, false));
    }
}
