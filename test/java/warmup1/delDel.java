package warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class delDel {

    @Test
    public void delDel_adelbc() {
        Solution solution = new Solution();
        assertEquals("abc", solution.delDel("adelbc"));
    }

    @Test
    public void delDel_adelHello() {
        Solution solution = new Solution();
        assertEquals("aHello", solution.delDel("adelHello"));
    }

    @Test
    public void delDel_adedbc() {
        Solution solution = new Solution();
        assertEquals("adedbc", solution.delDel("adedbc"));
    }

    @Test
    public void delDel_abcdel() {
        Solution solution = new Solution();
        assertEquals("abcdel", solution.delDel("abcdel"));
    }

    @Test
    public void delDel_add() {
        Solution solution = new Solution();
        assertEquals("add", solution.delDel("add"));
    }

    @Test
    public void delDel_ad() {
        Solution solution = new Solution();
        assertEquals("ad", solution.delDel("ad"));
    }

    @Test
    public void delDel_a() {
        Solution solution = new Solution();
        assertEquals("a", solution.delDel("a"));
    }

    @Test
    public void delDel_() {
        Solution solution = new Solution();
        assertEquals("", solution.delDel(""));
    }

    @Test
    public void delDel_del() {
        Solution solution = new Solution();
        assertEquals("del", solution.delDel("del"));
    }

    @Test
    public void delDel_adel() {
        Solution solution = new Solution();
        assertEquals("a", solution.delDel("adel"));
    }

    @Test
    public void delDel_aadelbb() {
        Solution solution = new Solution();
        assertEquals("aadelbb", solution.delDel("aadelbb"));
    }
}
