package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Extrafront {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void extra_front_Hello() {
        assertEquals("HeHeHe", solution.extraFront("Hello"));
    }

    @Test
    public void extra_front_ab() {
        assertEquals("ababab", solution.extraFront("ab"));
    }

    @Test
    public void extra_front_H() {
        assertEquals("HHH", solution.extraFront("H"));
    }

    @Test
    public void extra_front__() {
        assertEquals("", solution.extraFront(""));
    }

    @Test
    public void extra_front_Candy() {
        assertEquals("CaCaCa", solution.extraFront("Candy"));
    }

    @Test
    public void extra_front_Code() {
        assertEquals("CoCoCo", solution.extraFront("Code"));
    }
}
