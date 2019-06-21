package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeOutWord {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_out_word_v01() {
        assertEquals("<<Yay>>", solution.makeOutWord("<<>>", "Yay"));
    }

    @Test
    public void make_out_word_v02() {
        assertEquals("<<WooHoo>>", solution.makeOutWord("<<>>", "WooHoo"));
    }

    @Test
    public void make_out_word_v03() {
        assertEquals("[[word]]", solution.makeOutWord("[[]]", "word"));
    }

    @Test
    public void make_out_word_v04() {
        assertEquals("HHHellooo", solution.makeOutWord("HHoo", "Hello"));
    }

    @Test
    public void make_out_word_v05() {
        assertEquals("abYAYyz", solution.makeOutWord("abyz", "YAY"));
    }
}
