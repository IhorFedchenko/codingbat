package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EveryNtn {

    @Test
    public void everyNth_v01(){
        Solution solution = new Solution();
        assertEquals("Mrce", solution.everyNth("Miracle",2));
    }

    @Test
    public void everyNth_v02(){
        Solution solution = new Solution();
        assertEquals("aceg", solution.everyNth("abcdefg",2));
    }

    @Test
    public void everyNth_v03(){
        Solution solution = new Solution();
        assertEquals("adg", solution.everyNth("abcdefg",3));
    }

    @Test
    public void everyNth_v04(){
        Solution solution = new Solution();
        assertEquals("Cca", solution.everyNth("Chocolate",3));
    }

    @Test
    public void everyNth_v05(){
        Solution solution = new Solution();
        assertEquals("Ccas", solution.everyNth("Chocolates",3));
    }

    @Test
    public void everyNth_v06(){
        Solution solution = new Solution();
        assertEquals("Coe", solution.everyNth("Chocolates",4));
    }

    @Test
    public void everyNth_v07(){
        Solution solution = new Solution();
        assertEquals("C", solution.everyNth("Chocolates",1000));
    }
}
