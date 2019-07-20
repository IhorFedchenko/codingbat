package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumNumbers {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void sum_numbers_v01(){
        assertEquals(123, solution.sumNumbers("abc123xyz"));
    }

    @Test
    public void sum_numbers_v02(){
        assertEquals(44, solution.sumNumbers("aa11b33"));
    }

    @Test
    public void sum_numbers_v03(){
        assertEquals(18, solution.sumNumbers("7 11"));
    }

    @Test
    public void sum_numbers_v04(){
        assertEquals(0, solution.sumNumbers("Chocolate"));
    }

    @Test
    public void sum_numbers_v05(){
        assertEquals(7, solution.sumNumbers("5hoco1a1e"));
    }

    @Test
    public void sum_numbers_v06(){
        assertEquals(7, solution.sumNumbers("5$$1;;1!!"));
    }

    @Test
    public void sum_numbers_v07(){
        assertEquals(1245, solution.sumNumbers("a1234bb11"));
    }

    @Test
    public void sum_numbers_v08(){
        assertEquals(0, solution.sumNumbers(""));
    }

    @Test
    public void sum_numbers_v09(){
        assertEquals(25, solution.sumNumbers("a22bbb3"));
    }
}
