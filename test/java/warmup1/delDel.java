package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class delDel {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void delDel_adelbc() {
        assertEquals("abc", solution.delDel("adelbc"));
    }

    @Test
    public void delDel_adelHello() {
        assertEquals("aHello", solution.delDel("adelHello"));
    }

    @Test
    public void delDel_adedbc() {
        assertEquals("adedbc", solution.delDel("adedbc"));
    }

    @Test
    public void delDel_abcdel() {
        assertEquals("abcdel", solution.delDel("abcdel"));
    }

    @Test
    public void delDel_add() {
        assertEquals("add", solution.delDel("add"));
    }

    @Test
    public void delDel_ad() {
        assertEquals("ad", solution.delDel("ad"));
    }

    @Test
    public void delDel_a() {
        assertEquals("a", solution.delDel("a"));
    }

    @Test
    public void delDel_() {
        assertEquals("", solution.delDel(""));
    }

    @Test
    public void delDel_del() {
        assertEquals("del", solution.delDel("del"));
    }

    @Test
    public void delDel_adel() {
        assertEquals("a", solution.delDel("adel"));
    }

    @Test
    public void delDel_aadelbb() {
        assertEquals("aadelbb", solution.delDel("aadelbb"));
    }
}
