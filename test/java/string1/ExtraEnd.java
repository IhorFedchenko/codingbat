package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraEnd {

    @Test
    public void extra_end_Hello(){
        Solution solution = new Solution();
        assertEquals("lololo", solution.extraEnd("Hello"));
    }

    @Test
    public void extra_end_ab(){
        Solution solution = new Solution();
        assertEquals("ababab", solution.extraEnd("ab"));
    }

    @Test
    public void extra_end_Hi(){
        Solution solution = new Solution();
        assertEquals("HiHiHi", solution.extraEnd("Hi"));
    }

    @Test
    public void extra_end_Candy(){
        Solution solution = new Solution();
        assertEquals("dydydy", solution.extraEnd("Candy"));
    }

    @Test
    public void extra_end_Code(){
        Solution solution = new Solution();
        assertEquals("dedede", solution.extraEnd("Code"));
    }
}
