package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutDoubles {

    @Test
    public void without_doubles_v01(){
        Solution solution = new Solution();
        assertEquals(5, solution.withoutDoubles(2, 3, true));
    }

    @Test
    public void without_doubles_v02(){
        Solution solution = new Solution();
        assertEquals(7, solution.withoutDoubles(3, 3, true));
    }

    @Test
    public void without_doubles_v03(){
        Solution solution = new Solution();
        assertEquals(6, solution.withoutDoubles(3, 3, false));
    }

    @Test
    public void without_doubles_v04(){
        Solution solution = new Solution();
        assertEquals(5, solution.withoutDoubles(2, 3, false));
    }

    @Test
    public void without_doubles_v05(){
        Solution solution = new Solution();
        assertEquals(9, solution.withoutDoubles(5, 4, true));
    }

    @Test
    public void without_doubles_v06(){
        Solution solution = new Solution();
        assertEquals(9, solution.withoutDoubles(5, 4, false));
    }

    @Test
    public void without_doubles_v07(){
        Solution solution = new Solution();
        assertEquals(11, solution.withoutDoubles(5, 5, true));
    }

    @Test
    public void without_doubles_v08(){
        Solution solution = new Solution();
        assertEquals(10, solution.withoutDoubles(5, 5, false));
    }

    @Test
    public void without_doubles_v09(){
        Solution solution = new Solution();
        assertEquals(7, solution.withoutDoubles(6, 6, true));
    }

    @Test
    public void without_doubles_v10(){
        Solution solution = new Solution();
        assertEquals(12, solution.withoutDoubles(6, 6, false));
    }

    @Test
    public void without_doubles_v11(){
        Solution solution = new Solution();
        assertEquals(7, solution.withoutDoubles(1, 6, true));
    }

    @Test
    public void without_doubles_v12(){
        Solution solution = new Solution();
        assertEquals(7, solution.withoutDoubles(6, 1, false));
    }
}
