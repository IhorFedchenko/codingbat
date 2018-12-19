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
        if (str.length() < 4){
            cut = str;
        } else {
           cut = str.substring(0,3);
        }

            for (int i = 0; i < n; i++) {
                result+= cut;
            }
        return result;
    }
}
