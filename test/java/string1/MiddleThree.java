package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleThree {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void middleThree_Candy() {
        assertEquals("and", solution.middleThree("Candy"));
    }

    @Test
    public void middleThree_and() {
        assertEquals("and", solution.middleThree("and"));
    }

    @Test
    public void middleThree_solving() {
        assertEquals("lvi", solution.middleThree("solving"));
    }

    @Test
    public void middleThree_Hi_yet_Hi() {
        assertEquals("yet", solution.middleThree("Hi yet Hi"));
    }

    @Test
    public void middleThree_java_yet_java() {
        assertEquals("yet", solution.middleThree("java yet java"));
    }

    @Test
    public void middleThree_Chocolate() {
        assertEquals("col", solution.middleThree("Chocolate"));
    }

    @Test
    public void middleThree_XabcxyzabcX() {
        assertEquals("xyz", solution.middleThree("XabcxyzabcX"));
    }

}
