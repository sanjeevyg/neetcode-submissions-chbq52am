class Solution {
    public String minWindow(String s, String t) {
        int missing = t.length();
        int bestStart = 0;
        int left = 0;
        int bestLength = Integer.MAX_VALUE;
        int[] balance = new int[128];

        for(char c : t.toCharArray()) {
            balance[c]++;
        }

        for(int right = 0; right < s.length(); right++) {
            int incoming = s.charAt(right);

            if(balance[incoming] > 0) {
                missing--;
            }
            balance[incoming]--;

            while(missing == 0) {
                int window = right - left + 1;

                // System.out.println("window : " + window);
                if(window < bestLength) {
                    bestLength = window;
                    bestStart = left;
                }
                int outgoing = s.charAt(left);
                left++;
                balance[outgoing]++;
                if(balance[outgoing] > 0) {
                    missing++;
                }
            }
        }

        // System.out.println("bestStart : " + bestStart);
        // System.out.println("bestLength : " + bestLength);


        return bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLength);
        
    }
}
