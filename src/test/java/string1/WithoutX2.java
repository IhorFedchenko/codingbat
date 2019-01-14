package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutX2 {

    @Test
    public void without_x2_xHi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX2("xHi"));
    }

    @Test
    public void without_x2_Hxi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX2("Hxi"));
    }

    @Test
    public void without_x2_Hi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX2("Hi"));
    }

    @Test
    public void without_x2_xxHi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX2("xxHi"));
    }

    @Test
    public void without_x2_Hix(){
        Solution solution = new Solution();
        assertEquals("Hix", solution.withoutX2("Hix"));
    }

    @Test
    public void without_x2_xaxb(){
        Solution solution = new Solution();
        assertEquals("axb", solution.withoutX2("xaxb"));
    }

    @Test
    public void without_x2_xx(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutX2("xx"));
    }

    @Test
    public void without_x2_x(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutX2("x"));
    }

    @Test
    public void without_x2__(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutX2(""));
    }

    @Test
    public void without_x2_Hello(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.withoutX2("Hello"));
    }

    @Test
    public void without_x2_Hexllo(){
        Solution solution = new Solution();
        assertEquals("Hexllo", solution.withoutX2("Hexllo"));
    }
    @Test
    public void without_x2_xHxllo(){
        Solution solution = new Solution();
        assertEquals("Hxllo", solution.withoutX2("xHxllo"));
    }



}
