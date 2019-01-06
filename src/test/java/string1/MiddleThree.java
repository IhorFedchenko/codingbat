package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleThree {

    @Test
    public void middleThree_Candy(){
        Solution solution = new Solution();
        assertEquals("and", solution.middleThree("Candy"));
    }

    @Test
    public void middleThree_and(){
        Solution solution = new Solution();
        assertEquals("and", solution.middleThree("and"));
    }

    @Test
    public void middleThree_solving(){
        Solution solution = new Solution();
        assertEquals("lvi", solution.middleThree("solving"));
    }

    @Test
    public void middleThree_Hi_yet_Hi(){
        Solution solution = new Solution();
        assertEquals("yet", solution.middleThree("Hi yet Hi"));
    }

    @Test
    public void middleThree_java_yet_java(){
        Solution solution = new Solution();
        assertEquals("yet", solution.middleThree("java yet java"));
    }

    @Test
    public void middleThree_Chocolate(){
        Solution solution = new Solution();
        assertEquals("col", solution.middleThree("Chocolate"));
    }
    @Test
    public void middleThree_XabcxyzabcX(){
        Solution solution = new Solution();
        assertEquals("xyz", solution.middleThree("XabcxyzabcX"));
    }

}
