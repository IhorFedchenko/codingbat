package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutEnd {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void without_end_Hello() {
        assertEquals("ell", solution.withoutEnd("Hello"));
    }

    @Test
    public void without_end_java() {
        assertEquals("av", solution.withoutEnd("java"));
    }

    @Test
    public void without_end_coding() {
        assertEquals("odin", solution.withoutEnd("coding"));
    }

    @Test
    public void without_end_code() {
        assertEquals("od", solution.withoutEnd("code"));
    }

    @Test
    public void without_end_ad() {
        assertEquals("", solution.withoutEnd("ad"));
    }

    @Test
    public void without_end_Chocolate() {
        assertEquals("hocolate", solution.withoutEnd("Chocolate!"));
    }

    @Test
    public void without_end_kitten() {
        assertEquals("itte", solution.withoutEnd("kitten"));
    }

    @Test
    public void without_end_woohoo() {
        assertEquals("ooho", solution.withoutEnd("woohoo"));
    }
}
