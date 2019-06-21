package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotString {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void notString_candy() {
        assertEquals("not candy", solution.notString("candy"));
    }

    @Test
    public void notString_x() {
        assertEquals("not x", solution.notString("x"));
    }

    @Test
    public void notString_not_bad() {
        assertEquals("not bad", solution.notString("not bad"));
    }

    @Test
    public void notString_bad() {
        assertEquals("not bad", solution.notString("bad"));
    }

    @Test
    public void notString_not() {
        assertEquals("not", solution.notString("not"));
    }

    @Test
    public void notString_is_not() {
        assertEquals("not is not", solution.notString("is not"));
    }

    @Test
    public void notString_no() {
        assertEquals("not no", solution.notString("no"));
    }
}
