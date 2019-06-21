package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StartHi {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void startHi_hi_there() {
        assertTrue(solution.startHi("hi there"));
    }

    @Test
    public void startHi_hi() {
        assertTrue(solution.startHi("hi"));
    }

    @Test
    public void startHi_hello_hi() {
        assertFalse(solution.startHi("hello hi"));
    }

    @Test
    public void startHi_hi_he() {
        assertFalse(solution.startHi("he"));
    }

    @Test
    public void startHi_h() {
        assertFalse(solution.startHi("h"));
    }

    @Test
    public void startHi_hi_() {
        assertFalse(solution.startHi(""));
    }

    @Test
    public void startHi_ho_hi() {
        assertFalse(solution.startHi("ho hi"));
    }

    @Test
    public void startHi_hi_ho() {
        assertTrue(solution.startHi("hi ho"));
    }
}
