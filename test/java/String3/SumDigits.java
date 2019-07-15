package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDigits {

    Solution solution;

    @Before
    public void setup(){
        solution =  new Solution();
    }

    @Test
    public void sum_digits_aa1bc2d3(){
        assertEquals(6, solution.sumDigits("aa1bc2d3"));
    }

    @Test
    public void sum_digits_aa11b33(){
        assertEquals(8, solution.sumDigits("aa11b33"));
    }

    @Test
    public void sum_digits_Chocolate(){
        assertEquals(0, solution.sumDigits("Chocolate"));
    }

    @Test
    public void sum_digits_5hoco1a1e(){
        assertEquals(7, solution.sumDigits("5hoco1a1e"));
    }

    @Test
    public void sum_digits_123abc123(){
        assertEquals(12, solution.sumDigits("123abc123"));
    }

    @Test
    public void sum_digits(){
        assertEquals(0, solution.sumDigits(""));
    }

    @Test
    public void sum_digits_Hello(){
        assertEquals(0, solution.sumDigits("Hello"));
    }

    @Test
    public void sum_digits_X1z9b2(){
        assertEquals(12, solution.sumDigits("X1z9b2"));
    }

    @Test
    public void sum_digits_5432a(){
        assertEquals(14, solution.sumDigits("5432a"));
    }
}
