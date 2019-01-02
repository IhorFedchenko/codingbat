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
        if (str.length() < 3){
            return "";
        }
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()){
            return a+b+a;
        }
        return b+a+b;
    }
}
