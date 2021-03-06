package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Or35 {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void or35_3() {
        assertTrue(solution.or35(3));
    }

    @Test
    public void or35_10() {
        assertTrue(solution.or35(10));
    }

    @Test
    public void or35_8() {
        assertFalse(solution.or35(8));
    }

    @Test
    public void or35_15() {
        assertTrue(solution.or35(15));
    }

    @Test
    public void or35_5() {
        assertTrue(solution.or35(5));
    }

    @Test
    public void or35_9() {
        assertTrue(solution.or35(9));
    }

    @Test
    public void or35_4() {
        assertFalse(solution.or35(4));
    }

    @Test
    public void or35_7() {
        assertFalse(solution.or35(7));
    }

    @Test
    public void or35_6() {
        assertTrue(solution.or35(6));
    }

    @Test
    public void or35_17() {
        assertFalse(solution.or35(17));
    }

    @Test
    public void or35_18() {
        assertTrue(solution.or35(18));
    }

    @Test
    public void or35_29() {
        assertFalse(solution.or35(29));
    }

    @Test
    public void or35_20() {
        assertTrue(solution.or35(20));
    }

    @Test
    public void or35_21() {
        assertTrue(solution.or35(21));
    }

    @Test
    public void or35_22() {
        assertFalse(solution.or35(22));
    }

    @Test
    public void or35_45() {
        assertTrue(solution.or35(45));
    }

    @Test
    public void or35_99() {
        assertTrue(solution.or35(99));
    }

    @Test
    public void or35_100() {
        assertTrue(solution.or35(100));
    }

    @Test
    public void or35_101() {
        assertFalse(solution.or35(101));
    }

    @Test
    public void or35_121() {
        assertFalse(solution.or35(121));
    }

    @Test
    public void or35_122() {
        assertFalse(solution.or35(122));
    }

    @Test
    public void or35_123() {
        assertTrue(solution.or35(123));
    }

}
