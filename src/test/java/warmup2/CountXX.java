package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountXX {

    @Test
    public void count_xx_v01(){
        Solution solution = new Solution();
        assertEquals(1, solution.countXX("abcxx"));
    }

    @Test
    public void count_xx_v02(){
        Solution solution = new Solution();
        assertEquals(2, solution.countXX("xxx"));
    }

    @Test
    public void count_xx_v03(){
        Solution solution = new Solution();
        assertEquals(3, solution.countXX("xxxx"));
    }

    @Test
    public void count_xx_v04(){
        Solution solution = new Solution();
        assertEquals(0, solution.countXX("abc"));
    }

    @Test
    public void count_xx_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.countXX("Hello there"));
    }

    @Test
    public void count_xx_v06(){
        Solution solution = new Solution();
        assertEquals(2, solution.countXX("Hexxo thxxe"));
    }

    @Test
    public void count_xx_v07(){
        Solution solution = new Solution();
        assertEquals(0, solution.countXX(""));
    }

    @Test
    public void count_xx_v08(){
        Solution solution = new Solution();
        assertEquals(0, solution.countXX("kittens"));
    }
    @Test
    public void count_xx_v09(){
        Solution solution = new Solution();
        assertEquals(2, solution.countXX("kittensxxx"));
    }

}
