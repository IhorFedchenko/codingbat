package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartWord {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void start_word_v01() {
        assertEquals("hi", solution.startWord("hippo", "hi"));
    }

    @Test
    public void start_word_v02() {
        assertEquals("hip", solution.startWord("hippo", "xip"));
    }

    @Test
    public void start_word_v03() {
        assertEquals("h", solution.startWord("hippo", "i"));
    }

    @Test
    public void start_word_v04() {
        assertEquals("", solution.startWord("hippo", "ix"));
    }

    @Test
    public void start_word_v05() {
        assertEquals("", solution.startWord("h", "ix"));
    }

    @Test
    public void start_word_v06() {
        assertEquals("", solution.startWord("", "i"));
    }

    @Test
    public void start_word_v07() {
        assertEquals("hi", solution.startWord("hip", "zi"));
    }

    @Test
    public void start_word_v08() {
        assertEquals("hip", solution.startWord("hip", "zip"));
    }

    @Test
    public void start_word_v09() {
        assertEquals("", solution.startWord("hip", "zig"));
    }

    @Test
    public void start_word_v10() {
        assertEquals("h", solution.startWord("h", "z"));
    }

    @Test
    public void start_word_v11() {
        assertEquals("hippo", solution.startWord("hippo", "xippo"));
    }

    @Test
    public void start_word_v12() {
        assertEquals("", solution.startWord("hippo", "xyz"));
    }

    @Test
    public void start_word_v13() {
        assertEquals("hip", solution.startWord("hippo", "hip"));
    }

    @Test
    public void start_word_v14() {
        assertEquals("kit", solution.startWord("kitten", "cit"));
    }

    @Test
    public void start_word_v15() {
        assertEquals("kit", solution.startWord("kit", "cit"));
    }
}
