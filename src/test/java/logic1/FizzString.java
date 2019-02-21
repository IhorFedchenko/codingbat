package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzString {

    @Test
    public void fiss_string_fig(){
        Solution solution = new Solution();
        assertEquals("Fizz", solution.fizzString("fig"));
    }

    @Test
    public void fiss_string_dib(){
        Solution solution = new Solution();
        assertEquals("Buzz", solution.fizzString("dib"));
    }

    @Test
    public void fiss_string_fib(){
        Solution solution = new Solution();
        assertEquals("FizzBuzz", solution.fizzString("fib"));
    }

    @Test
    public void fiss_string_abc(){
        Solution solution = new Solution();
        assertEquals("abc", solution.fizzString("abc"));
    }

    @Test
    public void fiss_string_fooo(){
        Solution solution = new Solution();
        assertEquals("Fizz", solution.fizzString("fooo"));
    }

    @Test
    public void fiss_string_booo(){
        Solution solution = new Solution();
        assertEquals("booo", solution.fizzString("booo"));
    }

    @Test
    public void fiss_string_ooob(){
        Solution solution = new Solution();
        assertEquals("Buzz", solution.fizzString("ooob"));
    }

    @Test
    public void fiss_string_fooob(){
        Solution solution = new Solution();
        assertEquals("FizzBuzz", solution.fizzString("fooob"));
    }

    @Test
    public void fiss_string_f(){
        Solution solution = new Solution();
        assertEquals("Fizz", solution.fizzString("f"));
    }

    @Test
    public void fiss_string_b(){
        Solution solution = new Solution();
        assertEquals("Buzz", solution.fizzString("b"));
    }

    @Test
    public void fiss_string_abcd(){
        Solution solution = new Solution();
        assertEquals("abcd", solution.fizzString("abcd"));
    }

    @Test
    public void fiss_string_Hello(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.fizzString("Hello"));
    }

    @Test
    public void fiss_string_Hellob(){
        Solution solution = new Solution();
        assertEquals("Buzz", solution.fizzString("Hellob"));
    }

    @Test
    public void fiss_string_af(){
        Solution solution = new Solution();
        assertEquals("af", solution.fizzString("af"));
    }

    @Test
    public void fiss_string_bf(){
        Solution solution = new Solution();
        assertEquals("bf", solution.fizzString("bf"));
    }

    @Test
    public void fiss_string_fb(){
        Solution solution = new Solution();
        assertEquals("FizzBuzz", solution.fizzString("fb"));
    }
}
