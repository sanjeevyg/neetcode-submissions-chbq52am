class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = "";

        int i = 0;
        while (i < strs[0].length()) {
            char lastChar = strs[0].charAt(i);
            for(String s : strs) {
                if (i >= s.length() || lastChar != s.charAt(i)) {
                    return ans;
                }
            }
            ans += lastChar;
            i++;
        }
        return ans;
    }
}