package warmup2;

public class Solution {

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        String cut;
        if (str.length() < 4) {
            cut = str;
        } else {
            cut = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            result += cut;
        }
        return result;
    }

    int countXX(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("xx")) {
                result++;
            }
        }
        return result;
    }

    boolean doubleX(String str) {
        if (str.replaceAll("xx", "").length() == str.length() || str.indexOf("x") == str.length() - 1) {
            return false;
        }
        return str.substring(str.indexOf("x"), str.indexOf("x") + 2).equals("xx");
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                result++;
            }
        }
        return result;
    }

    public int arrayCount9(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                result++;
            }
        }
        return result;
    }

    public boolean arrayFront9(int[] nums) {
        int checkPoint = 4;
        if (checkPoint >= nums.length) {
            checkPoint = nums.length;
        }
        for (int i = 0; i < checkPoint; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        for (int i = 0; i < nums.length; i++) {
            if (one && two && three) {
                return true;
            }
            if (nums[i] == 1) {
                one = true;
            }
            if (nums[i] == 2) {
                two = true;
            }
            if (nums[i] == 3) {
                three = true;
            }
        }
        return one && two && three;
    }

    public int stringMatch(String a, String b) {
        int result = 0;
//        int len = Math.min(a.length(), b.length());
        int stringLength = a.length();

        if (b.length() < a.length()) {
            stringLength = b.length();
        }

        for (int i = 0; i < stringLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                result++;
            }
        }
        return result;
    }

    public String altPairs(String str) {
        String result = "";
        int jump = 0;
        for (int i = 0; i < str.length() ; i++) {
            result+= str.charAt(i);
            jump++;
            if (jump == 2){
                i+=2;
                jump = 0;
            }
        }
        return result;
    }
}
