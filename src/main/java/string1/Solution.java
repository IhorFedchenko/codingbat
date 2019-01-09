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
        if (str.length() < 2) {
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public boolean hasBad(String str) {
        if (str.equals("bad")) {
            return true;
        }
        if (str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))) {
            return true;
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        return (str + "@@").substring(0, 2);
    }

    public String lastChars(String a, String b) {
        a = a+"@";
        if (b.equals("")){
            b = "@";
        }
        return a.substring(0,1) + b.substring(b.length()-1);
    }

    public String conCat(String a, String b) {
        if (a.equals("")){
            return b;
        }
        if (b.equals("")){
            return a;
        }
        if (a.substring(a.length()-1).equals(b.substring(0,1))){
            return a+b.substring(1);
        }
        return a+b;
    }
}
