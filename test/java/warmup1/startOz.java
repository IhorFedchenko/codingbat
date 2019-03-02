package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class startOz {

    @Test
    public void start_ozymandias(){
        Solution solution = new Solution();
        assertEquals("oz", solution.startOz("ozymandias"));
    }

    @Test
    public void start_bzoo(){
        Solution solution = new Solution();
        assertEquals("z", solution.startOz("bzoo"));
    }

    @Test
    public void start_oxx(){
        Solution solution = new Solution();
        assertEquals("o", solution.startOz("oxx"));
    }

    @Test
    public void start_oz(){
        Solution solution = new Solution();
        assertEquals("oz", solution.startOz("oz"));
    }

    @Test
    public void start_ounce(){
        Solution solution = new Solution();
        assertEquals("o", solution.startOz("ounce"));
    }

    @Test
    public void start_o(){
        Solution solution = new Solution();
        assertEquals("o", solution.startOz("o"));
    }

    @Test
    public void start_abc(){
        Solution solution = new Solution();
        assertEquals("", solution.startOz("abc"));
    }

    @Test
    public void start__(){
        Solution solution = new Solution();
        assertEquals("", solution.startOz(""));
    }

    @Test
    public void start_zoo(){
        Solution solution = new Solution();
        assertEquals("", solution.startOz("zoo"));
    }

    @Test
    public void start_aztec(){
        Solution solution = new Solution();
        assertEquals("z", solution.startOz("aztec"));
    }

    @Test
    public void start_zzzz(){
        Solution solution = new Solution();
        assertEquals("z", solution.startOz("zzzz"));
    }

    @Test
    public void start_oznic(){
        Solution solution = new Solution();
        assertEquals("oz", solution.startOz("oznic"));
    }


}
