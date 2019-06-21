package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwo {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void middle_two_string() {
        assertEquals("ri", solution.middleTwo("string"));
    }

    @Test
    public void middle_two_code() {
        assertEquals("od", solution.middleTwo("code"));
    }

    @Test
    public void middle_two_Practice() {
        assertEquals("ct", solution.middleTwo("Practice"));
    }

    @Test
    public void middle_two_ab() {
        assertEquals("ab", solution.middleTwo("ab"));
    }

    @Test
    public void middle_two_0123456789() {
        assertEquals("45", solution.middleTwo("0123456789"));
    }
}
