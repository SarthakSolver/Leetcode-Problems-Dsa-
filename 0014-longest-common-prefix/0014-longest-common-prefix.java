import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);  // Sort strings lexicographically

        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        String s = "";
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                s += first.charAt(i);
            } else {
                break;
            }
        }

        return s;
    }
}
