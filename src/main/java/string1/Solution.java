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
        return "<"+tag+">"+word+"</"+tag+">";
    }
}
