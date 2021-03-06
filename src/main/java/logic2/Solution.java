package logic2;

import java.util.Arrays;

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

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int n) {
        if (n % 10 < 5)
            return n - (n % 10);
        else
            return n + (10 - (n % 10));
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21) {
            a = 0;
        }
        if (b > 21) {
            b = 0;
        }
        if (a < b) {
            return b;
        }
        return a;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] evenlyarray = {a, b, c};
        Arrays.sort(evenlyarray);
        return evenlyarray[1] - evenlyarray[0] == evenlyarray[2] - evenlyarray[1];
    }

    public int makeChocolate(int small, int big, int goal) {
        if (big * 5 + small < goal || small < goal % 5) return -1;
        if (big * 5 <= goal) return goal - big * 5;
        return goal % 5;
    }
}
