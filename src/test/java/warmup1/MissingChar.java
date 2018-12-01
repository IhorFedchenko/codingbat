package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingChar {

    Solution solution = new Solution();

    @Test
    public void missingChar01(){
        assertEquals("ktten", solution.missingChar("kitten", 1));
    }

    @Test
    public void missingChar02(){
        assertEquals("itten", solution.missingChar("kitten", 0));
    }

    @Test
    public void missingChar03(){
        assertEquals("kittn", solution.missingChar("kitten", 4));
    }

    @Test
    public void missingChar04(){
        assertEquals("i", solution.missingChar("Hi", 0));
    }

    @Test
    public void missingChar05(){
        assertEquals("H", solution.missingChar("Hi", 1));
    }

    @Test
    public void missingChar06(){
        assertEquals("ode", solution.missingChar("code", 0));
    }

    @Test
    public void missingChar07(){
        assertEquals("cde", solution.missingChar("code", 1));
    }

    @Test
    public void missingChar08(){
        assertEquals("coe", solution.missingChar("code", 2));
    }

    @Test
    public void missingChar09(){
        assertEquals("cod", solution.missingChar("code", 3));
    }

    @Test
    public void missingChar10(){
        assertEquals("chocolat", solution.missingChar("chocolate", 8));
    }
}
