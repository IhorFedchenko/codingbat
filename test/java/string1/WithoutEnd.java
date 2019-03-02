package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutEnd {

    @Test
    public void without_end_Hello(){
        Solution solution = new Solution();
        assertEquals("ell", solution.withoutEnd("Hello"));
    }

    @Test
    public void without_end_java(){
        Solution solution = new Solution();
        assertEquals("av", solution.withoutEnd("java"));
    }

    @Test
    public void without_end_coding(){
        Solution solution = new Solution();
        assertEquals("odin", solution.withoutEnd("coding"));
    }

    @Test
    public void without_end_code(){
        Solution solution = new Solution();
        assertEquals("od", solution.withoutEnd("code"));
    }

    @Test
    public void without_end_ad(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutEnd("ad"));
    }

    @Test
    public void without_end_Chocolate(){
        Solution solution = new Solution();
        assertEquals("hocolate", solution.withoutEnd("Chocolate!"));
    }

    @Test
    public void without_end_kitten(){
        Solution solution = new Solution();
        assertEquals("itte", solution.withoutEnd("kitten"));
    }

    @Test
    public void without_end_woohoo(){
        Solution solution = new Solution();
        assertEquals("ooho", solution.withoutEnd("woohoo"));
    }
}
