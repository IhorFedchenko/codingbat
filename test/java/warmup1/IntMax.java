package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntMax {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void intMax_v1() {
        assertEquals(3, solution.intMax(1, 2, 3));
    }

    @Test
    public void intMax_v2() {
        assertEquals(3, solution.intMax(1, 3, 2));
    }

    @Test
    public void intMax_v3() {
        assertEquals(3, solution.intMax(3, 2, 1));
    }

    @Test
    public void intMax_v4() {
        assertEquals(9, solution.intMax(9, 3, 3));
    }

    @Test
    public void intMax_v5() {
        assertEquals(9, solution.intMax(3, 9, 3));
    }

    @Test
    public void intMax_v6() {
        assertEquals(9, solution.intMax(3, 3, 9));
    }

    @Test
    public void intMax_v7() {
        assertEquals(8, solution.intMax(8, 2, 3));
    }

    @Test
    public void intMax_v8() {
        assertEquals(-1, solution.intMax(-3, -1, -2));
    }

    @Test
    public void intMax_v9() {
        assertEquals(6, solution.intMax(6, 2, 5));
    }

    @Test
    public void intMax_v10() {
        assertEquals(6, solution.intMax(5, 6, 2));
    }

    @Test
    public void intMax_v11() {
        assertEquals(6, solution.intMax(5, 2, 6));
    }


}
