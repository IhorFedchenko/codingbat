package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountXX {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void count_xx_v01() {
        assertEquals(1, solution.countXX("abcxx"));
    }

    @Test
    public void count_xx_v02() {
        assertEquals(2, solution.countXX("xxx"));
    }

    @Test
    public void count_xx_v03() {
        assertEquals(3, solution.countXX("xxxx"));
    }

    @Test
    public void count_xx_v04() {
        assertEquals(0, solution.countXX("abc"));
    }

    @Test
    public void count_xx_v05() {
        assertEquals(0, solution.countXX("Hello there"));
    }

    @Test
    public void count_xx_v06() {
        assertEquals(2, solution.countXX("Hexxo thxxe"));
    }

    @Test
    public void count_xx_v07() {
        assertEquals(0, solution.countXX(""));
    }

    @Test
    public void count_xx_v08() {
        assertEquals(0, solution.countXX("kittens"));
    }

    @Test
    public void count_xx_v09() {
        assertEquals(2, solution.countXX("kittensxxx"));
    }

}
