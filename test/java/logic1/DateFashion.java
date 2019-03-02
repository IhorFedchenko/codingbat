package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFashion {

    @Test
    public void date_fashion_5_10(){
        Solution solution = new Solution();
        assertEquals(2, solution.dateFashion(5, 10));
    }

    @Test
    public void date_fashion_5_2(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(5, 2));
    }

    @Test
    public void date_fashion_5_5(){
        Solution solution = new Solution();
        assertEquals(1, solution.dateFashion(5, 5));
    }

    @Test
    public void date_fashion_3_3(){
        Solution solution = new Solution();
        assertEquals(1, solution.dateFashion(3, 3));
    }

    @Test
    public void date_fashion_10_2(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(10, 2));
    }

    @Test
    public void date_fashion_2_9(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(2, 9));
    }

    @Test
    public void date_fashion_9_9(){
        Solution solution = new Solution();
        assertEquals(2, solution.dateFashion(9, 9));
    }

    @Test
    public void date_fashion_10_5(){
        Solution solution = new Solution();
        assertEquals(2, solution.dateFashion(10, 5));
    }

    @Test
    public void date_fashion_2_2(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(2, 2));
    }

    @Test
    public void date_fashion_3_7(){
        Solution solution = new Solution();
        assertEquals(1, solution.dateFashion(3, 7));
    }

    @Test
    public void date_fashion_2_7(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(2, 7));
    }

    @Test
    public void date_fashion_6_2(){
        Solution solution = new Solution();
        assertEquals(0, solution.dateFashion(6, 2));
    }
}
