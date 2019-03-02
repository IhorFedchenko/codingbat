package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NTwice {

    @Test
    public void n_twice_v01(){
        Solution solution = new Solution();
        assertEquals("Helo", solution.nTwice("Hello", 2));
    }

    @Test
    public void n_twice_v02(){
        Solution solution = new Solution();
        assertEquals("Choate", solution.nTwice("Chocolate", 3));
    }

    @Test
    public void n_twice_v03(){
        Solution solution = new Solution();
        assertEquals("Ce", solution.nTwice("Chocolate", 1));
    }

    @Test
    public void n_twice_v04(){
        Solution solution = new Solution();
        assertEquals("", solution.nTwice("Chocolate", 0));
    }

    @Test
    public void n_twice_v05(){
        Solution solution = new Solution();
        assertEquals("Hellello", solution.nTwice("Hello", 4));
    }

    @Test
    public void n_twice_v06(){
        Solution solution = new Solution();
        assertEquals("CodeCode", solution.nTwice("Code", 4));
    }

    @Test
    public void n_twice_v07(){
        Solution solution = new Solution();
        assertEquals("Code", solution.nTwice("Code", 2));
    }

}
