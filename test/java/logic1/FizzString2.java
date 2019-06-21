package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzString2 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void fizz_string2_1() {
        assertEquals("1!", solution.fizzString2(1));
    }

    @Test
    public void fizz_string2_2() {
        assertEquals("2!", solution.fizzString2(2));
    }

    @Test
    public void fizz_string2_3() {
        assertEquals("Fizz!", solution.fizzString2(3));
    }

    @Test
    public void fizz_string2_4() {
        assertEquals("4!", solution.fizzString2(4));
    }

    @Test
    public void fizz_string2_5() {
        assertEquals("Buzz!", solution.fizzString2(5));
    }

    @Test
    public void fizz_string2_6() {
        assertEquals("Fizz!", solution.fizzString2(6));
    }

    @Test
    public void fizz_string2_7() {
        assertEquals("7!", solution.fizzString2(7));
    }

    @Test
    public void fizz_string2_8() {
        assertEquals("8!", solution.fizzString2(8));
    }

    @Test
    public void fizz_string2_9() {
        assertEquals("Fizz!", solution.fizzString2(9));
    }

    @Test
    public void fizz_string2_15() {
        assertEquals("FizzBuzz!", solution.fizzString2(15));
    }

    @Test
    public void fizz_string2_16() {
        assertEquals("16!", solution.fizzString2(16));
    }

    @Test
    public void fizz_string2_18() {
        assertEquals("Fizz!", solution.fizzString2(18));
    }

    @Test
    public void fizz_string2_19() {
        assertEquals("19!", solution.fizzString2(19));
    }

    @Test
    public void fizz_string2_21() {
        assertEquals("Fizz!", solution.fizzString2(21));
    }

    @Test
    public void fizz_string2_44() {
        assertEquals("44!", solution.fizzString2(44));
    }

    @Test
    public void fizz_string2_45() {
        assertEquals("FizzBuzz!", solution.fizzString2(45));
    }

    @Test
    public void fizz_string2_100() {
        assertEquals("Buzz!", solution.fizzString2(100));
    }
}
