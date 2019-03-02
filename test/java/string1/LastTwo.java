package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastTwo {

    @Test
    public void last_two_coding(){
        Solution solution = new Solution();
        assertEquals("codign", solution.lastTwo("coding"));
    }

    @Test
    public void last_two_cat(){
        Solution solution = new Solution();
        assertEquals("cta", solution.lastTwo("cat"));
    }

    @Test
    public void last_two_ba(){
        Solution solution = new Solution();
        assertEquals("ba", solution.lastTwo("ab"));
    }

    @Test
    public void last_two_a(){
        Solution solution = new Solution();
        assertEquals("a", solution.lastTwo("a"));
    }

    @Test
    public void last_two__(){
        Solution solution = new Solution();
        assertEquals("", solution.lastTwo(""));
    }
}
