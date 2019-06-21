package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBits {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void string_bits_Hello() {
        assertEquals("Hlo", solution.stringBits("Hello"));
    }

    @Test
    public void string_bits_Hi() {
        assertEquals("H", solution.stringBits("Hi"));
    }

    @Test
    public void string_bits_Heeololeo() {
        assertEquals("Hello", solution.stringBits("Heeololeo"));
    }

    @Test
    public void string_bits_HiHiHi() {
        assertEquals("HHH", solution.stringBits("HiHiHi"));
    }

    @Test
    public void string_bits__() {
        assertEquals("", solution.stringBits(""));
    }

    @Test
    public void string_bits_Greetings() {
        assertEquals("Getns", solution.stringBits("Greetings"));
    }

    @Test
    public void string_bits_Chocoate() {
        assertEquals("Coot", solution.stringBits("Chocoate"));
    }

    @Test
    public void string_bits_pi() {
        assertEquals("p", solution.stringBits("pi"));
    }

    @Test
    public void string_bits_Hello_Kitten() {
        assertEquals("HloKte", solution.stringBits("Hello Kitten"));
    }

    @Test
    public void string_bits_() {
        assertEquals("happy", solution.stringBits("hxaxpxpxy"));
    }
}
