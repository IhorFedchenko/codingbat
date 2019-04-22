package string2;

public class Solution {

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        String found = "hi";
        int full = str.length();
        str = str.replace(found, "");
        int cut = str.length();
        return (full - cut) / found.length();
    }

    public boolean catDog(String str) {
        return str.replace("dog", "").length() ==
                str.replace("cat", "").length();
    }

    public int countCode(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                result++;
                i += 3;
            }
        }
        return result;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() < b.length()) {
            return b.endsWith(a);
        }
        return a.endsWith(b);
    }

    public boolean xyzThere(String str) {
        str = str.replace(".xyz", " ");
        return str.contains("xyz");
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        return (str.indexOf('x') == -1) || str.lastIndexOf('x') < str.lastIndexOf('y');
    }

    public String mixString(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String result = "";


        if (aLength == bLength) {
            for (int i = 0; i < a.length(); i++) {
                result += a.charAt(i);
                result += b.charAt(i);
            }
        }
        if (aLength < bLength) {
            String bMix = b.substring(0, aLength);
            String bSufix = b.substring(aLength);
            for (int i = 0; i < a.length(); i++) {
                result += a.charAt(i);
                result += b.charAt(i);
            }
            result += bSufix;
        }

        if (aLength > bLength) {
            String aMix = a.substring(0, bLength);
            String aSufix = a.substring(bLength);
            for (int i = 0; i < b.length(); i++) {
                result += a.charAt(i);
                result += b.charAt(i);
            }
            result += aSufix;
        }
        return result;
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }
}
