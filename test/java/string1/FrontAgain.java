package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrontAgain {

    @Test
    public void front_again_edited(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("edited"));
    }

    @Test
    public void front_again_edit(){
        Solution solution = new Solution();
        assertFalse(solution.frontAgain("edit"));
    }

    @Test
    public void front_again_ed(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("ed"));
    }

    @Test
    public void front_again_jj(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("jj"));
    }

    @Test
    public void front_again_jjj(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("jjj"));
    }

    @Test
    public void front_again_jjjj(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("jjjj"));
    }

    @Test
    public void front_again_jjjk(){
        Solution solution = new Solution();
        assertFalse(solution.frontAgain("jjjk"));
    }

    @Test
    public void front_again_x(){
        Solution solution = new Solution();
        assertFalse(solution.frontAgain("x"));
    }

    @Test
    public void front_again__(){
        Solution solution = new Solution();
        assertFalse(solution.frontAgain(""));
    }

    @Test
    public void front_again_java(){
        Solution solution = new Solution();
        assertFalse(solution.frontAgain("java"));
    }

    @Test
    public void front_again_javaja(){
        Solution solution = new Solution();
        assertTrue(solution.frontAgain("javaja"));
    }


}
