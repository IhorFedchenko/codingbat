package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnswerCell {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void answerCell_v01() {
        assertTrue(solution.answerCell(false, false, false));
    }

    @Test
    public void answerCell_v02() {
        assertFalse(solution.answerCell(false, false, true));
    }

    @Test
    public void answerCell_v03() {
        assertFalse(solution.answerCell(true, false, false));
    }

    @Test
    public void answerCell_v04() {
        assertTrue(solution.answerCell(true, true, false));
    }

    @Test
    public void answerCell_v05() {
        assertTrue(solution.answerCell(false, true, false));
    }

    @Test
    public void answerCell_v06() {
        assertFalse(solution.answerCell(true, true, true));
    }
}
