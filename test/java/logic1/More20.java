package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class More20 {

    @Test
    public void more20_20(){
        Solution solution = new Solution();
        assertFalse(solution.more20(20));
    }

    @Test
    public void more20_21(){
        Solution solution = new Solution();
        assertTrue(solution.more20(21));
    }

    @Test
    public void more20_22(){
        Solution solution = new Solution();
        assertTrue(solution.more20(22));
    }

    @Test
    public void more20_23(){
        Solution solution = new Solution();
        assertFalse(solution.more20(23));
    }

    @Test
    public void more20_25(){
        Solution solution = new Solution();
        assertFalse(solution.more20(25));
    }

    @Test
    public void more20_30(){
        Solution solution = new Solution();
        assertFalse(solution.more20(30));
    }

    @Test
    public void more20_31(){
        Solution solution = new Solution();
        assertFalse(solution.more20(31));
    }

    @Test
    public void more20_59(){
        Solution solution = new Solution();
        assertFalse(solution.more20(59));
    }

    @Test
    public void more20_60(){
        Solution solution = new Solution();
        assertFalse(solution.more20(60));
    }

    @Test
    public void more20_61(){
        Solution solution = new Solution();
        assertTrue(solution.more20(61));
    }

    @Test
    public void more20_62(){
        Solution solution = new Solution();
        assertTrue(solution.more20(62));
    }

    @Test
    public void more20_1020(){
        Solution solution = new Solution();
        assertFalse(solution.more20(1020));
    }

    @Test
    public void more20_1021(){
        Solution solution = new Solution();
        assertTrue(solution.more20(1021));
    }

    @Test
    public void more20_1000(){
        Solution solution = new Solution();
        assertFalse(solution.more20(1000));
    }

    @Test
    public void more20_1001(){
        Solution solution = new Solution();
        assertTrue(solution.more20(1001));
    }

    @Test
    public void more20_50(){
        Solution solution = new Solution();
        assertFalse(solution.more20(50));
    }

    @Test
    public void more20_55(){
        Solution solution = new Solution();
        assertFalse(solution.more20(55));
    }

    @Test
    public void more20_40(){
        Solution solution = new Solution();
        assertFalse(solution.more20(40));
    }

    @Test
    public void more20_41(){
        Solution solution = new Solution();
        assertTrue(solution.more20(41));
    }

    @Test
    public void more20_39(){
        Solution solution = new Solution();
        assertFalse(solution.more20(39));
    }

    @Test
    public void more20_42(){
        Solution solution = new Solution();
        assertTrue(solution.more20(42));
    }
}
