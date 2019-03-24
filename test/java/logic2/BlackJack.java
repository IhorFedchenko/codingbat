package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackJack {

    @Test
    public void black_jack_v01(){
        Solution solution = new Solution();
        assertEquals(21, solution.blackjack(19, 21));
    }

    @Test
    public void black_jack_v02(){
        Solution solution = new Solution();
        assertEquals(21, solution.blackjack(21, 19));
    }

    @Test
    public void black_jack_v03(){
        Solution solution = new Solution();
        assertEquals(19, solution.blackjack(19, 22));
    }

    @Test
    public void black_jack_v04(){
        Solution solution = new Solution();
        assertEquals(19, solution.blackjack(22, 19));
    }

    @Test
    public void black_jack_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.blackjack(22, 50));
    }

    @Test
    public void black_jack_v06(){
        Solution solution = new Solution();
        assertEquals(0, solution.blackjack(22, 22));
    }

    @Test
    public void black_jack_v07(){
        Solution solution = new Solution();
        assertEquals(1, solution.blackjack(33, 1));
    }

    @Test
    public void black_jack_v08(){
        Solution solution = new Solution();
        assertEquals(2, solution.blackjack(1, 2));
    }

    @Test
    public void black_jack_v09(){
        Solution solution = new Solution();
        assertEquals(0, solution.blackjack(34, 33));
    }

    @Test
    public void black_jack_v10(){
        Solution solution = new Solution();
        assertEquals(19, solution.blackjack(17, 19));
    }

    @Test
    public void black_jack_v11(){
        Solution solution = new Solution();
        assertEquals(18, solution.blackjack(18, 17));
    }

    @Test
    public void black_jack_v12(){
        Solution solution = new Solution();
        assertEquals(16, solution.blackjack(16, 23));
    }

    @Test
    public void black_jack_v13(){
        Solution solution = new Solution();
        assertEquals(4, solution.blackjack(3, 4));
    }

    @Test
    public void black_jack_v14(){
        Solution solution = new Solution();
        assertEquals(3, solution.blackjack(3, 2));
    }

    @Test
    public void black_jack_v15(){
        Solution solution = new Solution();
        assertEquals(21, solution.blackjack(21, 20));
    }
}
