package logic2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MakeChocolate {

    @Test
    public void make_chocolate_v01(){
        Solution solution = new Solution();
        assertEquals(4, solution.makeChocolate(4, 1, 9));
    }

    @Test
    public void make_chocolate_v02(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(4, 1, 10));
    }

    @Test
    public void make_chocolate_v03(){
        Solution solution = new Solution();
        assertEquals(2, solution.makeChocolate(4, 1, 7));
    }

    @Test
    public void make_chocolate_v04(){
        Solution solution = new Solution();
        assertEquals(2, solution.makeChocolate(6, 2, 7));
    }

    @Test
    public void make_chocolate_v05(){
        Solution solution = new Solution();
        assertEquals(0, solution.makeChocolate(4, 1, 5));
    }

    @Test
    public void make_chocolate_v06(){
        Solution solution = new Solution();
        assertEquals(4, solution.makeChocolate(4, 1, 4));
    }

    @Test
    public void make_chocolate_v07(){
        Solution solution = new Solution();
        assertEquals(4, solution.makeChocolate(5, 4, 9));
    }

    @Test
    public void make_chocolate_v08(){
        Solution solution = new Solution();
        assertEquals(3, solution.makeChocolate(9,3,18));
    }

    @Test
    public void make_chocolate_v09(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(3, 1, 9));
    }

    @Test
    public void make_chocolate_v10(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(1, 2, 7));
    }

    @Test
    public void make_chocolate_v11(){
        Solution solution = new Solution();
        assertEquals(1, solution.makeChocolate(1,2 ,6));
    }

    @Test
    public void make_chocolate_v12(){
        Solution solution = new Solution();
        assertEquals(0, solution.makeChocolate(1, 2, 5));
    }

    @Test
    public void make_chocolate_v13(){
        Solution solution = new Solution();
        assertEquals(5, solution.makeChocolate(6, 1, 10));
    }

    @Test
    public void make_chocolate_v14(){
        Solution solution = new Solution();
        assertEquals(6, solution.makeChocolate(6, 1, 11));
    }

    @Test
    public void make_chocolate_v15(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(6, 1, 12));
    }

    @Test
    public void make_chocolate_v16(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(6, 1, 13));
    }

    @Test
    public void make_chocolate_v17(){
        Solution solution = new Solution();
        assertEquals(0, solution.makeChocolate(6, 2, 10));
    }

    @Test
    public void make_chocolate_v18(){
        Solution solution = new Solution();
        assertEquals(1, solution.makeChocolate(6, 2, 11));
    }

    @Test
    public void make_chocolate_v19(){
        Solution solution = new Solution();
        assertEquals(2, solution.makeChocolate(6, 2, 12));
    }

    @Test
    public void make_chocolate_v20(){
        Solution solution = new Solution();
        assertEquals(50, solution.makeChocolate(60, 100, 550));
    }

    @Test
    public void make_chocolate_v21(){
        Solution solution = new Solution();
        assertEquals(6, solution.makeChocolate(1000, 1000000, 5000006));
    }

    @Test
    public void make_chocolate_v22(){
        Solution solution = new Solution();
        assertEquals(7, solution.makeChocolate(7, 1, 12));
    }

    @Test
    public void make_chocolate_v23(){
        Solution solution = new Solution();
        assertEquals(-1, solution.makeChocolate(7, 1, 13));
    }

    @Test
    public void make_chocolate_v24(){
        Solution solution = new Solution();
        assertEquals(3, solution.makeChocolate(7, 2, 13));
    }
}
