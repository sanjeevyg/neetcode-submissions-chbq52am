class Solution {
    public int characterReplacement(String s, int k) {
        //window - maxFreq <= k
        int maxLength = 0;
        int maxFreq = 0;
        int left = 0;
        int[] arr = new int[128];

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            int window = right - left + 1;
            arr[rightChar]++;
            maxFreq = Math.max(maxFreq, arr[rightChar]);

            int leftChar = s.charAt(left);
            if(window - maxFreq > k) {
                arr[leftChar]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

            System.out.println(maxFreq);


        }


        return maxLength;
      
        
    }
}