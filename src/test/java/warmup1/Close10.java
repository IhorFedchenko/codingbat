package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Close10 {

    @Test
    public void close_v1(){
        Solution solution = new Solution();
        assertEquals(8, solution.close10(8,13));
    }

    @Test
    public void close_v2(){
        Solution solution = new Solution();
        assertEquals(8, solution.close10(13,8));
    }

    @Test
    public void close_v3(){
        Solution solution = new Solution();
        assertEquals(0, solution.close10(13,7));
    }

    @Test
    public void close_v4(){
        Solution solution = new Solution();
        assertEquals(0, solution.close10(13,7));
    }

    @Test
    public void close_v5(){
        Solution solution = new Solution();
        assertEquals(9, solution.close10(9,13));
    }

    @Test
    public void close_v6(){
        Solution solution = new Solution();
        assertEquals(8, solution.close10(13,8));
    }

    @Test
    public void close_v7(){
        Solution solution = new Solution();
        assertEquals(10, solution.close10(10,12));
    }

    @Test
    public void close_v8(){
        Solution solution = new Solution();
        assertEquals(10, solution.close10(11,10));
    }

    @Test
    public void close_v9(){
        Solution solution = new Solution();
        assertEquals(5, solution.close10(5,21));
    }

    @Test
    public void close_v10(){
        Solution solution = new Solution();
        assertEquals(0, solution.close10(0,20));
    }

    @Test
    public void close_v11(){
        Solution solution = new Solution();
        assertEquals(0, solution.close10(10,10));
    }
}
