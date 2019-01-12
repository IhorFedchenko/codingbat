package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Extrafront {

    @Test
    public void extra_front_Hello(){
        Solution solution = new Solution();
        assertEquals("HeHeHe", solution.extraFront("Hello"));
    }

    @Test
    public void extra_front_ab(){
        Solution solution = new Solution();
        assertEquals("ababab", solution.extraFront("ab"));
    }

    @Test
    public void extra_front_H(){
        Solution solution = new Solution();
        assertEquals("HHH", solution.extraFront("H"));
    }

    @Test
    public void extra_front__(){
        Solution solution = new Solution();
        assertEquals("", solution.extraFront(""));
    }

    @Test
    public void extra_front_Candy(){
        Solution solution = new Solution();
        assertEquals("CaCaCa", solution.extraFront("Candy"));
    }

    @Test
    public void extra_front_Code(){
        Solution solution = new Solution();
        assertEquals("CoCoCo", solution.extraFront("Code"));
    }
}
