package String3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxBlock {

    Solution solution;

    @Before
    public void setup(){
        solution =  new Solution();
    }

    @Test
    public void max_block_v01(){
        assertEquals(2, solution.maxBlock("hoopla"));
    }

    @Test
    public void max_block_v02(){
        assertEquals(3, solution.maxBlock("abbCCCddBBBxx"));
    }

    @Test
    public void max_block_v03(){
        assertEquals(0, solution.maxBlock(""));
    }

    @Test
    public void max_block_v04(){
        assertEquals(1, solution.maxBlock("xyz"));
    }

    @Test
    public void max_block_v05(){
        assertEquals(2, solution.maxBlock("xxyz"));
    }

    @Test
    public void max_block_v06(){
        assertEquals(2, solution.maxBlock("xyzz"));
    }

    @Test
    public void max_block_v07(){
        assertEquals(3, solution.maxBlock("abbbcbbbxbbbx"));
    }

    @Test
    public void max_block_v08(){
        assertEquals(3, solution.maxBlock("XXBBBbbxx"));
    }

    @Test
    public void max_block_v09(){
        assertEquals(4, solution.maxBlock("XXBBBBbbxx"));
    }

    @Test
    public void max_block_v10(){
        assertEquals(4, solution.maxBlock("XXBBBbbxxXXXX"));
    }

    @Test
    public void max_block_v11(){
        assertEquals(4, solution.maxBlock("XX2222BBBbbXX2222"));
    }
}
