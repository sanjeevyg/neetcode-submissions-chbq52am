class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            if(seen.contains(rightChar)) {
                while(seen.contains(rightChar)) {
                    char leftChar = s.charAt(left);
                    seen.remove(leftChar);
                    left++;
                }
            }

            seen.add(rightChar);
            int len = right - left + 1;
            maxLength = Math.max(maxLength, len);

            // System.out.println(rightChar);
        }

        return maxLength;
     }
    }