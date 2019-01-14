package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class withoutX {

    @Test
    public void without_xHix(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX("xHix"));
    }

    @Test
    public void without_xHi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX("xHi"));
    }

    @Test
    public void without_Hxix(){
        Solution solution = new Solution();
        assertEquals("Hxi", solution.withoutX("Hxix"));
    }

    @Test
    public void without_Hi(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX("Hi"));
    }

    @Test
    public void without_xxHi(){
        Solution solution = new Solution();
        assertEquals("xHi", solution.withoutX("xxHi"));
    }

    @Test
    public void without_Hix(){
        Solution solution = new Solution();
        assertEquals("Hi", solution.withoutX("Hix"));
    }

    @Test
    public void without_xaxbx(){
        Solution solution = new Solution();
        assertEquals("axb", solution.withoutX("xaxbx"));
    }

    @Test
    public void without_xx(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutX("xx"));
    }

    @Test
    public void without__(){
        Solution solution = new Solution();
        assertEquals("", solution.withoutX(""));
    }

    @Test
    public void without_Hello(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.withoutX("Hello"));
    }

    @Test
    public void without_Hexllo(){
        Solution solution = new Solution();
        assertEquals("Hexllo", solution.withoutX("Hexllo"));
    }
}
