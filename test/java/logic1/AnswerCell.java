package logic1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnswerCell {

    @Test
    public void answerCell_v01(){
        Solution solution = new Solution();
        assertTrue(solution.answerCell(false, false, false));
    }

    @Test
    public void answerCell_v02(){
        Solution solution = new Solution();
        assertFalse(solution.answerCell(false, false, true));
    }

    @Test
    public void answerCell_v03(){
        Solution solution = new Solution();
        assertFalse(solution.answerCell(true, false, false));
    }

    @Test
    public void answerCell_v04(){
        Solution solution = new Solution();
        assertTrue(solution.answerCell(true, true, false));
    }

    @Test
    public void answerCell_v05(){
        Solution solution = new Solution();
        assertTrue(solution.answerCell(false, true, false));
    }

    @Test
    public void answerCell_v06(){
        Solution solution = new Solution();
        assertFalse(solution.answerCell(true, true, true));
    }
}
