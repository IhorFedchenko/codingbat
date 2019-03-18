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
}
