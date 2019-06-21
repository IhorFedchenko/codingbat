package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraEnd {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void extra_end_Hello() {
        assertEquals("lololo", solution.extraEnd("Hello"));
    }

    @Test
    public void extra_end_ab() {
        assertEquals("ababab", solution.extraEnd("ab"));
    }

    @Test
    public void extra_end_Hi() {
        assertEquals("HiHiHi", solution.extraEnd("Hi"));
    }

    @Test
    public void extra_end_Candy() {
        assertEquals("dydydy", solution.extraEnd("Candy"));
    }

    @Test
    public void extra_end_Code() {
        assertEquals("dedede", solution.extraEnd("Code"));
    }
}
