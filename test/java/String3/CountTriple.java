package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTriple {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void count_triple_v01(){
        assertEquals(1, solution.countTriple("abcXXXabc"));
    }

    @Test
    public void count_triple_v02(){
        assertEquals(3, solution.countTriple("xxxabyyyycd"));
    }

    @Test
    public void count_triple_v03(){
        assertEquals(0, solution.countTriple("a"));
    }

    @Test
    public void count_triple_v04(){
        assertEquals(0, solution.countTriple(""));
    }

    @Test
    public void count_triple_v05(){
        assertEquals(1, solution.countTriple("XXXabc"));
    }

    @Test
    public void count_triple_v06(){
        assertEquals(2, solution.countTriple("XXXXabc"));
    }

    @Test
    public void count_triple_v07(){
        assertEquals(3, solution.countTriple("XXXXXabc"));
    }

    @Test
    public void count_triple_v08(){
        assertEquals(3, solution.countTriple("222abyyycdXXX"));
    }

    @Test
    public void count_triple_v09(){
        assertEquals(4, solution.countTriple("abYYYabXXXXXab"));
    }

    @Test
    public void count_triple_v10(){
        assertEquals(0, solution.countTriple("abYYXabXXYXXab"));
    }

    @Test
    public void count_triple_v11(){
        assertEquals(0, solution.countTriple("abYYXabXXYXXab"));
    }

    @Test
    public void count_triple_v12(){
        assertEquals(1, solution.countTriple("122abhhh2"));
    }
}
