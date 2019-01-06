package string1;

public class Solution {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
//        makeTags("i", "Yay") → "<i>Yay</i>"
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2) +
                str.substring(str.length() - 2) +
                str.substring(str.length() - 2);
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }

    public String nonStart(String a, String b) {
        String resultA = "";
        String resultB = "";
        if (a.length() > 1) {
            resultA = a.substring(1);
        }

        if (b.length() > 1) {
            resultB = b.substring(1);
        }
        return resultA + resultB;
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0));
        }
        return String.valueOf(str.charAt(str.length() - 1));
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if(str.length() <2){
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }
}
