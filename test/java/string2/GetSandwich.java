package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSandwich {

    Solution solution = new Solution();

    @Test
    public void get_sendwich_v01(){
        assertEquals("jam", solution.getSandwich("breadjambread"));
    }

    @Test
    public void get_sendwich_v02(){
        assertEquals("jam", solution.getSandwich("xxbreadjambreadyy"));
    }

    @Test
    public void get_sendwich_v03(){
        assertEquals("", solution.getSandwich("xxbreadyy"));
    }

    @Test
    public void get_sendwich_v04(){
        assertEquals("breadjam", solution.getSandwich("xxbreadbreadjambreadyy"));
    }

    @Test
    public void get_sendwich_v05(){
        assertEquals("A", solution.getSandwich("breadAbread"));
    }

    @Test
    public void get_sendwich_v06(){
        assertEquals("", solution.getSandwich("breadbread"));
    }

    @Test
    public void get_sendwich_v07(){
        assertEquals("", solution.getSandwich("abcbreaz"));
    }

    @Test
    public void get_sendwich_v08(){
        assertEquals("", solution.getSandwich("xyz"));
    }

    @Test
    public void get_sendwich_v09(){
        assertEquals("", solution.getSandwich(""));
    }

    @Test
    public void get_sendwich_v10(){
        assertEquals("breax", solution.getSandwich("breadbreaxbread"));
    }

    @Test
    public void get_sendwich_v11(){
        assertEquals("y", solution.getSandwich("breaxbreadybread"));
    }
    @Test
    public void get_sendwich_v12(){
        assertEquals("breadbread", solution.getSandwich("breadbreadbreadbread"));
    }
}
