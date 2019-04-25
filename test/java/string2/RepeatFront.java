package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatFront {

    @Test
    public void repeat_front_v01(){
        Solution solution = new Solution();
        assertEquals("ChocChoChC", solution.repeatFront("Chocolate", 4));
    }

    @Test
    public void repeat_front_v02(){
        Solution solution = new Solution();
        assertEquals("ChoChC", solution.repeatFront("Chocolate", 3));
    }

    @Test
    public void repeat_front_v03(){
        Solution solution = new Solution();
        assertEquals("IcI", solution.repeatFront("Ice Cream", 2));
    }

    @Test
    public void repeat_front_v04(){
        Solution solution = new Solution();
        assertEquals("I", solution.repeatFront("Ice Cream", 1));
    }

    @Test
    public void repeat_front_v05(){
        Solution solution = new Solution();
        assertEquals("", solution.repeatFront("Ice Cream", 0));
    }

    @Test
    public void repeat_front_v06(){
        Solution solution = new Solution();
        assertEquals("xyzxyx", solution.repeatFront("xyz", 3));
    }

    @Test
    public void repeat_front_v07(){
        Solution solution = new Solution();
        assertEquals("", solution.repeatFront("", 0));
    }

    @Test
    public void repeat_front_v08(){
        Solution solution = new Solution();
        assertEquals("JavaJavJaJ", solution.repeatFront("Java", 4));
    }

    @Test
    public void repeat_front_v09(){
        Solution solution = new Solution();
        assertEquals("J", solution.repeatFront("Java", 1));
    }
}
