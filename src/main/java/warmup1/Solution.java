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
        if (str.length() <= 1) {
            return str + str + str;
        }
        String insert = str.substring(0, 2);
        return insert + str + insert;
    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a > 9 && a < 21) || (b > 9 && b < 21);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }

    public boolean loneTeen(int a, int b) {
        return (a > 12 && a < 20) && !(b > 12 && b < 20) || !(a > 12 && a < 20) && (b > 12 && b < 20);
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {
        String result = "";
        if (str.equals("o")) {
            return "o";
        } else if (str.length() >= 2) {
//            str.charAt(0)=='o'
            if (str.substring(0, 1).equals("o")) {
                result += "o";
            }
//            str.charAt(1)=='z'
            if (str.substring(1, 2).equals("z")) {
                result += "z";
            }
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        int result = a;
        if (result < b) {
            result = b;
        }
        if (result < c) {
            result = c;
        }
        return result;
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        }
        if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else return 0;
    }

    public boolean in3050(int a, int b) {
        return (a > 29 && a < 41 && b > 29 && b < 41) || (a > 39 && a < 51 && b > 39 && b < 51);
    }

    public int max1020(int a, int b) {
        int result = 0;
        if (a > 9 && a < 21) {
            result = a;
        }
        if ((b > 9 && b < 21) && b > result) {
            result = b;
        }
        return result;
    }

    public boolean stringE(String str) {
        if (str.length() == 0 || str.length() == str.replace("e", "").length()) {
            return false;
        }
        return str.length() <= (str.replace("e", "").length() + 3);
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}