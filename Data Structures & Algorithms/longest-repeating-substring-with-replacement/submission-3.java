class Solution {
    public int characterReplacement(String s, int k) {
        //iterate using left and right
        //right - left + 1 - maxfreq > k == true else left++
        //Use array to track maxFreq
        //maxLength = right - left + 1
        int left = 0;
        int[] count = new int[26];
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {
            int current = s.charAt(right) - 'A';
            maxFreq = Math.max(maxFreq, ++count[current]); 

            if(right - left + 1 - maxFreq > k) {
                char charAtLeft = s.charAt(left);
                count[charAtLeft - 'A']--;
                left++;
            }

        }
        return s.length() - left ;
    }
}
