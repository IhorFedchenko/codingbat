package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountHi {

    @Test
    public void count_hi_v01(){
        Solution solution = new Solution();
        assertEquals(1, solution.countHi("abc hi ho"));
    }

    @Test
    public void count_hi_v02(){
        Solution solution = new Solution();
        assertEquals(2, solution.countHi("ABChi hi"));
    }

    @Test
    public void count_hi_v03(){
        Solution solution = new Solution();
        assertEquals(2, solution.countHi("hihi"));
    }

    @Test
    public void count_hi_v04(){
        Solution solution = new Solution();
        assertEquals(2, solution.countHi("hiHIhi"));
    }

    @Test
    public void count_hi_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.countHi(""));
    }

    @Test
    public void count_hi_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.countHi("h"));
    }

    @Test
    public void count_hi_v07(){
        Solution solution = new Solution();
        assertEquals(1, solution.countHi("hi"));
    }

    @Test
    public void count_hi_v08(){
        Solution solution = new Solution();
        assertEquals(0, solution.countHi("Hi is no HI on ahI"));
    }

    @Test
    public void count_hi_v09(){
        Solution solution = new Solution();
        assertEquals(2, solution.countHi("hiho not HOHIhi"));
    }
}
