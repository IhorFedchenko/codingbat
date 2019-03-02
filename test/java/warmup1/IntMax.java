package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntMax {

    @Test
    public void intMax_v1(){
        Solution solution = new Solution();
        assertEquals(3, solution.intMax(1,2,3));
    }

    @Test
    public void intMax_v2(){
        Solution solution = new Solution();
        assertEquals(3, solution.intMax(1, 3,2));
    }

    @Test
    public void intMax_v3(){
        Solution solution = new Solution();
        assertEquals(3, solution.intMax(3,2,1));
    }

    @Test
    public void intMax_v4(){
        Solution solution = new Solution();
        assertEquals(9, solution.intMax(9,3,3));
    }

    @Test
    public void intMax_v5(){
        Solution solution = new Solution();
        assertEquals(9, solution.intMax(3,9, 3));
    }

    @Test
    public void intMax_v6(){
        Solution solution = new Solution();
        assertEquals(9, solution.intMax(3,3,9));
    }

    @Test
    public void intMax_v7(){
        Solution solution = new Solution();
        assertEquals(8, solution.intMax(8,2,3));
    }

    @Test
    public void intMax_v8(){
        Solution solution = new Solution();
        assertEquals(-1, solution.intMax(-3,-1,-2));
    }

    @Test
    public void intMax_v9(){
        Solution solution = new Solution();
        assertEquals(6, solution.intMax(6,2,5));
    }

    @Test
    public void intMax_v10(){
        Solution solution = new Solution();
        assertEquals(6, solution.intMax(5,6,2));
    }

    @Test
    public void intMax_v11(){
        Solution solution = new Solution();
        assertEquals(6, solution.intMax(5,2, 6));
    }


}
