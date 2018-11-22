package warmup1;

public class Solution {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        } else return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else return a + b;
    }

    public int diff21(int n) {
        if (n > 21)
            return (n - 21) * 2;
        else
            return 21 - n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else return false;
    }

    public boolean makes10(int a, int b) {
        return (a==10 || b==10) ||(a+b==10);
        //return (a == 10 || b == 10 || a+b == 10);
    }

}
