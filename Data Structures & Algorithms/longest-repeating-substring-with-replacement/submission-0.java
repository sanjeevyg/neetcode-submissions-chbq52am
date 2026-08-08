class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int left = 0;
        int maxLength = 0;

        Map<Character, Integer> freqTracker = new HashMap<>();


        for(int right = 0; right < s.length(); right++) {
            char charAtRight = s.charAt(right);
            freqTracker.put(charAtRight, freqTracker.getOrDefault(charAtRight, 0) + 1);

            maxFreq = Math.max(maxFreq, freqTracker.get(charAtRight));

            while(right - left + 1 - maxFreq > k) {
                char charAtLeft = s.charAt(left);
                freqTracker.put(charAtLeft, freqTracker.get(charAtLeft) - 1);
                left++;
            }
            maxLength = Math.max(right - left + 1, maxLength);
        }
        return maxLength;
    }
}
