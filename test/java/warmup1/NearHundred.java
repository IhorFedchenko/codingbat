package warmup1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class NearHundred {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void near_Hundred_93() {
        assertTrue(solution.nearHundred(93));
    }

    @Test
    public void near_Hundred_90() {
        assertTrue(solution.nearHundred(90));
    }

    @Test
    public void near_Hundred_89() {
        assertFalse(solution.nearHundred(89));
    }

    @Test
    public void near_Hundred_110() {
        assertTrue(solution.nearHundred(110));
    }

    @Test
    public void near_Hundred_111() {
        assertFalse(solution.nearHundred(111));
    }

    @Test
    public void near_Hundred_121() {
        assertFalse(solution.nearHundred(121));
    }

    @Test
    public void near_Hundred_minus_101() {
        assertFalse(solution.nearHundred(-101));
    }

    @Test
    public void near_Hundred_minus_209() {
        assertFalse(solution.nearHundred(-209));
    }

    @Test
    public void near_Hundred_190() {
        assertTrue(solution.nearHundred(190));
    }

    @Test
    public void near_Hundred_209() {
        assertTrue(solution.nearHundred(209));
    }

    @Test
    public void near_Hundred_0() {
        assertFalse(solution.nearHundred(0));
    }

    @Test
    public void near_Hundred_5() {
        assertFalse(solution.nearHundred(5));
    }

    @Test
    public void near_Hundred_minus_50() {
        assertFalse(solution.nearHundred(-50));
    }

    @Test
    public void near_Hundred_191() {
        assertTrue(solution.nearHundred(191));
    }

    @Test
    public void near_Hundred_189() {
        assertFalse(solution.nearHundred(189));
    }

    @Test
    public void near_Hundred_200() {
        assertTrue(solution.nearHundred(200));
    }

    @Test
    public void near_Hundred_210() {
        assertTrue(solution.nearHundred(210));
    }

    @Test
    public void near_Hundred_211() {
        assertFalse(solution.nearHundred(211));
    }

    @Test
    public void near_Hundred_290() {
        assertFalse(solution.nearHundred(290));
    }
}
