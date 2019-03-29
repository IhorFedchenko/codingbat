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
}
