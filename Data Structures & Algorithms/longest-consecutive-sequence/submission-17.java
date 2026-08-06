class Solution {
    public int longestConsecutive(int[] nums) {
        //convert nums list to set 
        //set tracks if num exist
        //longestStr tracks the longestStr
        //if element has element - 1, skip

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longestStr = 0;

        for(int num : nums) {
            int count = 1;
            if(numSet.contains(num - 1)) continue;

            int current = num;
            while(numSet.contains(current + 1)) {
                count++;
                current++;
            }
            longestStr = Math.max(longestStr, count);
        }
        // System.out.println(longestStr);

        return longestStr;
    
    }
}
