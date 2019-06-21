package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzString {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void fiss_string_fig() {
        assertEquals("Fizz", solution.fizzString("fig"));
    }

    @Test
    public void fiss_string_dib() {
        assertEquals("Buzz", solution.fizzString("dib"));
    }

    @Test
    public void fiss_string_fib() {
        assertEquals("FizzBuzz", solution.fizzString("fib"));
    }

    @Test
    public void fiss_string_abc() {
        assertEquals("abc", solution.fizzString("abc"));
    }

    @Test
    public void fiss_string_fooo() {
        assertEquals("Fizz", solution.fizzString("fooo"));
    }

    @Test
    public void fiss_string_booo() {
        assertEquals("booo", solution.fizzString("booo"));
    }

    @Test
    public void fiss_string_ooob() {
        assertEquals("Buzz", solution.fizzString("ooob"));
    }

    @Test
    public void fiss_string_fooob() {
        assertEquals("FizzBuzz", solution.fizzString("fooob"));
    }

    @Test
    public void fiss_string_f() {
        assertEquals("Fizz", solution.fizzString("f"));
    }

    @Test
    public void fiss_string_b() {
        assertEquals("Buzz", solution.fizzString("b"));
    }

    @Test
    public void fiss_string_abcd() {
        assertEquals("abcd", solution.fizzString("abcd"));
    }

    @Test
    public void fiss_string_Hello() {
        assertEquals("Hello", solution.fizzString("Hello"));
    }

    @Test
    public void fiss_string_Hellob() {
        assertEquals("Buzz", solution.fizzString("Hellob"));
    }

    @Test
    public void fiss_string_af() {
        assertEquals("af", solution.fizzString("af"));
    }

    @Test
    public void fiss_string_bf() {
        assertEquals("bf", solution.fizzString("bf"));
    }

    @Test
    public void fiss_string_fb() {
        assertEquals("FizzBuzz", solution.fizzString("fb"));
    }
}
