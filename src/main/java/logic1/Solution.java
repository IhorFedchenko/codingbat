package logic1;

public class Solution {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars > 39 && cigars < 61) {
            return true;
        }
        if (cigars > 60) {
            return isWeekend;
        }
        return false;
    }
}
