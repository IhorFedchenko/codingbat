package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCode {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void count_code_v01() {
        assertEquals(1, solution.countCode("aaacodebbb"));
    }

    @Test
    public void count_code_v02() {
        assertEquals(2, solution.countCode("codexxcode"));
    }

    @Test
    public void count_code_v03() {
        assertEquals(2, solution.countCode("cozexxcope"));
    }

    @Test
    public void count_code_v04() {
        assertEquals(1, solution.countCode("xxcozeyycop"));
    }

    @Test
    public void count_code_v05() {
        assertEquals(0, solution.countCode("cozcop"));
    }

    @Test
    public void count_code_v06() {
        assertEquals(0, solution.countCode("cozcop"));
    }

    @Test
    public void count_code_v07() {
        assertEquals(0, solution.countCode("abcxyz"));
    }

    @Test
    public void count_code_v08() {
        assertEquals(1, solution.countCode("code"));
    }

    @Test
    public void count_code_v09() {
        assertEquals(0, solution.countCode("ode"));
    }

    @Test
    public void count_code_v10() {
        assertEquals(0, solution.countCode("c"));
    }

    @Test
    public void count_code_v11() {
        assertEquals(0, solution.countCode(""));
    }

    @Test
    public void count_code_v12() {
        assertEquals(3, solution.countCode("AAcodeBBcoleCCccoreDD"));
    }

    @Test
    public void count_code_v13() {
        assertEquals(2, solution.countCode("AAcodeBBcoleCCccorfDD"));
    }

    @Test
    public void count_code_v14() {
        assertEquals(3, solution.countCode("coAcodeBcoleccoreDD"));
    }
}
