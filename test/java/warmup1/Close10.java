package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Close10 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void close_v1() {
        assertEquals(8, solution.close10(8, 13));
    }

    @Test
    public void close_v2() {
        assertEquals(8, solution.close10(13, 8));
    }

    @Test
    public void close_v3() {
        assertEquals(0, solution.close10(13, 7));
    }

    @Test
    public void close_v4() {
        assertEquals(0, solution.close10(13, 7));
    }

    @Test
    public void close_v5() {
        assertEquals(9, solution.close10(9, 13));
    }

    @Test
    public void close_v6() {
        assertEquals(8, solution.close10(13, 8));
    }

    @Test
    public void close_v7() {
        assertEquals(10, solution.close10(10, 12));
    }

    @Test
    public void close_v8() {
        assertEquals(10, solution.close10(11, 10));
    }

    @Test
    public void close_v9() {
        assertEquals(5, solution.close10(5, 21));
    }

    @Test
    public void close_v10() {
        assertEquals(0, solution.close10(0, 20));
    }

    @Test
    public void close_v11() {
        assertEquals(0, solution.close10(10, 10));
    }
}
