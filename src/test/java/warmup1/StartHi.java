package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StartHi {

    @Test
    public void startHi_hi_there(){
        Solution solution = new Solution();
        assertTrue(solution.startHi("hi there"));
    }

    @Test
    public void startHi_hi(){
        Solution solution = new Solution();
        assertTrue(solution.startHi("hi"));
    }

    @Test
    public void startHi_hello_hi(){
        Solution solution = new Solution();
        assertFalse(solution.startHi("hello hi"));
    }

    @Test
    public void startHi_hi_he(){
        Solution solution = new Solution();
        assertFalse(solution.startHi("he"));
    }

    @Test
    public void startHi_h(){
        Solution solution = new Solution();
        assertFalse(solution.startHi("h"));
    }

    @Test
    public void startHi_hi_(){
        Solution solution = new Solution();
        assertFalse(solution.startHi(""));
    }

    @Test
    public void startHi_ho_hi(){
        Solution solution = new Solution();
        assertFalse(solution.startHi("ho hi"));
    }

    @Test
    public void startHi_hi_ho(){
        Solution solution = new Solution();
        assertTrue(solution.startHi("hi ho"));
    }
}
