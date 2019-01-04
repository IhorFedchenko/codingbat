package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Right2 {

    @Test
    public void right2_Hello(){
        Solution solution = new Solution();
        assertEquals("loHel", solution.right2("Hello"));
    }

    @Test
    public void right2_java(){
        Solution solution = new Solution();
        assertEquals("vaja", solution.right2("java"));
    }

    @Test
    public void right2_Hi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.right2("Hi"));
    }

    @Test
    public void right2_code(){
        Solution solution = new Solution();
        assertEquals("deco", solution.right2("code"));
    }

    @Test
    public void right2_cat(){
        Solution solution = new Solution();
        assertEquals("atc", solution.right2("cat"));
    }

    @Test
    public void right2_12345(){
        Solution solution = new Solution();
        assertEquals("45123", solution.right2("12345"));
    }
}
