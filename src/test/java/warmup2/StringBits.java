package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBits {

    @Test
    public void string_bits_Hello(){
        Solution solution = new Solution();
        assertEquals("Hlo", solution.stringBits("Hello"));
    }

    @Test
    public void string_bits_Hi(){
        Solution solution = new Solution();
        assertEquals("H", solution.stringBits("Hi"));
    }

    @Test
    public void string_bits_Heeololeo(){
        Solution solution = new Solution();
        assertEquals("Hello", solution.stringBits("Heeololeo"));
    }

    @Test
    public void string_bits_HiHiHi(){
        Solution solution = new Solution();
        assertEquals("HHH", solution.stringBits("HiHiHi"));
    }

    @Test
    public void string_bits__(){
        Solution solution = new Solution();
        assertEquals("", solution.stringBits(""));
    }

    @Test
    public void string_bits_Greetings(){
        Solution solution = new Solution();
        assertEquals("Getns", solution.stringBits("Greetings"));
    }

    @Test
    public void string_bits_Chocoate(){
        Solution solution = new Solution();
        assertEquals("Coot", solution.stringBits("Chocoate"));
    }

    @Test
    public void string_bits_pi(){
        Solution solution = new Solution();
        assertEquals("p", solution.stringBits("pi"));
    }

    @Test
    public void string_bits_Hello_Kitten(){
        Solution solution = new Solution();
        assertEquals("HloKte", solution.stringBits("Hello Kitten"));
    }

    @Test
    public void string_bits_(){
        Solution solution = new Solution();
        assertEquals("happy", solution.stringBits("hxaxpxpxy"));
    }
}
