package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarOut {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void star_out_v01() {
        assertEquals("ad", solution.starOut("ab*cd"));
    }

    @Test
    public void star_out_v02() {
        assertEquals("ad", solution.starOut("ab**cd"));
    }

    @Test
    public void star_out_v03() {
        assertEquals("silly", solution.starOut("sm*eilly"));
    }

    @Test
    public void star_out_v04() {
        assertEquals("siy", solution.starOut("sm*eil*ly"));
    }

    @Test
    public void star_out_v05() {
        assertEquals("siy", solution.starOut("sm**eil*ly"));
    }

    @Test
    public void star_out_v06() {
        assertEquals("siy", solution.starOut("sm***eil*ly"));
    }

    @Test
    public void star_out_v07() {
        assertEquals("string", solution.starOut("stringy*"));
    }

    @Test
    public void star_out_v08() {
        assertEquals("tringy", solution.starOut("*stringy"));
    }

    @Test
    public void star_out_v09() {
        assertEquals("ty", solution.starOut("*str*in*gy"));
    }

    @Test
    public void star_out_v10() {
        assertEquals("abc", solution.starOut("abc"));
    }

    @Test
    public void star_out_v11() {
        assertEquals("c", solution.starOut("a*bc"));
    }

    @Test
    public void star_out_v12() {
        assertEquals("ab", solution.starOut("ab"));
    }

    @Test
    public void star_out_v13() {
        assertEquals("", solution.starOut("a*b"));
    }

    @Test
    public void star_out_v14() {
        assertEquals("a", solution.starOut("a"));
    }

    @Test
    public void star_out_v15() {
        assertEquals("", solution.starOut("a*"));
    }

    @Test
    public void star_out_v16() {
        assertEquals("", solution.starOut("*a"));
    }

    @Test
    public void star_out_v17() {
        assertEquals("", solution.starOut("*"));
    }

    @Test
    public void star_out_v18() {
        assertEquals("", solution.starOut(""));
    }
}
