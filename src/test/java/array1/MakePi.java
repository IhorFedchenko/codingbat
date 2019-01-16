package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MakePi {

    @Test
    public void make_pi(){
        int[] expected = {3,1,4};
        Solution solution = new Solution();
        assertEquals(Arrays.toString(expected), Arrays.toString(solution.makePi()));
    }
}
