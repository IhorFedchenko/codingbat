package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringYak {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_yak_yakpak() {
        assertEquals("pak", solution.stringYak("yakpak"));
    }

    @Test
    public void string_yak_pakyak() {
        assertEquals("pak", solution.stringYak("pakyak"));
    }

    @Test
    public void string_yak_yak123ya() {
        assertEquals("123ya", solution.stringYak("yak123ya"));
    }

    @Test
    public void string_yak_yak() {
        assertEquals("", solution.stringYak("yak"));
    }

    @Test
    public void string_yak_yakxxxyak() {
        assertEquals("xxx", solution.stringYak("yakxxxyak"));
    }

    @Test
    public void string_yak_HiyakHi() {
        assertEquals("HiHi", solution.stringYak("HiyakHi"));
    }

    @Test
    public void string_yak_xxxyakyyyakzzz() {
        assertEquals("xxxyyzzz", solution.stringYak("xxxyakyyyakzzz"));
    }
}
