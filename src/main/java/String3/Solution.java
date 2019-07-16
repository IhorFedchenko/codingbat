package String3;

public class Solution {

    public int countYZ(String str) {
        str = str.toLowerCase();
        String[] wordsSet = str.split("[^a-z]");
        int result = 0;
        for (String word : wordsSet) {
            if (word.endsWith("y") || word.endsWith("z")) {
                result++;
            }
        }
        return result;
    }

    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    public boolean equalIsNot(String str) {
        int diffLengthIs = str.length() - str.replaceAll("is", "").length();
        int diffLengthNot = str.length() - str.replaceAll("not", "").length();
        int countIs = diffLengthIs / 2;
        int countNot = diffLengthNot / 3;
        return countIs == countNot;
    }

    public boolean gHappy(String str) {

        if (str.length() == 0) {
            return true;
        }
        if (str.length() == 1) {
            return false;
        }

        String input = str.replaceAll("ggg", "");
        input = input.replaceAll("gg", "");

        return input.length() < str.length() && !input.contains("g");
    }

    public int countTriple(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                result++;
            }
        }
        return result;
    }

    public int sumDigits(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
               result += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return result;
    }

    public String sameEnds(String string) {
    String result = "";
    int middle = string.length() / 2;
        for (int i = 0; i < middle ; i++) {
            String start = string.substring(0, middle - i);
            String end = string.substring(middle + i + string.length() % 2);
            if (start.equals(end)){
                result = start;
                break;
            }
        }
    return result;
    }
}
