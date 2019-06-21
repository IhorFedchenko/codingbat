package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeFront {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void de_front_v01() {
        assertEquals("llo", solution.deFront("Hello"));
    }

    @Test
    public void de_front_v02() {
        assertEquals("va", solution.deFront("java"));
    }

    @Test
    public void de_front_v03() {
        assertEquals("aay", solution.deFront("away"));
    }

    @Test
    public void de_front_v04() {
        assertEquals("ay", solution.deFront("axy"));
    }

    @Test
    public void de_front_v05() {
        assertEquals("abc", solution.deFront("abc"));
    }

    @Test
    public void de_front_v06() {
        assertEquals("by", solution.deFront("xby"));
    }

    @Test
    public void de_front_v07() {
        assertEquals("ab", solution.deFront("ab"));
    }

    @Test
    public void de_front_v08() {
        assertEquals("a", solution.deFront("ax"));
    }

    @Test
    public void de_front_v09() {
        assertEquals("ab", solution.deFront("axb"));
    }

    @Test
    public void de_front_v10() {
        assertEquals("aa", solution.deFront("aaa"));
    }

    @Test
    public void de_front_v11() {
        assertEquals("bc", solution.deFront("xbc"));
    }

    @Test
    public void de_front_v12() {
        assertEquals("bb", solution.deFront("bbb"));
    }

    @Test
    public void de_front_v13() {
        assertEquals("zz", solution.deFront("bazz"));
    }

    @Test
    public void de_front_v14() {
        assertEquals("", solution.deFront("ba"));
    }

    @Test
    public void de_front_v15() {
        assertEquals("abxyz", solution.deFront("abxyz"));
    }

    @Test
    public void de_front_v16() {
        assertEquals("", solution.deFront("hi"));
    }

    @Test
    public void de_front_v17() {
        assertEquals("s", solution.deFront("his"));
    }

    @Test
    public void de_front_v18() {
        assertEquals("", solution.deFront("xz"));
    }

    @Test
    public void de_front_v19() {
        assertEquals("z", solution.deFront("zzz"));
    }
}
