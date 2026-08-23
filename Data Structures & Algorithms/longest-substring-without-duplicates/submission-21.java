class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Use set to track the characters
        //Iterate string to count the maxLength
            //If duplicate character is found -> iterate from left until duplicate is found
            //Remove characters as we iterate

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            // int window = right - left;
            if(seen.contains(rightChar)) {
                while(seen.contains(rightChar)) {
                    char leftChar = s.charAt(left);
                    seen.remove(leftChar);
                    left++;
                }
            }
                seen.add(rightChar); 
                int window = right - left + 1;
                maxLength = Math.max(maxLength, window);
                // System.out.println(seen);
        }


        return maxLength;
     }
    }