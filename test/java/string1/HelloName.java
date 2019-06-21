package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloName {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void nello_name_Bob() {
        Solution solution = new Solution();
        assertEquals("Hello Bob!", solution.helloName("Bob"));
    }

    @Test
    public void nello_name_Alice() {
        Solution solution = new Solution();
        assertEquals("Hello Alice!", solution.helloName("Alice"));
    }

    @Test
    public void nello_name_X() {
        Solution solution = new Solution();
        assertEquals("Hello X!", solution.helloName("X"));
    }

    @Test
    public void nello_name_Dolly() {
        Solution solution = new Solution();
        assertEquals("Hello Dolly!", solution.helloName("Dolly"));
    }

    @Test
    public void nello_name_Alpha() {
        Solution solution = new Solution();
        assertEquals("Hello Alpha!", solution.helloName("Alpha"));
    }

    @Test
    public void nello_name_Omega() {
        Solution solution = new Solution();
        assertEquals("Hello Omega!", solution.helloName("Omega"));
    }

    @Test
    public void nello_name_Goodbye() {
        Solution solution = new Solution();
        assertEquals("Hello Goodbye!", solution.helloName("Goodbye"));
    }

    @Test
    public void nello_name_ho_ho_ho() {
        Solution solution = new Solution();
        assertEquals("Hello ho ho ho!", solution.helloName("ho ho ho"));
    }

    @Test
    public void nello_name_xyz() {
        Solution solution = new Solution();
        assertEquals("Hello xyz!", solution.helloName("xyz"));
    }

    @Test
    public void nello_name_Hello() {
        Solution solution = new Solution();
        assertEquals("Hello Hello!", solution.helloName("Hello"));
    }
}
