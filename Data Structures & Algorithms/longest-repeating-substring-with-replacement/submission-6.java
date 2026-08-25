class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int[] freq = new int[128];
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            int rightChar = s.charAt(right);
            freq[rightChar]++;
            int window = right - left + 1;
            int maxFreq = Arrays.stream(freq).max().getAsInt();
            // System.out.println(window);

            if(window - maxFreq > k) {
                freq[s.charAt(left)]--;
                left++;
            } else {
                maxLength = Math.max(window, maxLength);

            }

            // System.out.println(Arrays.toString(arr));
        } 
        return maxLength;
        
    }
}