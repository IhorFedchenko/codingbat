package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class startOz {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void start_ozymandias() {
        assertEquals("oz", solution.startOz("ozymandias"));
    }

    @Test
    public void start_bzoo() {
        assertEquals("z", solution.startOz("bzoo"));
    }

    @Test
    public void start_oxx() {
        assertEquals("o", solution.startOz("oxx"));
    }

    @Test
    public void start_oz() {
        assertEquals("oz", solution.startOz("oz"));
    }

    @Test
    public void start_ounce() {
        assertEquals("o", solution.startOz("ounce"));
    }

    @Test
    public void start_o() {
        assertEquals("o", solution.startOz("o"));
    }

    @Test
    public void start_abc() {
        assertEquals("", solution.startOz("abc"));
    }

    @Test
    public void start__() {
        assertEquals("", solution.startOz(""));
    }

    @Test
    public void start_zoo() {
        assertEquals("", solution.startOz("zoo"));
    }

    @Test
    public void start_aztec() {
        assertEquals("z", solution.startOz("aztec"));
    }

    @Test
    public void start_zzzz() {
        assertEquals("z", solution.startOz("zzzz"));
    }

    @Test
    public void start_oznic() {
        assertEquals("oz", solution.startOz("oznic"));
    }
}
