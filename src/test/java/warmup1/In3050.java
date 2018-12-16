package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class In3050 {

    @Test
    public void in3050_v01(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(30, 31));
    }

    @Test
    public void in3050_v02(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(30, 41));
    }

    @Test
    public void in3050_v03(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(40, 50));
    }

    @Test
    public void in3050_v04(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(40, 51));
    }

    @Test
    public void in3050_v05(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(39, 50));
    }

    @Test
    public void in3050_v06(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(50, 39));
    }

    @Test
    public void in3050_v07(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(40, 39));
    }

    @Test
    public void in3050_v08(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(49, 48));
    }

    @Test
    public void in3050_v09(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(50, 40));
    }

    @Test
    public void in3050_v10(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(50, 51));
    }

    @Test
    public void in3050_v11(){
        Solution solution = new Solution();
        assertTrue(solution.in3050(35, 36));
    }

    @Test
    public void in3050_v12(){
        Solution solution = new Solution();
        assertFalse(solution.in3050(35, 45));
    }

}
