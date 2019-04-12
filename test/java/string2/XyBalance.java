package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyBalance {

    @Test
    public void xy_balance_v01(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("aaxbby"));
    }

    @Test
    public void xy_balance_v02(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("aaxbb"));
    }

    @Test
    public void xy_balance_v03(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("yaaxbb"));
    }

    @Test
    public void xy_balance_v04(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("yaaxbby"));
    }

    @Test
    public void xy_balance_v05(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("xaxxbby"));
    }

    @Test
    public void xy_balance_v06(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("xaxxbbyx"));
    }

    @Test
    public void xy_balance_v07(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("xxbxy"));
    }

    @Test
    public void xy_balance_v08(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("xxbx"));
    }

    @Test
    public void xy_balance_v09(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("bbb"));
    }

    @Test
    public void xy_balance_v10(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("bxbb"));
    }

    @Test
    public void xy_balance_v11(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("bxyb"));
    }

    @Test
    public void xy_balance_v12(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("xy"));
    }

    @Test
    public void xy_balance_v13(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("y"));
    }

    @Test
    public void xy_balance_v14(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("x"));
    }

    @Test
    public void xy_balance_v15(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance(""));
    }

    @Test
    public void xy_balance_v16(){
        Solution solution = new Solution();
        assertFalse(solution.xyBalance("yxyxyxyx"));
    }

    @Test
    public void xy_balance_v17(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("yxyxyxyxy"));
    }

    @Test
    public void xy_balance_v18(){
        Solution solution = new Solution();
        assertTrue(solution.xyBalance("12xabxxydxyxyzz"));
    }
}
