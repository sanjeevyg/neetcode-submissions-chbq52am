class Solution {
    public String minWindow(String s, String t) {
        int[] balance = new int[128];
        for(char c : t.toCharArray()) {
            balance[c]++;
        }

        int bestStart = 0;
        int left = 0;
        int bestLength = Integer.MAX_VALUE;
        int missing = t.length();

        for(int right = 0; right < s.length(); right++) {
            int incoming = s.charAt(right);

            if(balance[incoming] > 0) {
                missing--;
            }
            balance[incoming]--;

            while (missing == 0) {
                int window = right - left + 1;
                if(window < bestLength) {
                    bestLength = window;
                    bestStart = left;
                }
                int outgoing = s.charAt(left);
                balance[outgoing]++;
                left++;
                if(balance[outgoing] > 0) {
                    missing++;
                }
            }

        }
            return  bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLength);
        
    }
}
