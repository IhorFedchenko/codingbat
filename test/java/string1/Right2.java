package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Right2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void right2_Hello() {
        assertEquals("loHel", solution.right2("Hello"));
    }

    @Test
    public void right2_java() {
        assertEquals("vaja", solution.right2("java"));
    }

    @Test
    public void right2_Hi() {
        assertEquals("Hi", solution.right2("Hi"));
    }

    @Test
    public void right2_code() {
        assertEquals("deco", solution.right2("code"));
    }

    @Test
    public void right2_cat() {
        assertEquals("atc", solution.right2("cat"));
    }

    @Test
    public void right2_12345() {
        assertEquals("45123", solution.right2("12345"));
    }
}
