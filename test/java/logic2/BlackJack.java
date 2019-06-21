package logic2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackJack {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void black_jack_v01() {
        assertEquals(21, solution.blackjack(19, 21));
    }

    @Test
    public void black_jack_v02() {
        assertEquals(21, solution.blackjack(21, 19));
    }

    @Test
    public void black_jack_v03() {
        assertEquals(19, solution.blackjack(19, 22));
    }

    @Test
    public void black_jack_v04() {
        assertEquals(19, solution.blackjack(22, 19));
    }

    @Test
    public void black_jack_v05() {
        assertEquals(0, solution.blackjack(22, 50));
    }

    @Test
    public void black_jack_v06() {
        assertEquals(0, solution.blackjack(22, 22));
    }

    @Test
    public void black_jack_v07() {
        assertEquals(1, solution.blackjack(33, 1));
    }

    @Test
    public void black_jack_v08() {
        assertEquals(2, solution.blackjack(1, 2));
    }

    @Test
    public void black_jack_v09() {
        assertEquals(0, solution.blackjack(34, 33));
    }

    @Test
    public void black_jack_v10() {
        assertEquals(19, solution.blackjack(17, 19));
    }

    @Test
    public void black_jack_v11() {
        assertEquals(18, solution.blackjack(18, 17));
    }

    @Test
    public void black_jack_v12() {
        assertEquals(16, solution.blackjack(16, 23));
    }

    @Test
    public void black_jack_v13() {
        assertEquals(4, solution.blackjack(3, 4));
    }

    @Test
    public void black_jack_v14() {
        assertEquals(3, solution.blackjack(3, 2));
    }

    @Test
    public void black_jack_v15() {
        assertEquals(21, solution.blackjack(21, 20));
    }
}
