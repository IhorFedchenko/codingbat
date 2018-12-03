package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Front3 {

    Solution solution = new Solution();

    @Test
    public void front_Java(){
        assertEquals("JavJavJav", solution.front3("Java"));
    }

    @Test
    public void front_Chocolate(){
        assertEquals("ChoChoCho", solution.front3("Chocolate"));
    }

    @Test
    public void front_abc(){
        assertEquals("abcabcabc", solution.front3("abc"));
    }

    @Test
    public void front_abcXYZ(){
        assertEquals("abcabcabc", solution.front3("abcXYZ"));
    }

    @Test
    public void front_ab(){
        assertEquals("ababab", solution.front3("ab"));
    }

    @Test
    public void front_a(){
        assertEquals("aaa", solution.front3("a"));
    }

    @Test
    public void front_(){
        assertEquals("", solution.front3(""));
    }
}
