package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringYak {

    @Test
    public void string_yak_yakpak(){
        Solution solution = new Solution();
        assertEquals("pak", solution.stringYak("yakpak"));
    }

    @Test
    public void string_yak_pakyak(){
        Solution solution = new Solution();
        assertEquals("pak", solution.stringYak("pakyak"));
    }

    @Test
    public void string_yak_yak123ya(){
        Solution solution = new Solution();
        assertEquals("123ya", solution.stringYak("yak123ya"));
    }

    @Test
    public void string_yak_yak(){
        Solution solution = new Solution();
        assertEquals("", solution.stringYak("yak"));
    }

    @Test
    public void string_yak_yakxxxyak(){
        Solution solution = new Solution();
        assertEquals("xxx", solution.stringYak("yakxxxyak"));
    }

    @Test
    public void string_yak_HiyakHi(){
        Solution solution = new Solution();
        assertEquals("HiHi", solution.stringYak("HiyakHi"));
    }

    @Test
    public void string_yak_xxxyakyyyakzzz(){
        Solution solution = new Solution();
        assertEquals("xxxyyzzz", solution.stringYak("xxxyakyyyakzzz"));
    }
}
