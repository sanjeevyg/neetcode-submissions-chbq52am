class Solution {
    public int lengthOfLongestSubstring(String s) {
        //use set to track the duplicate element 
        //left and right are the boundaries both start at 0
        //if duplicate found increase left until duplicate is found
        //remove elements in set as we go from left to right to the duplicate element 
        //Track max length 

        Set<Character> seen = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            // if(Character.isLetterOrDigit(s.charAt(right))) continue;
            char charAtRight = s.charAt(right);

            // System.out.println(seen.contains(charAtRight));
            if(seen.contains(charAtRight)) {
                while(seen.contains(charAtRight)) {
                    char charAtLeft = s.charAt(left);
                    seen.remove(charAtLeft);
                    left++;
                }
            }
            seen.add(charAtRight);
            int len = right - left + 1;
            maxLength = Math.max(len, maxLength);
        }
        return maxLength;
     }
    }