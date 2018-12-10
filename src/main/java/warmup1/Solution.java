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
        return (a == 10 || b == 10) || (a + b == 10);
        //return (a == 10 || b == 10 || a+b == 10);
    }

    public boolean nearHundred(int n) {
        return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((a > 0 && b < 0 && !negative) || (a < 0 && b > 0 && !negative)) {
            return true;
        } else if (a < 0 && b < 0 && negative) {
            return true;
        } else return false;
    }

    public String notString(String str) {
        if (str.length() < 3) {
            return "not " + str;
        } else if (str.substring(0, 3).equals("not")) {
            return str;
        } else return "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.replaceFirst(String.valueOf(str.charAt(n)), "");
    }

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            str = str.substring(1, str.length() - 1);
            return last + str + first;
        }
    }

    public String front3(String str) {
        String result = new String();
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        for (int i = 0; i < 3; i++) {
            result += str;
        }
        return result;
    }

    public String backAround(String str) {
        String tmp = str.substring(str.length() - 1);
        return tmp + str + tmp;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        String result = new String();
        if (str.length() <= 1){
            return str + str +str;
        }
        String insert = str.substring(0,2);
        return insert+str+insert;
    }
}