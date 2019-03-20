package logic2;

public class Solution {

    public boolean makeBricks(int small, int big, int goal) {
        return goal % 5 <= small && big * 5 + small >= goal;
    }

    public int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        }
        if (a == b) {
            return c;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private int fixTeen(int n) {
        if (n > 12 && n < 15 || n > 16 && n < 20) {
            return 0;
        }
        return n;
    }
}
