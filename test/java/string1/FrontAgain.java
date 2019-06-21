package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrontAgain {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void front_again_edited() {
        assertTrue(solution.frontAgain("edited"));
    }

    @Test
    public void front_again_edit() {
        assertFalse(solution.frontAgain("edit"));
    }

    @Test
    public void front_again_ed() {
        assertTrue(solution.frontAgain("ed"));
    }

    @Test
    public void front_again_jj() {
        assertTrue(solution.frontAgain("jj"));
    }

    @Test
    public void front_again_jjj() {
        assertTrue(solution.frontAgain("jjj"));
    }

    @Test
    public void front_again_jjjj() {
        assertTrue(solution.frontAgain("jjjj"));
    }

    @Test
    public void front_again_jjjk() {
        assertFalse(solution.frontAgain("jjjk"));
    }

    @Test
    public void front_again_x() {
        assertFalse(solution.frontAgain("x"));
    }

    @Test
    public void front_again__() {
        assertFalse(solution.frontAgain(""));
    }

    @Test
    public void front_again_java() {
        assertFalse(solution.frontAgain("java"));
    }

    @Test
    public void front_again_javaja() {
        assertTrue(solution.frontAgain("javaja"));
    }


}
