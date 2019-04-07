package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndOther {

    @Test
    public void end_other_v01(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("Hiabc", "abc"));
    }

    @Test
    public void end_other_v02(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("AbC", "HiaBc"));
    }

    @Test
    public void end_other_v03(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("abc", "abXabc"));
    }

    @Test
    public void end_other_v04(){
        Solution solution =  new Solution();
        assertFalse(solution.endOther("Hiabc", "abcd"));
    }

    @Test
    public void end_other_v05(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("Hiabc", "bc"));
    }

    @Test
    public void end_other_v06(){
        Solution solution =  new Solution();
        assertFalse(solution.endOther("Hiabcx", "bc"));
    }

    @Test
    public void end_other_v07(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("abc", "abc"));
    }

    @Test
    public void end_other_v08(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("xyz", "12xyz"));
    }

    @Test
    public void end_other_v09(){
        Solution solution =  new Solution();
        assertFalse(solution.endOther("yz", "12xz"));
    }

    @Test
    public void end_other_v10(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("Z", "12xz"));
    }

    @Test
    public void end_other_v11(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("12", "12"));
    }

    @Test
    public void end_other_v12(){
        Solution solution =  new Solution();
        assertFalse(solution.endOther("abcXYZ", "abcDEF"));
    }

    @Test
    public void end_other_v13(){
        Solution solution =  new Solution();
        assertFalse(solution.endOther("abcXYZ", "abcDEF"));
    }
    @Test
    public void end_other_v14(){
        Solution solution =  new Solution();
        assertTrue(solution.endOther("Hiabc", "abc"));
    }
}
