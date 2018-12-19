package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTimes {

    @Test
    public void string_times_v01(){
        Solution solution = new Solution();
        assertEquals("HiHi", solution.stringTimes("Hi", 2));
    }

    @Test
    public void string_times_v02(){
        Solution solution = new Solution();
        assertEquals("HiHiHi", solution.stringTimes("Hi", 3));
    }

    @Test
    public void string_times_v03(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.stringTimes("Hi", 1));
    }

    @Test
    public void string_times_v04(){
        Solution solution = new Solution();
        assertEquals("", solution.stringTimes("Hi", 0));
    }

    @Test
    public void string_times_v05(){
        Solution solution = new Solution();
        assertEquals("HiHiHiHiHi", solution.stringTimes("Hi", 5));
    }

    @Test
    public void string_times_v06(){
        Solution solution = new Solution();
        assertEquals("Oh Boy!Oh Boy!", solution.stringTimes("Oh Boy!", 2));
    }

    @Test
    public void string_times_v07(){
        Solution solution = new Solution();
        assertEquals("xxxx", solution.stringTimes("x", 4));
    }

    @Test
    public void string_times_v08(){
        Solution solution = new Solution();
        assertEquals("", solution.stringTimes("", 4));
    }

    @Test
    public void string_times_v09(){
        Solution solution = new Solution();
        assertEquals("codecode", solution.stringTimes("code", 2));
    }

    @Test
    public void string_times_v10(){
        Solution solution = new Solution();
        assertEquals("codecodecode", solution.stringTimes("code", 3));
    }
}
