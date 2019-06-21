package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneTwo {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void one_two_v01() {
        assertEquals("bca", solution.oneTwo("abc"));
    }

    @Test
    public void one_two_v02() {
        assertEquals("cat", solution.oneTwo("tca"));
    }

    @Test
    public void one_two_v03() {
        assertEquals("catdog", solution.oneTwo("tcagdo"));
    }

    @Test
    public void one_two_v04() {
        assertEquals("hocolctea", solution.oneTwo("chocolate"));
    }

    @Test
    public void one_two_v05() {
        assertEquals("231564897", solution.oneTwo("1234567890"));
    }

    @Test
    public void one_two_v06() {
        assertEquals("abxabxabxabxabxabxabx", solution.oneTwo("xabxabxabxabxabxabxab"));
    }

    @Test
    public void one_two_v07() {
        assertEquals("bcaefd", solution.oneTwo("abcdefx"));
    }

    @Test
    public void one_two_v08() {
        assertEquals("bcaefd", solution.oneTwo("abcdefxy"));
    }

    @Test
    public void one_two_v09() {
        assertEquals("bcaefdyzx", solution.oneTwo("abcdefxyz"));
    }

    @Test
    public void one_two_v10() {
        assertEquals("", solution.oneTwo(""));
    }

    @Test
    public void one_two_v11() {
        assertEquals("", solution.oneTwo("x"));
    }

    @Test
    public void one_two_v12() {
        assertEquals("", solution.oneTwo("xy"));
    }

    @Test
    public void one_two_v13() {
        assertEquals("yzx", solution.oneTwo("xyz"));
    }

    @Test
    public void one_two_v14() {
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", solution.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890"));
    }

    @Test
    public void one_two_v15() {
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", solution.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789"));
    }

    @Test
    public void one_two_v16() {
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564", solution.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"));
    }
}
