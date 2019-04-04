package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCode {

    @Test
    public void count_code_v01(){
        Solution solution = new Solution();
        assertEquals(1, solution.countCode("aaacodebbb"));
    }

    @Test
    public void count_code_v02(){
        Solution solution = new Solution();
        assertEquals(2, solution.countCode("codexxcode"));
    }

    @Test
    public void count_code_v03(){
        Solution solution = new Solution();
        assertEquals(2, solution.countCode("cozexxcope"));
    }

    @Test
    public void count_code_v04(){
        Solution solution = new Solution();
        assertEquals(1, solution.countCode("xxcozeyycop"));
    }

    @Test
    public void count_code_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode("cozcop"));
    }

    @Test
    public void count_code_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode("cozcop"));
    }

    @Test
    public void count_code_v07(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode("abcxyz"));
    }

    @Test
    public void count_code_v08(){
        Solution solution = new Solution();
        assertEquals(1, solution.countCode("code"));
    }

    @Test
    public void count_code_v09(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode("ode"));
    }

    @Test
    public void count_code_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode("c"));
    }

    @Test
    public void count_code_v11(){
        Solution solution = new Solution();
        assertEquals(0, solution.countCode(""));
    }

    @Test
    public void count_code_v12(){
        Solution solution = new Solution();
        assertEquals(3, solution.countCode("AAcodeBBcoleCCccoreDD"));
    }

    @Test
    public void count_code_v13(){
        Solution solution = new Solution();
        assertEquals(2, solution.countCode("AAcodeBBcoleCCccorfDD"));
    }

    @Test
    public void count_code_v14(){
        Solution solution = new Solution();
        assertEquals(3, solution.countCode("coAcodeBcoleccoreDD"));
    }
}
