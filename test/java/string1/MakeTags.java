package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeTags {

    @Test
    public void make_tags_v01(){
        Solution solution = new Solution();
        assertEquals("<i>Yay</i>", solution.makeTags("i", "Yay"));
    }

    @Test
    public void make_tags_v02(){
        Solution solution = new Solution();
        assertEquals("<i>Hello</i>", solution.makeTags("i", "Hello"));
    }

    @Test
    public void make_tags_v03(){
        Solution solution = new Solution();
        assertEquals("<cite>Yay</cite>", solution.makeTags("cite", "Yay"));
    }

    @Test
    public void make_tags_v04(){
        Solution solution = new Solution();
        assertEquals("<address>here</address>", solution.makeTags("address", "here"));
    }

    @Test
    public void make_tags_v05(){
        Solution solution = new Solution();
        assertEquals("<body>Heart</body>", solution.makeTags("body", "Heart"));
    }

    @Test
    public void make_tags_v06(){
        Solution solution = new Solution();
        assertEquals("<i>i</i>", solution.makeTags("i", "i"));
    }

    @Test
    public void make_tags_v07(){
        Solution solution = new Solution();
        assertEquals("<i></i>", solution.makeTags("i", ""));
    }
}
