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
        for (int i = 0; i < str.length()-1 ; i++) {
            if (str.substring(i, i+1).equals("xx")){
                result++;
            }
        }
        return result;
    }
}
