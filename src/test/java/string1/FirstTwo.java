package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTwo {

    @Test
    public void first_two_v01(){
        Solution solution = new Solution();
        assertEquals("He", solution.firstTwo("Hello"));
    }

    @Test
    public void first_two_v02(){
        Solution solution = new Solution();
        assertEquals("ab", solution.firstTwo("abcdefg"));
    }

    @Test
    public void first_two_v03(){
        Solution solution = new Solution();
        assertEquals("ab", solution.firstTwo("ab"));
    }

    @Test
    public void first_two_v04(){
        Solution solution = new Solution();
        assertEquals("a", solution.firstTwo("a"));
    }

    @Test
    public void first_two_v05(){
        Solution solution = new Solution();
        assertEquals("", solution.firstTwo(""));
    }

    @Test
    public void first_two_v06(){
        Solution solution = new Solution();
        assertEquals("Ki", solution.firstTwo("Kitten"));
    }

    @Test
    public void first_two_v07(){
        Solution solution = new Solution();
        assertEquals("hi", solution.firstTwo("hi"));
    }

    @Test
    public void first_two_v08(){
        Solution solution = new Solution();
        assertEquals("hi", solution.firstTwo("hiya"));
    }
}
