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
}
