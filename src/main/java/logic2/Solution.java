package logic2;

public class Solution {

    public boolean makeBricks(int small, int big, int goal) {
        return goal % 5 <= small && big * 5 + small >= goal;
    }
}
