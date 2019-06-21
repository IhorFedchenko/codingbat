package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFashion {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void date_fashion_5_10() {
        assertEquals(2, solution.dateFashion(5, 10));
    }

    @Test
    public void date_fashion_5_2() {
        assertEquals(0, solution.dateFashion(5, 2));
    }

    @Test
    public void date_fashion_5_5() {
        assertEquals(1, solution.dateFashion(5, 5));
    }

    @Test
    public void date_fashion_3_3() {
        assertEquals(1, solution.dateFashion(3, 3));
    }

    @Test
    public void date_fashion_10_2() {
        assertEquals(0, solution.dateFashion(10, 2));
    }

    @Test
    public void date_fashion_2_9() {
        assertEquals(0, solution.dateFashion(2, 9));
    }

    @Test
    public void date_fashion_9_9() {
        assertEquals(2, solution.dateFashion(9, 9));
    }

    @Test
    public void date_fashion_10_5() {
        assertEquals(2, solution.dateFashion(10, 5));
    }

    @Test
    public void date_fashion_2_2() {
        assertEquals(0, solution.dateFashion(2, 2));
    }

    @Test
    public void date_fashion_3_7() {
        assertEquals(1, solution.dateFashion(3, 7));
    }

    @Test
    public void date_fashion_2_7() {
        assertEquals(0, solution.dateFashion(2, 7));
    }

    @Test
    public void date_fashion_6_2() {
        assertEquals(0, solution.dateFashion(6, 2));
    }
}
