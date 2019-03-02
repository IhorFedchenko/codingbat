package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontTimes {

    @Test
    public void front_times_v01(){
        Solution solution = new Solution();
        assertEquals("ChoCho",solution.frontTimes("Chocolate",2));
    }

    @Test
    public void front_times_v02(){
        Solution solution = new Solution();
        assertEquals("ChoChoCho",solution.frontTimes("Chocolate",3));
    }

    @Test
    public void front_times_v03(){
        Solution solution = new Solution();
        assertEquals("AbcAbcAbc",solution.frontTimes("Abc",3));
    }

    @Test
    public void front_times_v04(){
        Solution solution = new Solution();
        assertEquals("AbAbAbAb",solution.frontTimes("Ab",4));
    }

    @Test
    public void front_times_v05(){
        Solution solution = new Solution();
        assertEquals("AAAA",solution.frontTimes("A",4));
    }

    @Test
    public void front_times_v06(){
        Solution solution = new Solution();
        assertEquals("",solution.frontTimes("",4));
    }

    @Test
    public void front_times_v07(){
        Solution solution = new Solution();
        assertEquals("",solution.frontTimes("Abc",0));
    }
}
