package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartWord {

    @Test
    public void start_word_v01(){
        Solution solution = new Solution();
        assertEquals("hi", solution.startWord("hippo", "hi"));
    }

    @Test
    public void start_word_v02(){
        Solution solution = new Solution();
        assertEquals("hip", solution.startWord("hippo", "xip"));
    }

    @Test
    public void start_word_v03(){
        Solution solution = new Solution();
        assertEquals("h", solution.startWord("hippo", "i"));
    }

    @Test
    public void start_word_v04(){
        Solution solution = new Solution();
        assertEquals("", solution.startWord("hippo", "ix"));
    }

    @Test
    public void start_word_v05(){
        Solution solution = new Solution();
        assertEquals("", solution.startWord("h", "ix"));
    }

    @Test
    public void start_word_v06(){
        Solution solution = new Solution();
        assertEquals("", solution.startWord("", "i"));
    }

    @Test
    public void start_word_v07(){
        Solution solution = new Solution();
        assertEquals("hi", solution.startWord("hip", "zi"));
    }

    @Test
    public void start_word_v08(){
        Solution solution = new Solution();
        assertEquals("hip", solution.startWord("hip", "zip"));
    }

    @Test
    public void start_word_v09(){
        Solution solution = new Solution();
        assertEquals("", solution.startWord("hip", "zig"));
    }

    @Test
    public void start_word_v10(){
        Solution solution = new Solution();
        assertEquals("h", solution.startWord("h", "z"));
    }

    @Test
    public void start_word_v11(){
        Solution solution = new Solution();
        assertEquals("hippo", solution.startWord("hippo", "xippo"));
    }

    @Test
    public void start_word_v12(){
        Solution solution = new Solution();
        assertEquals("", solution.startWord("hippo", "xyz"));
    }

    @Test
    public void start_word_v13(){
        Solution solution = new Solution();
        assertEquals("hip", solution.startWord("hippo", "hip"));
    }

    @Test
    public void start_word_v14(){
        Solution solution = new Solution();
        assertEquals("kit", solution.startWord("kitten", "cit"));
    }

    @Test
    public void start_word_v15(){
        Solution solution = new Solution();
        assertEquals("kit", solution.startWord("kit", "cit"));
    }
}
