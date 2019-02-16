package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Less20 {

    @Test
    public void less20_18(){
        Solution solution = new Solution();
        assertTrue(solution.less20(18));
    }

    @Test
    public void less20_19(){
        Solution solution = new Solution();
        assertTrue(solution.less20(19));
    }

    @Test
    public void less20_20(){
        Solution solution = new Solution();
        assertFalse(solution.less20(20));
    }

    @Test
    public void less20_8(){
        Solution solution = new Solution();
        assertFalse(solution.less20(8));
    }

    @Test
    public void less20_17(){
        Solution solution = new Solution();
        assertFalse(solution.less20(17));
    }

    @Test
    public void less20_23(){
        Solution solution = new Solution();
        assertFalse(solution.less20(23));
    }

    @Test
    public void less20_25(){
        Solution solution = new Solution();
        assertFalse(solution.less20(25));
    }

    @Test
    public void less20_30(){
        Solution solution = new Solution();
        assertFalse(solution.less20(30));
    }

    @Test
    public void less20_31(){
        Solution solution = new Solution();
        assertFalse(solution.less20(31));
    }

    @Test
    public void less20_58(){
        Solution solution = new Solution();
        assertTrue(solution.less20(58));
    }

    @Test
    public void less20_59(){
        Solution solution = new Solution();
        assertTrue(solution.less20(59));
    }

    @Test
    public void less20_60(){
        Solution solution = new Solution();
        assertFalse(solution.less20(60));
    }

    @Test
    public void less20_61(){
        Solution solution = new Solution();
        assertFalse(solution.less20(61));
    }

    @Test
    public void less20_62(){
        Solution solution = new Solution();
        assertFalse(solution.less20(62));
    }

    @Test
    public void less20_1017(){
        Solution solution = new Solution();
        assertFalse(solution.less20(1017));
    }

    @Test
    public void less20_1018(){
        Solution solution = new Solution();
        assertTrue(solution.less20(1018));
    }

    @Test
    public void less20_1019(){
        Solution solution = new Solution();
        assertTrue(solution.less20(1019));
    }

    @Test
    public void less20_1020(){
        Solution solution = new Solution();
        assertFalse(solution.less20(1020));
    }

    @Test
    public void less20_1021(){
        Solution solution = new Solution();
        assertFalse(solution.less20(1021));
    }

    @Test
    public void less20_1022(){
        Solution solution = new Solution();
        assertFalse(solution.less20(1022));
    }

    @Test
    public void less20_1023(){
        Solution solution = new Solution();
        assertFalse(solution.less20(1023));
    }

    @Test
    public void less20_37(){
        Solution solution = new Solution();
        assertFalse(solution.less20(37));
    }
}
