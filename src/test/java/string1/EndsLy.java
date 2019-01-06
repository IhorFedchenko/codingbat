package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndsLy {

    @Test
    public void ends_ly_v01(){
        Solution solution =  new Solution();
        assertTrue(solution.endsLy("oddly"));
    }

    @Test
    public void ends_ly_v02(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy("y"));
    }

    @Test
    public void ends_ly_v03(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy("oddy"));
    }

    @Test
    public void ends_ly_v04(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy("oddl"));
    }

    @Test
    public void ends_ly_v05(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy("olydd"));
    }

    @Test
    public void ends_ly_v06(){
        Solution solution =  new Solution();
        assertTrue(solution.endsLy("ly"));
    }

    @Test
    public void ends_ly_v07(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy(""));
    }

    @Test
    public void ends_ly_v08(){
        Solution solution =  new Solution();
        assertFalse(solution.endsLy("falsey"));
    }

    @Test
    public void ends_ly_v09(){
        Solution solution =  new Solution();
        assertTrue(solution.endsLy("enenly"));
    }
}
