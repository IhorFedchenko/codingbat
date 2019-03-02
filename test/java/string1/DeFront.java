package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeFront {

    @Test
    public void de_front_v01(){
        Solution solution = new Solution();
        assertEquals("llo", solution.deFront("Hello"));
    }

    @Test
    public void de_front_v02(){
        Solution solution = new Solution();
        assertEquals("va", solution.deFront("java"));
    }

    @Test
    public void de_front_v03(){
        Solution solution = new Solution();
        assertEquals("aay", solution.deFront("away"));
    }

    @Test
    public void de_front_v04(){
        Solution solution = new Solution();
        assertEquals("ay", solution.deFront("axy"));
    }

    @Test
    public void de_front_v05(){
        Solution solution = new Solution();
        assertEquals("abc", solution.deFront("abc"));
    }

    @Test
    public void de_front_v06(){
        Solution solution = new Solution();
        assertEquals("by", solution.deFront("xby"));
    }

    @Test
    public void de_front_v07(){
        Solution solution = new Solution();
        assertEquals("ab", solution.deFront("ab"));
    }

    @Test
    public void de_front_v08(){
        Solution solution = new Solution();
        assertEquals("a", solution.deFront("ax"));
    }

    @Test
    public void de_front_v09(){
        Solution solution = new Solution();
        assertEquals("ab", solution.deFront("axb"));
    }

    @Test
    public void de_front_v10(){
        Solution solution = new Solution();
        assertEquals("aa", solution.deFront("aaa"));
    }

    @Test
    public void de_front_v11(){
        Solution solution = new Solution();
        assertEquals("bc", solution.deFront("xbc"));
    }

    @Test
    public void de_front_v12(){
        Solution solution = new Solution();
        assertEquals("bb", solution.deFront("bbb"));
    }

    @Test
    public void de_front_v13(){
        Solution solution = new Solution();
        assertEquals("zz", solution.deFront("bazz"));
    }

    @Test
    public void de_front_v14(){
        Solution solution = new Solution();
        assertEquals("", solution.deFront("ba"));
    }

    @Test
    public void de_front_v15(){
        Solution solution = new Solution();
        assertEquals("abxyz", solution.deFront("abxyz"));
    }

    @Test
    public void de_front_v16(){
        Solution solution = new Solution();
        assertEquals("", solution.deFront("hi"));
    }

    @Test
    public void de_front_v17(){
        Solution solution = new Solution();
        assertEquals("s", solution.deFront("his"));
    }

    @Test
    public void de_front_v18(){
        Solution solution = new Solution();
        assertEquals("", solution.deFront("xz"));
    }

    @Test
    public void de_front_v19(){
        Solution solution = new Solution();
        assertEquals("z", solution.deFront("zzz"));
    }
}
