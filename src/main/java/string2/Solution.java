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

    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(0, n - i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count * 2 - 1; i++) {
            if (i % 2 == 0) {
                result += word;
            } else {
                result += sep;
            }
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String found = str.substring(n);
        return found.contains(prefix);
    }

    public boolean xyzMiddle(String str) {
        String content = "xyz";
        int notTarget = str.length() - content.length();
        if (str.length() < content.length()) {
            return false;
        }
        if (notTarget % 2 == 0) {
            return str.substring(notTarget / 2).startsWith(content);
        }
        return str.substring(notTarget / 2).startsWith(content) ||
                str.substring((notTarget / 2) + 1).startsWith(content);
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == last) {
            return "";
        }
        return str.substring(first + 5, last);
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            result += str.substring(i + 1, i + 3);
            result += str.substring(i, i + 1);
        }
        return result;
    }

    public String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1);
            if (i > 0 && i < str.length() - 1) {
                if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                    result = result.substring(0, result.length() - 1);
                }
            }
        }
//         return str.replaceAll("z.p", "zp");
        return result;
    }

    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*') {
                result += str.charAt(i);
            }
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
                result += str.charAt(i);
            }
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    public String plusOut(String str, String word) {
        StringBuilder out = new StringBuilder(str);
        for (int i = 0; i < out.length(); ) {
            if (!str.startsWith(word, i)) {
                out.setCharAt(i++, '+');
            } else {
                i += word.length();
            }
        }
        return out.toString();
    }
}
