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
        if (you > 7 && date > 2 || date > 7 && you > 2) {
            return 2;
        }
        if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        }
        return temp >= 60 && temp <= 90;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed < 61) {
            return 0;
        }
        if (speed > 80) {
            return 2;
        }
        return 1;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return 20;
        }
        return a + b;
    }
}
