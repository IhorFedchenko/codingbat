package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeTags {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void make_tags_v01() {
        assertEquals("<i>Yay</i>", solution.makeTags("i", "Yay"));
    }

    @Test
    public void make_tags_v02() {
        assertEquals("<i>Hello</i>", solution.makeTags("i", "Hello"));
    }

    @Test
    public void make_tags_v03() {
        assertEquals("<cite>Yay</cite>", solution.makeTags("cite", "Yay"));
    }

    @Test
    public void make_tags_v04() {
        assertEquals("<address>here</address>", solution.makeTags("address", "here"));
    }

    @Test
    public void make_tags_v05() {
        assertEquals("<body>Heart</body>", solution.makeTags("body", "Heart"));
    }

    @Test
    public void make_tags_v06() {
        assertEquals("<i>i</i>", solution.makeTags("i", "i"));
    }

    @Test
    public void make_tags_v07() {
        assertEquals("<i></i>", solution.makeTags("i", ""));
    }
}
