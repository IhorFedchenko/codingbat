package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoTriples {

    @Test
    public void no_triples_v01(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{1,1,2,2,1}));
    }

    @Test
    public void no_triples_v02(){
        Solution solution = new Solution();
        assertFalse(solution.noTriples(new int[]{1,1,2,2,2,1}));
    }

    @Test
    public void no_triples_v03(){
        Solution solution = new Solution();
        assertFalse(solution.noTriples(new int[]{1,1,1,2,2,2,1}));
    }

    @Test
    public void no_triples_v04(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{1,1,2,2,1,2,1}));
    }

    @Test
    public void no_triples_v05(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{1,2,1}));
    }

    @Test
    public void no_triples_v06(){
        Solution solution = new Solution();
        assertFalse(solution.noTriples(new int[]{1,1,1}));
    }

    @Test
    public void no_triples_v07(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{1,1}));
    }

    @Test
    public void no_triples_v08(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{1}));
    }

    @Test
    public void no_triples_v09(){
        Solution solution = new Solution();
        assertTrue(solution.noTriples(new int[]{}));
    }

}
