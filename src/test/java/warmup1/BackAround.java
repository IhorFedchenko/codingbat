package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackAround {

    @Test
    public void backAround_cat(){
        Solution solution = new Solution();
        assertEquals("tcatt", solution.backAround("cat") );
    }

    @Test
    public void backAround_Hello(){
        Solution solution = new Solution();
        assertEquals("oHelloo", solution.backAround("Hello") );
    }

    @Test
    public void backAround_a(){
        Solution solution = new Solution();
        assertEquals("aaa", solution.backAround("a") );
    }

    @Test
    public void backAround_abc(){
        Solution solution = new Solution();
        assertEquals("cabcc", solution.backAround("abc") );
    }

    @Test
    public void backAround_read(){
        Solution solution = new Solution();
        assertEquals("dreadd", solution.backAround("read") );
    }

    @Test
    public void backAround_boo(){
        Solution solution = new Solution();
        assertEquals("obooo", solution.backAround("boo") );
    }
}
