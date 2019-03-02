package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeOutWord {

    @Test
    public void make_out_word_v01(){
        Solution solution = new Solution();
        assertEquals("<<Yay>>", solution.makeOutWord("<<>>", "Yay"));
    }

    @Test
    public void make_out_word_v02(){
        Solution solution = new Solution();
        assertEquals("<<WooHoo>>", solution.makeOutWord("<<>>", "WooHoo"));
    }

    @Test
    public void make_out_word_v03(){
        Solution solution = new Solution();
        assertEquals("[[word]]", solution.makeOutWord("[[]]", "word"));
    }

    @Test
    public void make_out_word_v04(){
        Solution solution = new Solution();
        assertEquals("HHHellooo", solution.makeOutWord("HHoo", "Hello"));
    }

    @Test
    public void make_out_word_v05(){
        Solution solution = new Solution();
        assertEquals("abYAYyz", solution.makeOutWord("abyz", "YAY"));
    }
}
