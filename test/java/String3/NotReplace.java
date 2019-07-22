package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotReplace {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void not_replace_v01(){
        assertEquals("is not test", solution.notReplace("is test"));
    }

    @Test
    public void not_replace_v02(){
        assertEquals("is not-is not", solution.notReplace("is-is"));
    }

    @Test
    public void not_replace_v03(){
        assertEquals("This is not right", solution.notReplace("This is right"));
    }

    @Test
    public void not_replace_v04(){
        assertEquals("This is not isabell", solution.notReplace("This is isabell"));
    }

    @Test
    public void not_replace_v05(){
        assertEquals("", solution.notReplace(""));
    }

    @Test
    public void not_replace_v06(){
        assertEquals("is not", solution.notReplace("is"));
    }

    @Test
    public void not_replace_v07(){
        assertEquals("isis", solution.notReplace("isis"));
    }

    @Test
    public void not_replace_v08(){
        assertEquals("Dis is not bliss is not", solution.notReplace("Dis is bliss is"));
    }

    @Test
    public void not_replace_v09(){
        assertEquals("is not his", solution.notReplace("is his"));
    }

    @Test
    public void not_replace_v10(){
        assertEquals("xis yis", solution.notReplace("xis yis"));
    }

    @Test
    public void not_replace_v11(){
        assertEquals("AAAis is not", solution.notReplace("AAAis is"));
    }


}
