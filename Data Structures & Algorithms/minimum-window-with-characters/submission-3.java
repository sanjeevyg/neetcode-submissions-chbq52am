class Solution {
    public String minWindow(String s, String t) {
        int missing = t.length();
        int bestLength = Integer.MAX_VALUE;
        int left = 0;
        int[] balance = new int[128];
        int bestStart = 0;

        for(char c : t.toCharArray()) {
            balance[c]++;
        }


        for(int right = 0; right < s.length(); right++) {
            int incoming = s.charAt(right);
            // System.out.println("incoming : " + incoming);

            if(balance[incoming] > 0) {
                missing--;
            }
            balance[incoming]--;
            // System.out.println(Arrays.toString(balance));

            while(missing == 0) {
                int outgoing = s.charAt(left);
                int window = right - left + 1;
                if(window < bestLength) {
                    bestLength = window;
                    bestStart = left;
                }
                left++;
                balance[outgoing]++;

                if(balance[outgoing] > 0) {
                    missing++;
                }
            }
        }
        System.out.println(Arrays.toString(balance));


        return bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLength);

         
    }
}
