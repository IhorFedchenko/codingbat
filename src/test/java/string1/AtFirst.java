package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtFirst {

    @Test
    public void at_first_v01(){
        Solution solution = new Solution();
        assertEquals("he", solution.atFirst("hello"));
    }

    @Test
    public void at_first_v02(){
        Solution solution = new Solution();
        assertEquals("hi", solution.atFirst("hi"));
    }

    @Test
    public void at_first_v03(){
        Solution solution = new Solution();
        assertEquals("h@", solution.atFirst("h"));
    }

    @Test
    public void at_first_v04(){
        Solution solution = new Solution();
        assertEquals("@@", solution.atFirst(""));
    }
    @Test
    public void at_first_v05(){
        Solution solution = new Solution();
        assertEquals("ki", solution.atFirst("kitten"));
    }

    @Test
    public void at_first_v06(){
        Solution solution = new Solution();
        assertEquals("ja", solution.atFirst("java"));
    }

    @Test
    public void at_first_v07(){
        Solution solution = new Solution();
        assertEquals("j@", solution.atFirst("j"));
    }
}
