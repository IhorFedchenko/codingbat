package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwo {

    @Test
    public void middle_two_string(){
        Solution solution = new Solution();
        assertEquals("ri", solution.middleTwo("string"));
    }

    @Test
    public void middle_two_code(){
        Solution solution = new Solution();
        assertEquals("od", solution.middleTwo("code"));
    }

    @Test
    public void middle_two_Practice(){
        Solution solution = new Solution();
        assertEquals("ct", solution.middleTwo("Practice"));
    }

    @Test
    public void middle_two_ab(){
        Solution solution = new Solution();
        assertEquals("ab", solution.middleTwo("ab"));
    }

    @Test
    public void middle_two_0123456789(){
        Solution solution = new Solution();
        assertEquals("45", solution.middleTwo("0123456789"));
    }
}
