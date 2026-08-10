class Solution {
    public int characterReplacement(String s, int k) {
       int left = 0; 
       int maxFreq = 0;
       int maxLen = 0;
       Map<Character, Integer> freq = new HashMap<>();

       for(int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            freq.put(current, freq.getOrDefault(current, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(current));

            while(right - left + 1 - maxFreq > k) {
                 char charAtLeft = s.charAt(left);
                 freq.put(charAtLeft, freq.get(charAtLeft) - 1);
                 left++;
            }
            maxLen = Math.max(right - left + 1, maxLen);
       }
       return maxLen;
    }
}
