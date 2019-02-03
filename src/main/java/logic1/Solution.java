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

    public int dateFashion(int you, int date) {
        if (you > 7 && date > 2 || date > 7 && you > 2){
            return 2;
        }
        if (you <= 2 || date <= 2){
            return 0;
        }
        return 1;
    }
}
