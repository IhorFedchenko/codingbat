package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeaParty {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void tea_party_v01() {
        assertEquals(1, solution.teaParty(6, 8));
    }

    @Test
    public void tea_party_v02() {
        assertEquals(0, solution.teaParty(3, 8));
    }

    @Test
    public void tea_party_v03() {
        assertEquals(2, solution.teaParty(20, 6));
    }

    @Test
    public void tea_party_v04() {
        assertEquals(2, solution.teaParty(12, 6));
    }

    @Test
    public void tea_party_v05() {
        assertEquals(1, solution.teaParty(11, 6));
    }

    @Test
    public void tea_party_v06() {
        assertEquals(0, solution.teaParty(11, 4));
    }

    @Test
    public void tea_party_v07() {
        assertEquals(0, solution.teaParty(4, 5));
    }

    @Test
    public void tea_party_v08() {
        assertEquals(1, solution.teaParty(5, 5));
    }

    @Test
    public void tea_party_v09() {
        assertEquals(1, solution.teaParty(6, 6));
    }

    @Test
    public void tea_party_v10() {
        assertEquals(2, solution.teaParty(5, 10));
    }

    @Test
    public void tea_party_v11() {
        assertEquals(1, solution.teaParty(5, 9));
    }

    @Test
    public void tea_party_v12() {
        assertEquals(0, solution.teaParty(10, 4));
    }

    @Test
    public void tea_party_v13() {
        assertEquals(2, solution.teaParty(10, 20));
    }
}
