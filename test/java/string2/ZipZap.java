package string2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZipZap {

    Solution solution = new Solution();

    @Test
    public void zip_zap_v01(){
        assertEquals("zpXzp", solution.zipZap("zipXzap"));
    }

    @Test
    public void zip_zap_v02(){
        assertEquals("zpzp", solution.zipZap("zopzop"));
    }

    @Test
    public void zip_zap_v03(){
        assertEquals("zzzpzp", solution.zipZap("zzzopzop"));
    }

    @Test
    public void zip_zap_v04(){
        assertEquals("zibzp", solution.zipZap("zibzap"));
    }

    @Test
    public void zip_zap_v05(){
        assertEquals("zp", solution.zipZap("zip"));
    }

    @Test
    public void zip_zap_v06(){
        assertEquals("zi", solution.zipZap("zi"));
    }

    @Test
    public void zip_zap_v07(){
        assertEquals("z", solution.zipZap("z"));
    }

    @Test
    public void zip_zap_v08(){
        assertEquals("", solution.zipZap(""));
    }

    @Test
    public void zip_zap_v09(){
        assertEquals("zp", solution.zipZap("zzp"));
    }

    @Test
    public void zip_zap_v10(){
        assertEquals("abcppp", solution.zipZap("abcppp"));
    }

    @Test
    public void zip_zap_v11(){
        assertEquals("azbcppp", solution.zipZap("azbcppp"));
    }

    @Test
    public void zip_zap_v12(){
        assertEquals("azbcpzp", solution.zipZap("azbcpzpp"));
    }
}
