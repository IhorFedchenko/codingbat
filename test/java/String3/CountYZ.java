package String3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountYZ {

    Solution solution = new Solution();

    @Test
    public void count_yz_v01(){
        assertEquals(2, solution.countYZ("fez day"));
    }

    @Test
    public void count_yz_v02(){
        assertEquals(2, solution.countYZ("day fez"));
    }

    @Test
    public void count_yz_v03(){
        assertEquals(2, solution.countYZ("day fyyyz"));
    }

    @Test
    public void count_yz_v04(){
        assertEquals(1, solution.countYZ("day yak"));
    }

    @Test
    public void count_yz_v05(){
        assertEquals(1, solution.countYZ("day:yak"));
    }

    @Test
    public void count_yz_v06(){
        assertEquals(2, solution.countYZ("!!day--yaz!!"));
    }

    @Test
    public void count_yz_v07(){
        assertEquals(0, solution.countYZ("yak zak"));
    }

    @Test
    public void count_yz_v08(){
        assertEquals(2, solution.countYZ("DAY abc XYZ"));
    }

    @Test
    public void count_yz_v09(){
        assertEquals(3, solution.countYZ("aaz yyz my"));
    }

    @Test
    public void count_yz_v10(){
        assertEquals(2, solution.countYZ("y2bz"));
    }

    @Test
    public void count_yz_v11(){
        assertEquals(0, solution.countYZ("zxyx"));
    }
}
